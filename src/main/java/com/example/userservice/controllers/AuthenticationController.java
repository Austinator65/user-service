package com.example.userservice.controllers;


import com.example.userservice.model.AppUser;
import com.example.userservice.model.RegistrationDTO;
import com.example.userservice.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;


    @PostMapping("/register")
    public AppUser registerUser(@RequestBody RegistrationDTO body){

        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

}
