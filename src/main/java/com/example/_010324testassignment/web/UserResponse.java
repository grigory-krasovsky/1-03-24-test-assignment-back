package com.example._010324testassignment.web;

import com.example._010324testassignment.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class UserResponse {
    private Long id;
    private String username;
    private String password;
    private List<Role> role;
    boolean active;
}
