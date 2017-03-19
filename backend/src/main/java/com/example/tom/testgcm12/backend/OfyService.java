package com.example.tom.testgcm12.backend;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

/**
 * Objectify service wrapper so we can statically register our persistence classes
 * More on Objectify here : https://code.google.com/p/objectify-appengine/
 * 能夠將手持裝置的RID儲存在Google App Engine的Datastore雲端資料庫的類別，使用「Objectify」類別庫達成簡化程式碼的目的
 */
public class OfyService {

    static {
        ObjectifyService.register(RegistrationRecord.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}
