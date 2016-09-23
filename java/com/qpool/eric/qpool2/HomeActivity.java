package com.qpool.eric.qpool2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    public Button loginbtn;
    public Button signupbtn;
    public void initLogin(){
        loginbtn = (Button)findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy = new Intent(HomeActivity.this, LoginPage.class);
                startActivity(toy);
            }
        });
    }
    public void initSignUp(){
        signupbtn = (Button)findViewById(R.id.signupbtn);

        signupbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent toy = new Intent(HomeActivity.this, SignUpPage.class);
                startActivity(toy);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF8000"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        initLogin();
        initSignUp();

    }
}
