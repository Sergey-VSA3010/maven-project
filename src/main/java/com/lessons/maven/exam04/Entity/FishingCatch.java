package com.lessons.maven.exam04.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_fishing_catch")
public class FishingCatch {
    // @ManyToOne
//    @JoinTable(name = "tb_catches_trips",
//            joinColumns = @JoinColumn(name = "catches",nullable = false)
//            ,inverseJoinColumns = @JoinColumn(name = "trips"))
//    private List<FishingTrip> tripsList;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fish_type", nullable = false)
    private String fishType;
    @Column(name = "weight", nullable = false)
    private Long weight;//вес

    public FishingCatch() {
    }

    public FishingCatch(String fishType, Long weight) {
        this.fishType = fishType;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
