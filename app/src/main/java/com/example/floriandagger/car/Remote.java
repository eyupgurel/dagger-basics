package com.example.floriandagger.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";
    @Inject
    public Remote() {
    }
    void setListener(Car car){
        Log.d(TAG, "remote set on car");
    }
}
