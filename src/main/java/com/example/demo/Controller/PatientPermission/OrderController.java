package com.example.demo.Controller.PatientPermission;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/patient")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/get/order/{id}")
    public Optional<Order> findOrder(@PathVariable("id")Long id){
        return orderService.findOrder(id);
    }

    @PostMapping("/add/order")
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }
}
