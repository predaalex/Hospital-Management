package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.dto.RoomOccupancy;
import com.cegeka.academy.bepatientshub4.entity.Room;
import com.cegeka.academy.bepatientshub4.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    @Override
    public RoomOccupancy getOccupancyLevel() {
        long totalRooms = roomRepository.count();
        long fullRooms = roomRepository.countByIsAvailable(false);
        return new RoomOccupancy(totalRooms, fullRooms);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
