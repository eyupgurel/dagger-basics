package com.example.floriandagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.floriandagger.car.Car;
import com.example.floriandagger.di.ActivityComponent;
import com.example.floriandagger.di.AppComponent;
import com.example.floriandagger.di.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car toyota1, toyota2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent activityComponent = DaggerActivityComponent.builder().
                horsePower(300).
                torque(700).
                appComponent(((ExampleApp) getApplication()).getAppComponent()).build();
        activityComponent.inject(this);

        toyota1.drive();
        toyota2.drive();
    }
}
