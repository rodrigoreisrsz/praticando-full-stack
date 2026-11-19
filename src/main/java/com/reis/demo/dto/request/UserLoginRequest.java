package com.reis.demo.dto.request;


import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequest {
    @Nullable
    private String email;
    @Nullable
    private String password;
}
