package com.example.demo.Controller.HospitalControl;


import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/add")
    public Order add(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @GetMapping("/get/{id}")
    public Optional<Order> find(@PathVariable("id")Long id){
        return orderService.findOrder(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        orderService.deleteOrder(id);
    }
}
