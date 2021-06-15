package com.example.demo.service;

import com.example.demo.Repository.CategoryRep;
import com.example.demo.model.Activity;
import com.example.demo.model.Category;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    CategoryRep categoryRep;

    public Category addCategory(Category category){
        return categoryRep.save(category);
    }

    public Category updateCategory(Category category){
        categoryRep.deleteById(category.getId());
        return categoryRep.save(category);
    }

    public void deleteCategory(Long id){
        categoryRep.deleteById(id);
    }

    public Optional<Category> findCategory(Long id){
        return categoryRep.findById(id);
    }

}
