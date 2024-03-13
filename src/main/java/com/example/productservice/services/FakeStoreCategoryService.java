package com.example.productservice.services;

import com.example.productservice.models.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreCategoryService implements CategoryService{
    @Override
    public Category getCategory(Long id) {
        return null;
    }

    @Override
    public List<Category> getCategories() {
        return null;
    }
}
