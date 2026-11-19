package com.reis.demo.service;

import com.reis.demo.dto.request.UserLoginRequest;
import com.reis.demo.dto.request.UserRequest;
import com.reis.demo.dto.response.UserResponse;
import com.reis.demo.entities.User;
import com.reis.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.validation.Valid;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserResponse cadastrar(@Valid UserRequest user){

        String nome = user.getName();
        String senha = user.getPassword();
        String email =  user.getEmail();

        User usuario = new User(nome, senha, email);
        User usuarioCreate = repository.save(usuario);
        return new UserResponse(usuarioCreate);

    }
    public UserResponse login (@Valid UserLoginRequest user){

    }
}
