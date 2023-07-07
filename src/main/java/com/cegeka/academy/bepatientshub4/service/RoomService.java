package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.dto.RoomOccupancy;
import com.cegeka.academy.bepatientshub4.entity.Room;

import java.util.List;

public interface RoomService {
    RoomOccupancy getOccupancyLevel();

    List<Room> getAllRooms();
}
