package com.example.demo.Controller.HospitalControl;

import com.example.demo.model.Room;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("/add")
    public Room add(@RequestBody Room room){
        return roomService.addRoom(room);
    }

    @GetMapping("/get/{id}")
    public Optional<Room> find(@PathVariable("id")Long id){
        return roomService.findRoom(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        roomService.deleteRoom(id);
    }
}
