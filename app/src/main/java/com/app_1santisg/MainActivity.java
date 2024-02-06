package com.app_1santisg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    boolean result=true;
    String name = "Santiago Sánchez Giraldo";
    int num = 17;
    float num7 = (float)0.4;
    char grade = 'A';
    byte b = 20;
    long num1 = 1234567;
    short no = 10;
    double pi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}