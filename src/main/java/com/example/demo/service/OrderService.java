package com.example.demo.service;

import com.example.demo.Repository.OrderRep;
import com.example.demo.model.Activity;
import com.example.demo.model.Order;
import com.example.demo.model.persons.Nurse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    OrderRep orderRep;

    public Order addOrder(Order order){


        // increase doctor salary
        double sum = 0;
        for (Activity item:order.getActivities()){
            sum+=item.getPrice()*0.8;
        }
        order.getDoctor_id().setSalary(order.getDoctor_id().getSalary()+sum);


        // increase nurse salary
        for (Nurse item : order.getNurses()){
            item.setSalary(item.getSalary()+1500);
        }


        return orderRep.save(order);
    }

    public Order updateOrder(Order order){
        orderRep.deleteById(order.getId());
        return orderRep.save(order);
    }


    public void deleteOrder(Long id){
        orderRep.deleteById(id);
    }

    public Optional<Order> findOrder(Long id){
       return orderRep.findById(id);
    }

}
