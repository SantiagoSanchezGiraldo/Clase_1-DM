package com.app_1santisg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    String Tag ="test";
    TextView NombreUser;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NombreUser = (TextView) findViewById(R.id.user);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.setOnClickListener(){
            @Override
            public void onClick(View view){
                NombreUser.setText("Se ha registrado");
            }
        });

        btn2.setOnClickListener(new View.setOnClickListener(){
            @Override
            public void onClick(View view){
                NombreUser.setText("Se ha Logeado");
            }
        });

        @Override
        protected void onStart(){
            super.onStart();
            Log.i(Tag, "Estoy en OnStart");
        }

        @Override
        protected void onPause(){
            super.onPause();
            Log.i(Tag, "Estoy en onPause");
        }

        @Override
        protected void onRestart(){
            super.onRestart();
            Log.i(Tag, "Estoy en onRestart");
        }

        @Override
        protected void onDestroy(){
            super.onDestroy();
            Log.i(Tag, "Estoy en onDestroy");
        }
    }
}