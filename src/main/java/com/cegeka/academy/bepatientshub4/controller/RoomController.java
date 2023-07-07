package com.cegeka.academy.bepatientshub4.controller;

import com.cegeka.academy.bepatientshub4.dto.RoomOccupancy;
import com.cegeka.academy.bepatientshub4.entity.Room;
import com.cegeka.academy.bepatientshub4.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/be-patient")
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "/rooms/occupancy")
    public RoomOccupancy getOccupancy() {
        return roomService.getOccupancyLevel();
    }

    @GetMapping(value = "/rooms")
    public List<Room> getRooms() {
        return roomService.getAllRooms();
    }
}
