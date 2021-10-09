package com.example.imageprocessing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}