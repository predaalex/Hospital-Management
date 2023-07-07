package com.cegeka.academy.bepatientshub4.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "is_available")
    private boolean isAvailable;

    @OneToOne
    @JoinColumn(name = "specialization_id")
    private Specialization specialization;

    public Room () {}

    public Room(Long id, int number, int capacity, boolean isAvailable, Specialization specialization) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
        this.specialization = specialization;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number=" + number +
                ", capacity=" + capacity +
                ", isAvailable=" + isAvailable +
                ", specialization=" + specialization +
                '}';
    }
}
