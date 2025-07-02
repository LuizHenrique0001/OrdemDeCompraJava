package com.example.demo.Services;

import com.example.demo.Entitys.Product;
import com.example.demo.Enum.Category;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.Services.Exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(String id){
        Optional<Product> product = repository.findById(id);
        return product.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado"));
    }

    public Product save(Product product){
        return repository.insert(product);
    }

    public void delete(String id){
        repository.deleteById(id);
    }

}
