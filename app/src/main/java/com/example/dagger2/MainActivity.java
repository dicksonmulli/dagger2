package com.example.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public NetworkApi(){
    }

    public boolean validateUser(String username, String password) {
        // imagine an actual network call here
        // for demo purpose return false in "real" life
        if (username == null || username.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
