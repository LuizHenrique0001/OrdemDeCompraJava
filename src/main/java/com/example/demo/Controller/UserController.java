package com.example.demo.Controller;

import com.example.demo.DTO.ClientDto;
import com.example.demo.DTO.UserDto;
import com.example.demo.Entitys.Order;
import com.example.demo.Entitys.User;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<ClientDto>> findAll(){
        List<User> listUser = service.findAll();
        List<ClientDto> users = listUser.stream().map(x-> new ClientDto(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id){
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }
    @GetMapping("/{id}/orders")
    public ResponseEntity<List<Order>> findByOrderFromId(@PathVariable String id){
        User user = service.findById(id);
        return ResponseEntity.ok().body(user.getOrders());
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user){
        return ResponseEntity.status(201).body(service.save(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> update(@PathVariable String id, @RequestBody UserDto userDto){
        service.update(id, userDto);
        return ResponseEntity.accepted().build();
    }

}
