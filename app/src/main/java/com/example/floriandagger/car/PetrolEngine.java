package com.example.floriandagger.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;
    private int torque;

    @Inject
    public PetrolEngine(@Named("horse power")  int horsePower,@Named("torque")  int torque) {
        this.horsePower = horsePower;
        this.torque = torque;
    }

    @Override
    public void start() {
        Log.d(TAG, "petrol engine starts with \nhorsepower:  " + horsePower + "\ntorque: " + torque);
    }
}
