package com.example.productservice.controllers;

import com.example.productservice.models.Category;
import com.example.productservice.models.Product;
import com.example.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping(path = "/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping(path = "/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
       return productService.getProduct(id);
    }


//    @PostMapping()
//    public Product addProduct(@RequestBody body) {
//        return productService.getProduct(id);
//    }

    @PatchMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id) {
        Product product = new Product();
        product.setTitle("Godrej Beer");
        product.setId(id);
        product.setDescription("Fantastic Beer");
        product.setImageUrl("https://thumbs.dreamstime.com/b/bottles-famous-global-beer-brands-poznan-pol-mar-including-heineken-becks-bud-miller-corona-stella-artois-san-miguel-143170474.jpg");
        return productService.replaceProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {

    }


}
