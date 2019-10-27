package com.example.floriandagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.floriandagger.car.Car;
import com.example.floriandagger.di.ActivityComponent;
import com.example.floriandagger.di.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car toyota1, toyota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent activityComponent =  ((ExampleApp) getApplication()).getAppComponent().getActivityComponentBuilder().horsePower(1200).torque(4000).build();

        activityComponent.inject(this);

        toyota1.drive();
        toyota2.drive();
    }
}
