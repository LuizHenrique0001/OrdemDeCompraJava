package com.example.demo.DTO;

import com.example.demo.Entitys.User;

public class ClientDto {

    private String id;
    private String name;
    private String email;

    public ClientDto(){}

    public ClientDto(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
