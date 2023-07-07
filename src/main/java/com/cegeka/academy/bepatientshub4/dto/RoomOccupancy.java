package com.cegeka.academy.bepatientshub4.dto;

public class RoomOccupancy {
    private long totalRooms;

    private long fullRooms;

    public RoomOccupancy() {}

    public RoomOccupancy(long totalRooms, long fullRooms) {
        this.totalRooms = totalRooms;
        this.fullRooms = fullRooms;
    }

    public long getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(long totalRooms) {
        this.totalRooms = totalRooms;
    }

    public long getFullRooms() {
        return fullRooms;
    }

    public void setFullRooms(long fullRooms) {
        this.fullRooms = fullRooms;
    }

    @Override
    public String toString() {
        return "RoomOccupancy{" +
                "totalRooms=" + totalRooms +
                ", fullRooms=" + fullRooms +
                '}';
    }
}
