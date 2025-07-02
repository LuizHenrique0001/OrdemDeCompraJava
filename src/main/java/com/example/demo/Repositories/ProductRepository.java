package com.example.demo.Repositories;

import com.example.demo.Entitys.Product;
import com.example.demo.Enum.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
