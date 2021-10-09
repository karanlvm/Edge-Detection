package com.example.imageprocessing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {
    // To check if OpenCV is loaded or not in Logcat
    private static String TAG = "MainActivity";
    static
    {
        if(OpenCVLoader.initDebug())
        {
            Log.d(TAG, "OpenCV installed");
        }
        else
        {
            Log.d(TAG, "OpenCv failed");
        }
    }

    private Button camera_button;
    private Button pro_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is to open up camera activity
        camera_button = findViewById(R.id.camera_button);
        camera_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivitycamera();
            }
        });

        // This is to open up the processed activity
        pro_button = findViewById(R.id.pro_button);
        pro_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openproactivity();
            }
        });
    }

    public void openactivitycamera() {
        Intent intent_1 = new Intent(this, CameraActivity.class);
        startActivity(intent_1);
    }

    public void openproactivity() {
        Intent intent_2 = new Intent(this, ProcessedActivity.class);
        startActivity(intent_2);
    }
}