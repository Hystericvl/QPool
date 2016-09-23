package com.qpool.eric.qpool2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    public Button logonbtn;
    public void init() {
        logonbtn = (Button) findViewById(R.id.logonbtn);
        logonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(LoginPage.this, Options.class);
                startActivity(toy);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF8000"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        init();



    }
}
