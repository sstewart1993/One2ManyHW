package com.example.codeclan.One2ManyHW.controllers;

import com.example.codeclan.One2ManyHW.models.User;
import com.example.codeclan.One2ManyHW.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersRepo usersRepo;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(usersRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        return new ResponseEntity(usersRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> postFile(@RequestBody User user){
        usersRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
