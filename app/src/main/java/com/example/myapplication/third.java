package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button butt5=(Button)findViewById(R.id.login_btn);
        Button butt6=(Button)findViewById(R.id.goback_btn);

        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int5= new Intent(third.this,four.class);
                startActivity(int5);
            }
        });

        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int6= new Intent(third.this,MainActivity.class);
                startActivity(int6);
            }
        });
    }
}