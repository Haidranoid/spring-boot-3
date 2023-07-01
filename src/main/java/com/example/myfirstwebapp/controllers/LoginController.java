package com.example.myfirstwebapp.controllers;

import com.example.myfirstwebapp.services.AuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {
    //private Logger logger = LoggerFactory.getLogger(getClass());
    private AuthenticationService authenticationService;

    @Autowired
    public LoginController(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(ModelMap model) {
        //logger.debug("Request param is {}", name);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String getWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {

        if (authenticationService.authenticate(name, password)) {
            modelMap.put("name", name);
            modelMap.put("password", password);

            return "hello";
        }
        modelMap.put("errorMessage", "Invalid Credentials");
        return "login";
    }
}
