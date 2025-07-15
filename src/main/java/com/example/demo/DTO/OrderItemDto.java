package com.example.demo.DTO;

import com.example.demo.Entitys.Product;

public class OrderItemDto {

    private String id;
    private String name;
    private Integer quantity;
    private Double price;

    public OrderItemDto(){}

    public OrderItemDto(Product product, Integer quantity){
        this.id = product.getId();
        this.name = product.getName();
        this.quantity = quantity;
        this.price = product.getPrice();
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
