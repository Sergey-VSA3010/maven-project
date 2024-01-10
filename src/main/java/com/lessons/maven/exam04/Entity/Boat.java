package com.lessons.maven.exam04.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_boat")
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false,length = 50)
    private String name;

    @Column(name = "type",nullable = false,length = 50)
    private String type;

    @Column(name = "displacement",nullable = false,length = 50)
    private Integer displacement;

    @Column(name = "build_date",nullable = false,length = 10)
    private LocalDate buildDate;

    public Boat(String name, String type, Integer displacement, LocalDate buildDate) {
        this.name = name;
        this.type = type;
        this.displacement = displacement;
        this.buildDate = buildDate;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public LocalDate getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(LocalDate buildDate) {
        this.buildDate = buildDate;
    }
}
