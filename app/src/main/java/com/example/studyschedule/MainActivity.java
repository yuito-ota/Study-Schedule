package com.example.studyschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLogActivity(View view) {
        Intent toLog= new Intent(this,LogActivity.class);
        startActivity(toLog);
    }

    public void goToNormalActivity(View view) {
        Intent toNomal = new Intent(this, NormalActivity.class);
        startActivity(toNomal);
    }

    public void goToMechanismActivity(View view) {
        Intent toMechanism = new Intent(this,MechanismActivity.class);
        startActivity(toMechanism);
    }

    public void goToHandleActivity(View view) {
        Intent toHandle = new Intent(this,HandleActivity.class);
        startActivity(toHandle);
    }
}
