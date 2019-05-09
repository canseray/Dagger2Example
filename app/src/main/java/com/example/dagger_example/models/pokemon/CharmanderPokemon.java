package com.example.dagger_example.models.pokemon;

import com.example.dagger_example.models.Pokemon;
import com.example.dagger_example.models.SuperPowerState;

import javax.inject.Inject;

public class CharmanderPokemon implements Pokemon {

    SuperPowerState superPowerState;

    @Inject
    public CharmanderPokemon (SuperPowerState superPowerState){
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
