package com.example.tom.testgcm12;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by TOM on 2017/3/16.
 */

public class MyGcmListenerService extends GcmListenerService {
    @Override
    public void onMessageReceived(String s, Bundle bundle) {
        super.onMessageReceived(s, bundle);
        Log.d("MyGcmListenerService", "From "+s);
        Log.d("MyGcmListenerService", "Message "+
                bundle.getString("message"));
        String message = bundle.getString("message");
        Log.e("MESSAGE",message);

 
    }
}
