package com.example.myfirstwebapp.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidUser = username.equalsIgnoreCase("troye");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidUser && isValidPassword;
    }
}
