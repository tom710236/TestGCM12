package com.example.tom.testgcm12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SystemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
    }

    public void onClick (View v){
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
