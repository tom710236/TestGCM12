package com.example.tom.testgcm12;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by TOM on 2017/3/16.
 * 雲端推播訊息傾聽服務
 */

public class MyGcmListenerService extends GcmListenerService {
    String message;
    int today;
    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onMessageReceived(String s, Bundle bundle) {
        super.onMessageReceived(s, bundle);
        //推播的Sender id
        Log.d("MyGcmListenerService", "From "+s);
        //推播訊息的值
        Log.d("MyGcmListenerService", "Message "+
                bundle.getString("message"));
        message = bundle.getString("message");
        Log.e("MESSAGE",message);
        //time();
        //推播圖示
        makeNotification();


    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void makeNotification() {
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        Bitmap bmp = BitmapFactory
                .decodeResource(getResources(), R.drawable.pig64);
        Notification.BigPictureStyle big =
                new Notification.BigPictureStyle();
        big.bigPicture(
                BitmapFactory.decodeResource(getResources(), R.drawable.pig256))
                .setSummaryText("bla bla bla");
        Intent intent = new Intent(this, ChatActivity.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent = stackBuilder.getPendingIntent(
                0, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.pig32)
                .setContentTitle("推播提醒")
                .setContentText(message)
                .setContentInfo("")
                .setContentIntent(pendingIntent)
                .setWhen(System.currentTimeMillis())
                .build();
        NotificationManager manager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(1, notification);

        //Log.e("INT", String.valueOf(1));


    }
    /*
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void time(){
        Calendar mCal = Calendar.getInstance();
        String dateformat = "ss";
        SimpleDateFormat df = new SimpleDateFormat(dateformat);
        today = Integer.parseInt(df.format(mCal.getTime()));
    }
    */
}
