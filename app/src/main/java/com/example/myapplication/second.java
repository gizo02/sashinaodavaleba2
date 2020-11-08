package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button butt3=(Button)findViewById(R.id.registration_btn);
        Button butt4=(Button)findViewById(R.id.goback_btn);

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int3= new Intent(second.this,third.class);
                startActivity(int3);
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int4= new Intent(second.this,MainActivity.class);
                startActivity(int4);
            }
        });
    }
}