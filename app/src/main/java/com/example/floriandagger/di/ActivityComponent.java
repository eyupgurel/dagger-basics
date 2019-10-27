package com.example.floriandagger.di;

import com.example.floriandagger.MainActivity;
import com.example.floriandagger.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@Activity
@Subcomponent( modules={WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    void inject(MainActivity mainActivity);

    /*
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder torque(@Named("torque") int torque);
        Builder appComponent(AppComponent component);
        ActivityComponent build();
    }

     */
}
