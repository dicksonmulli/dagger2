package com.example.dagger2.network;

import javax.inject.Inject;

public class NetworkApi {
    @Inject
    public NetworkApi(){
    }

    public boolean validateUser(String username, String password) {

        // an actual network call here
        // return false in "real" life
        if (username == null || username.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
