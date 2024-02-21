package com.security.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.security.user.domain.UserEntity;
import com.security.user.service.UserService;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String getSecuredMessage() {
        return "Hello World";
    }

    @GetMapping("/index2")
    public String getMessage() {
        return "Hello World NOT SECURED";
    }

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody UserEntity user) {
        try {
            userService.createUser(user);
            return ResponseEntity.ok().body("New user created");
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
        try {
            userService.deleteUser(id);
            return ResponseEntity.ok().body("User deleted with id: " + id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/user")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

}
