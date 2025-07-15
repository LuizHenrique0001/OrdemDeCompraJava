package com.example.demo.Services;

import com.example.demo.Entitys.Order;
import com.example.demo.Repositories.OrderRepository;
import com.example.demo.Services.Exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(String id){
        Optional<Order> order = repository.findById(id);
        return order.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado"));
    }

    public Order save(Order order){
        return repository.insert(order);
    }

    public void delete(String id){
        repository.deleteById(id);
    }

}
