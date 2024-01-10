package com.lessons.maven.exam04.Entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "tb_crew_member")

public class CrewMember {
    @ManyToMany
    @JoinTable(name = "tb_members_trip",
            joinColumns = @JoinColumn(name = "members_id",nullable = false)
            ,inverseJoinColumns = @JoinColumn(name = "trips_id"))
    private List<FishingTrip> tripsList;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false,length = 50)
    private String name;
    @Column(name = "address",nullable = false,length = 100)
    private String address;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "member_position",nullable = false)
    private Position position;

    public CrewMember() {
    }

    public CrewMember(String name, String address, Position position) {
        this.name = name;
        this.address = address;
        this.position = position;
    }

    public enum Position{
     CAPITAN,BOATMAN,SEAMAN
 }

    public List<FishingTrip> getTripsList() {
        return tripsList;
    }

    public void setTripsList(List<FishingTrip> tripsList) {
        this.tripsList = tripsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
