package com.qpool.eric.qpool2;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUpPage extends AppCompatActivity {

   /* public Button profilebtn = (Button) findViewById(R.id.uploadbtn); // Replace with id of your button.
    public void init() {
        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                final int ACTIVITY_SELECT_IMAGE = 1234;
                startActivityForResult(i, ACTIVITY_SELECT_IMAGE);
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode) {
            case 1234:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = data.getData();
                    String[] filePathColumn = {MediaStore.Images.Media.DATA};

                    Cursor cursor = getContentResolver().query(selectedImage, filePathColumn, null, null, null);
                    cursor.moveToFirst();

                    int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
                    String filePath = cursor.getString(columnIndex);
                    cursor.close();


                    Bitmap yourSelectedImage = BitmapFactory.decodeFile(filePath);
            *//* Now you have choosen image in Bitmap format in object "yourSelectedImage". You can use it in way you want! *//*
                }
        }

    };*/
/*   public class ToggleableRadioButton extends RadioButton {
       // Implement necessary constructors

       @Override
       public void toggle() {
           if(isChecked()) {
               if(getParent() instanceof RadioGroup) {
                   ((RadioGroup)getParent()).clearCheck();
               }
           } else {
               setChecked(true);
           }
       }
   }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF8000"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);




    }
}
