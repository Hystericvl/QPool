package com.qpool.eric.qpool2;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class IDrive2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idrive2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


    }


    public void onSearch(View view) {
        EditText location_tf = (EditText) findViewById(R.id.toLocation);
        String location = location_tf.getText().toString();
        List<android.location.Address> addressList = null;
        if (location != null || !location.equals("")) {
            Geocoder geocoder = new Geocoder(this);
            try {
                addressList = geocoder.getFromLocationName(location, 1);
            } catch (IOException e) {
                e.printStackTrace();
            }

            android.location.Address address = addressList.get(0);

            LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        }


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMyLocationEnabled(true);

       /* buildGoogleApiClient();
        mGoogleApiClient.connect();*/

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }

    /*
      protected synchronized void buildGoogleApiClient(){
          Toast.makeText(this, "buildGoogleApiClient", Toast.LENGTH_SHORT).show();
          mGoogleApiClient = new GoogleApiClient.Builder(this)
                  .addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks) this)
                  .addOnConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener) this)
                  .addApi(LocationServices.API)
                  .build();
      }


    @Override
      public void onConnected(Bundle bundle) {
          Toast.makeText(this,"onConnected",Toast.LENGTH_SHORT).show();
          Location mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                  mGoogleApiClient);
          if (mLastLocation != null) {
              //place marker at current position
              //mGoogleMap.clear();
              latLng = new LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude());
              MarkerOptions markerOptions = new MarkerOptions();
              markerOptions.position(latLng);
              markerOptions.title("Current Position");
              markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
              currLocationMarker = mGoogleMap.addMarker(markerOptions);
          }

          mLocationRequest = new LocationRequest();
          mLocationRequest.setInterval(5000); //5 seconds
          mLocationRequest.setFastestInterval(3000); //3 seconds
          mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
          //mLocationRequest.setSmallestDisplacement(0.1F); //1/10 meter

          LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);



      }

      @Override
      public void onLocationChanged(Location location) {

          //place marker at current position
          //mGoogleMap.clear();
          if (currLocationMarker != null) {
              currLocationMarker.remove();
          }
          latLng = new LatLng(location.getLatitude(), location.getLongitude());
          MarkerOptions markerOptions = new MarkerOptions();
          markerOptions.position(latLng);
          markerOptions.title("Current Position");
          markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));
          currLocationMarker = mGoogleMap.addMarker(markerOptions);

          Toast.makeText(this,"Location Changed",Toast.LENGTH_SHORT).show();

          //zoom to current position:
          CameraPosition cameraPosition = new CameraPosition.Builder()
                  .target(latLng).zoom(14).build();

          mMap.animateCamera(CameraUpdateFactory
                  .newCameraPosition(cameraPosition));

          //If you only need one location, unregister the listener
          //LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);

      }

  }*/
    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "IDrive2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.qpool.eric.qpool2/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "IDrive2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.qpool.eric.qpool2/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
