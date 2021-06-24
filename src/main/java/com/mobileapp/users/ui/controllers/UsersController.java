package com.mobileapp.users.ui.controllers;

import com.mobileapp.users.service.UsersService;
import com.mobileapp.users.shared.UserDto;
import com.mobileapp.users.ui.model.CreateUserRequestModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("/status")
    public String status(){
        return "working";
    }


    @PostMapping
    public String  createUser(@Valid @RequestBody CreateUserRequestModel userDetails){

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(userDetails, UserDto.class);
        usersService.createUser(userDto);
        return "Create User method is called...";
    }
}
