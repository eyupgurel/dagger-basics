package com.example.floriandagger.car;

import android.util.Log;

import com.example.floriandagger.di.Activity;

import javax.inject.Inject;
@Activity
public class Car {
    private static final String TAG = "Car";
    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }


    public void drive(){
        engine.start();
        Log.d(TAG,  driver + " " + driver.name + " drives " + this);
    }
}
