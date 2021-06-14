package com.example.demo.Repository;

import com.example.demo.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRep extends CrudRepository<Category,Long> {
}
