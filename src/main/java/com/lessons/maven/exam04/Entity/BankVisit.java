package com.lessons.maven.exam04.Entity;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;

@Entity

@Table(name = "tb_bank_visit")
public class BankVisit {
//    @ManyToMany
//    @JoinTable(name = "tb_visits_trips",
//            joinColumns = @JoinColumn(name = "visits",nullable = false)
//            ,inverseJoinColumns = @JoinColumn(name = "trips"))
//    private List<FishingTrip> tripsList;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "arrival_date",nullable = false)
    private LocalDate arrivalDate;
    @Column(name = "departure_date",nullable = false)
    private LocalDate departureDate;
    @Enumerated(value = EnumType.STRING)
    private Quality quality;

    public BankVisit() {
    }

    public BankVisit(LocalDate arrivalDate, LocalDate departureDate, Quality quality) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.quality = quality;
    }

    public enum Quality{
        EXCELLENT,GOOD,BAD
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }
}
