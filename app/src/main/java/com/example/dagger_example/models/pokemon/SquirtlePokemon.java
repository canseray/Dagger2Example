package com.example.dagger_example.models.pokemon;

import com.example.dagger_example.models.Pokemon;
import com.example.dagger_example.models.SuperPowerState;

import javax.inject.Inject;

public class SquirtlePokemon implements Pokemon {

    SuperPowerState superPowerState;

    @Inject
    public SquirtlePokemon(SuperPowerState superPowerState){
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
}
