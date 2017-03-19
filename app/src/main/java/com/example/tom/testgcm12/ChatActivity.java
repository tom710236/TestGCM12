package com.example.tom.testgcm12;

import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {
    //推播的Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
            //點擊推播的Activity後執行
            //初始化Notification Manager
             NotificationManager gNotMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
             //清除所有的通知內容
             gNotMgr.cancelAll();
    }


}
/**
 專案 ID　<application>chrome-unity-161705</application>
 chrome-unity-161705
 專案編號 Sender id
 193542323670
 金鑰 gcm.api.key
 AIzaSyAuB3CibbNRYS5BOQjJY49FBhtFoysHGIk
 */
