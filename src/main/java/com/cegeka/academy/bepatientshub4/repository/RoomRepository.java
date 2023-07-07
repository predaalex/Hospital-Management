package com.cegeka.academy.bepatientshub4.repository;

import com.cegeka.academy.bepatientshub4.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
    long countByIsAvailable(boolean b);
}
