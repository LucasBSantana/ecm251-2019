package com.example.pratica15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    public void mandarMsg(String msg) {
        Log.d("CASAL NARDONI", msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mandarMsg("Veio do OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        mandarMsg("Veio do OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mandarMsg("Veio do OnResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mandarMsg("Veio do OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mandarMsg("Veio do OnDestroy()");
    }






}
