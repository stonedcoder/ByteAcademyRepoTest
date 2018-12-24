package com.thekirankumar.youtubeauto.application;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by kiran.kumar on 24/01/18.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().name("db.realm").build();
        Realm.setDefaultConfiguration(config);
    }
}
