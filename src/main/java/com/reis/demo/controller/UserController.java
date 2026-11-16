package com.reis.demo.controller;

import com.reis.demo.dto.request.UserRequest;
import com.reis.demo.dto.response.UserResponse;
import com.reis.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserResponse> cadastrar(@RequestBody @Valid UserRequest userCreate){
        UserResponse response = service.cadastrar(userCreate);
        return ResponseEntity.ok(response);
    }


}
