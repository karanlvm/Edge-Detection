package com.example.compvis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button camera_button;
    private Button pro_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    camera_button = findViewById(R.id.camera_button);
    camera_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openactivity1();
        }
    });

    pro_button = findViewById(R.id.pro_button);
    pro_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openactivity2();
        }
    });
}

    public void openactivity1(){
        Intent intent_1 = new Intent(this, RawActivity.class);
        startActivity(intent_1);
    }

    public void openactivity2(){
        Intent intent_2 = new Intent(this, ProActivity.class);
        startActivity(intent_2);
    }
}