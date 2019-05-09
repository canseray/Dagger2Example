package com.example.dagger_example;

import android.app.Application;

import com.example.dagger_example.injector.AppComponent;
import com.example.dagger_example.injector.AppModule;

public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        initInjector();
    }

    public void initInjector(){

        appComponent = DaggerAppComponent.builder()
                                        .appModule(new AppModule(this))
                                        .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
