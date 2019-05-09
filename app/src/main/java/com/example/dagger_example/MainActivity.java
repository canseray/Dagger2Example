package com.example.dagger_example;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger_example.models.Pokemon;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject
    Pokemon pokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inject();

        pokemon.attack();
        pokemon.defend();
    }

    private void inject(){

        Dagger2Application app = (Dagger2Application) getApplication();

        app.getAppComponent().inject(this);
    }
}

//console: pikachu attack-use super power ,  defend-storing super power