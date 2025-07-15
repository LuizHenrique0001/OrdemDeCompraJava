package com.example.demo.Entitys;

import com.example.demo.DTO.ClientDto;
import com.example.demo.DTO.OrderItemDto;
import com.example.demo.Enum.OrderStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Order")
public class Order {

    @Id
    private String id;
    private Instant date;
    private OrderStatus orderStatus;
    private List<OrderItemDto> items = new ArrayList<>();

    private ClientDto client;

    public Order(String id, Instant date, OrderStatus orderStatus, ClientDto client) {
        this.id = id;
        this.date = date;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }
}
