package com.reis.demo.dto.request;

import jakarta.annotation.Nullable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private Long id;
    @Nullable
    private String name;
    @Nullable
    private String email;
    @Nullable
    private String password;
}
