package com.example.floriandagger.di;
import com.example.floriandagger.car.Engine;
import com.example.floriandagger.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
   @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);
}
