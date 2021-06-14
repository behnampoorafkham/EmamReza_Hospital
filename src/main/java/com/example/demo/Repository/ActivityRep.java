package com.example.demo.Repository;

import com.example.demo.model.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRep extends CrudRepository<Activity,Long> {
}

