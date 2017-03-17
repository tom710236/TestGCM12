package com.example.tom.testgcm12;

import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        //初始化Notification Manager
             NotificationManager gNotMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
             //清除所有的通知內容
             gNotMgr.cancelAll();
    }


}
