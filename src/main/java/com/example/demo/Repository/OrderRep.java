package com.example.demo.Repository;

import com.example.demo.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRep extends CrudRepository<Order,Long> {
}
