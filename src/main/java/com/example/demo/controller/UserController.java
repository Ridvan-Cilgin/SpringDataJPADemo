package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User userReturned = userService.saveUser(user);
        return ResponseEntity.ok(userReturned);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> userList = userService.getAllUser();
        return ResponseEntity.ok(userList);
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<User>> getUserByName(@PathVariable("name") String name) {
        List<User> userList = userService.getUserByName(name);
        return ResponseEntity.ok(userList);
    }
}


