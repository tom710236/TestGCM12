package com.example.tom.testgcm12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
        /**查詢手機IMEI
         * 用模擬器會當機
         * TelephonyManager mTelManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
         String IMEI = mTelManager.getDeviceId();
         String IMSI = mTelManager.getSubscriberId();
         TextView textView = (TextView)findViewById(R.id.textView);
         textView.setText(IMEI);
         */




    }
}
