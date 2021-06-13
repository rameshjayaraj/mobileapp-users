package com.mobileapp.users.ui.controllers;

import com.mobileapp.users.ui.model.CreateUserRequestModel;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status")
    public String status(){
        return "working";
    }


    @PostMapping
    public String  createUser(@Valid @RequestBody CreateUserRequestModel userDetails){
        return "Create User method is called...";
    }
}
