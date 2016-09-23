package com.qpool.eric.qpool2;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UpRides extends AppCompatActivity {

    private String[] monthsArray = {"Bill Emerson", "Sean Carter", "Anderson Paak", "Woodgate", "Sabrina the Teenage Witch", "Alicia Keys",
            "Lil Yatchy", "Bruce Wayne", "Gandolf", "Michael Kor", "Calvin Klein", "Ralph Lauren"};

    private ListView monthsListView;
    private ArrayAdapter arrayAdapter;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uprides);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF8000"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        monthsListView = (ListView) findViewById(R.id.listView);

        // this-The current activity context.
        // Second param is the resource Id for list layout row item
        // Third param is input array

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, monthsArray);
        monthsListView.setAdapter(arrayAdapter);
    }
}