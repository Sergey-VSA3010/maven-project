package com.lessons.maven.exam04.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_fishing_trip")
public class FishingTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Boat boat;
    @ManyToMany(mappedBy = "tripsList")
    private List<CrewMember> crewMembers ;
    @Column(name = "start_date",nullable = false,length = 10)
    private LocalDate startDate;
    @Column(name = "return_date",nullable = false,length = 10)
    private LocalDate returnDate;
    @OneToMany//(mappedBy = "tripsList")
    @JoinColumn(name = "fishing_catch")
    private List<FishingCatch> fishingCatch;
    @OneToMany//(mappedBy = "tripsList")
    @JoinColumn(name = "bank_visit")
    private List<BankVisit> bankVisits;

    public FishingTrip() {
    }

    public FishingTrip(Boat boat, List<CrewMember> crewMembers,
                       LocalDate startDate, LocalDate returnDate,
                       List<FishingCatch> fishingCatch, List<BankVisit> bankVisits) {
        this.boat = boat;
        this.crewMembers = crewMembers;
        this.startDate = startDate;
        this.returnDate = returnDate;
        this.fishingCatch = fishingCatch;
        this.bankVisits = bankVisits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public List<FishingCatch> getFishingCatch() {
        return fishingCatch;
    }

    public void setFishingCatch(List<FishingCatch> fishingCatch) {
        this.fishingCatch = fishingCatch;
    }

    public List<BankVisit> getBankVisits() {
        return bankVisits;
    }

    public void setBankVisits(List<BankVisit> bankVisits) {
        this.bankVisits = bankVisits;
    }
}
