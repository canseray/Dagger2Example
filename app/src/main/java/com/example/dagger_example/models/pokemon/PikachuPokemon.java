package com.example.dagger_example.models.pokemon;

import com.example.dagger_example.models.Pokemon;
import com.example.dagger_example.models.SuperPowerState;

import javax.inject.Inject;

public class PikachuPokemon implements Pokemon {

    SuperPowerState superPowerState;

    @Inject
    public PikachuPokemon(SuperPowerState superPowerState){
        this.superPowerState = superPowerState;
    }

    @Override
    public void attack() {
        superPowerState.usePower();
    }

    @Override
    public void defend() {
        superPowerState.storingPower();
    }

    // pikachu is a pokemon. this not change  -> implements Pokemon
    // each pokemon has a superpower but changeable (electric,fire,water)-> Inject SuperPowerState

}
