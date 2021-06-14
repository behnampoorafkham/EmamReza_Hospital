package com.example.demo.service;

import com.example.demo.Repository.RoomRep;
import com.example.demo.model.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    RoomRep roomRep;

    public Room addRoom(Room room){
        return roomRep.save(room);
    }

    public void deleteRoom(Long id){
        roomRep.deleteById(id);
    }

    public void findRoom(Long id){
        roomRep.findById(id);
    }

}
