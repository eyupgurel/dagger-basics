package com.example.floriandagger.di;
import com.example.floriandagger.car.DieselEngine;
import com.example.floriandagger.car.Engine;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
   private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }
    @Provides  Engine provideEngine(DieselEngine dieselEngine){
        return dieselEngine;
    }
}
