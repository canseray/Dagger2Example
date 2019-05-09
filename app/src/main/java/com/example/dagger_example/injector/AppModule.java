package com.example.dagger_example.injector;


import com.example.dagger_example.Dagger2Application;
import com.example.dagger_example.models.Pokemon;
import com.example.dagger_example.models.SuperPowerState;
import com.example.dagger_example.models.pokemon.PikachuPokemon;
import com.example.dagger_example.models.type.ElectricPower;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application){
        this.dagger2Application = dagger2Application;

    }

    @Provides
    @Singleton
    Dagger2Application provideApp(){
        return dagger2Application;
    }

    @Provides
    @Singleton
    SuperPowerState provideSuperPowerState(){
        return new ElectricPower();

    }

    @Provides
    @Singleton
    Pokemon providePokemon (SuperPowerState superPowerState){
        return new PikachuPokemon(superPowerState);
    }


    // i choose pikachu, pikachu use electricpower
}

