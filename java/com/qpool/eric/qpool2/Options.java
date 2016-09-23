package com.qpool.eric.qpool2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Options extends AppCompatActivity {
    public Button drivebtn;
    public Button pickupbtn;

    public void initDrive() {
        drivebtn = (Button) findViewById(R.id.drivebtn);
        drivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Options.this, IDrive2.class);
                startActivity(toy);
            }
        });
    }

    public void initRide() {
        pickupbtn = (Button) findViewById(R.id.pickupbtn);
        pickupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Options.this, UpRides.class);
                startActivity(toy);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF8000"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        initDrive();
        initRide();


    }
}
