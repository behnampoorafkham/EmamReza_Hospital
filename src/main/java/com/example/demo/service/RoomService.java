package com.example.demo.service;

import com.example.demo.Repository.RoomRep;
import com.example.demo.model.Room;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomService {

    RoomRep roomRep;

    public Room addRoom(Room room){
        return roomRep.save(room);
    }

    public void deleteRoom(Long id){
        roomRep.deleteById(id);
    }

    public Optional<Room> findRoom(Long id){
        return roomRep.findById(id);
    }

}
