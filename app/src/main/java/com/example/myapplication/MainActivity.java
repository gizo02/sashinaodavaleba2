package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt1=(Button)findViewById(R.id.but1);
        Button butt2=(Button)findViewById(R.id.but2);


        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this,second.class);
                startActivity(int1);
            }
        });


        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this,third.class);
                startActivity(int2);
            }
        });
    }
}