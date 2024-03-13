package com.example.productservice.services;

import com.example.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Long id);
    List<Product> getProducts();
    Product addProduct();
    Product replaceProduct(Long id, Product product);
    void deleteProduct(Long id);

}
