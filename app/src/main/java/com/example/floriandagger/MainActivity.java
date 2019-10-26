package com.example.floriandagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.floriandagger.car.Car;
import com.example.floriandagger.car.DieselEngine;
import com.example.floriandagger.car.Engine;
import com.example.floriandagger.di.CarComponent;
import com.example.floriandagger.di.DaggerCarComponent;
import com.example.floriandagger.di.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car toyota, alfaRomeo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent= DaggerCarComponent.builder().horsePower(150).torque(400).build();
        carComponent.inject(this);

        toyota.drive();
        alfaRomeo.drive();
    }
}
