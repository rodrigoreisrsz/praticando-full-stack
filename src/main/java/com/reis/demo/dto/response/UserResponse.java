package com.reis.demo.dto.response;


import com.reis.demo.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private Long id;
    private String email;



    public UserResponse(){
    }

    public UserResponse(User user) {
       this.email = user.getEmail();
    }

}
