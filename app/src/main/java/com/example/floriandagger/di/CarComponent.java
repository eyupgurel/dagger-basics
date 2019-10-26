package com.example.floriandagger.di;

import com.example.floriandagger.MainActivity;
import com.example.floriandagger.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
@Singleton
@Component(modules={WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder torque(@Named("torque") int torque);
        CarComponent build();
    }
}
