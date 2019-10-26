package com.example.floriandagger;

import android.app.Application;

import com.example.floriandagger.di.AppComponent;
import com.example.floriandagger.di.DaggerAppComponent;

public class ExampleApp extends Application {

   private AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }
    public AppComponent getAppComponent(){
        return appComponent;
    }

}
