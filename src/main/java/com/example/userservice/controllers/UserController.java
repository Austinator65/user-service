package com.example.userservice.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("/*")
public class UserController {

    @GetMapping()
    public String userCont(){
        return "User level";
    }
}
