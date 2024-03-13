package com.example.productservice.services;

import com.example.productservice.models.Category;

import java.util.List;

public interface CategoryService {
    Category getCategory(Long id);
    List<Category> getCategories();
}
