package com.example.demo.service;

import com.example.demo.Repository.CategoryRep;
import com.example.demo.model.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    CategoryRep categoryRep;

    public Category addCategory(Category category){
        return categoryRep.save(category);
    }

    public void deleteCategory(Long id){
        categoryRep.deleteById(id);
    }

    public void findCategory(Long id){
        categoryRep.findById(id);
    }

}
