package com.example.floriandagger.di;

import com.example.floriandagger.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={DriverModule.class})
public interface AppComponent {
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}
