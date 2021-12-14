package com.example.rest_springboot_project.model;

import lombok.Data;

@Data
public class Client {
    private Integer id;
    private String name;
    private String email;
    private String phone;
}
