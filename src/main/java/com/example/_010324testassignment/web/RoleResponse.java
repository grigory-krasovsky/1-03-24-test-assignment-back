package com.example._010324testassignment.web;

import com.example._010324testassignment.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RoleResponse {
    private Long id;
    private Role displayName;
}
