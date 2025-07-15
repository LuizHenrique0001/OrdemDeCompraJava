package com.example.demo.DTO;

import com.example.demo.Entitys.Product;

public class ProductDto {

    private String idProduct;
    private String nameProduct;
    private Double priceProduct;

    public ProductDto(){}

    public ProductDto(Product product){
        this.idProduct = product.getId();
        this.nameProduct = getNameProduct();
        this.priceProduct = getPriceProduct();
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }
}
