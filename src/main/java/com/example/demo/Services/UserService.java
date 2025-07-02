package com.example.demo.Services;

import com.example.demo.DTO.UserDto;
import com.example.demo.Entitys.User;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Services.Exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findByStatus(true);
    }

    public User findById(String id){
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado"));
    }

    public User save(User user){
        return repository.insert(user);
    }

    public User fromDTO(UserDto userDto){
       return repository.insert(new User(null, userDto.getName(), userDto.getEmail(), userDto.getPhone(), userDto.getPassword(), true));
    }

    public void update(String id, UserDto userDto){
        User userOrigin = findById(id);
        userOrigin.setName(userDto.getName());
        userOrigin.setEmail(userDto.getEmail());
        userOrigin.setPhone(userDto.getPhone());
        repository.save(userOrigin);
    }

    public void delete(String id){
        User user = findById(id);
        user.setStatus(false);
        repository.save(user);
    }



}
