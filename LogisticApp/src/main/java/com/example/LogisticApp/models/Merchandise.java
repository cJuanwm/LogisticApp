package com.example.LogisticApp.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Merchandise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //upi (unique product identifier)
    private Integer id;
    //volumeOccupies
    private Double volumeOccupies;
    //weightOccupies
    private Double weightOccupies;
    //name
    private String name;
    //description
    private String description;
    //dateEntry
    private LocalDate dateEntry;
    //dateExit
    private LocalDate dateExit;

    public Merchandise(){

    }

    public Merchandise(Integer id, Double volumeOccupies, Double weightOccupies, String name, String description, LocalDate dateEntry, LocalDate dateExit) {
        this.id = id;
        this.volumeOccupies = volumeOccupies;
        this.weightOccupies = weightOccupies;
        this.name = name;
        this.description = description;
        this.dateEntry = dateEntry;
        this.dateExit = dateExit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getVolumeOccupies() {
        return volumeOccupies;
    }

    public void setVolumeOccupies(Double volumeOccupies) {
        this.volumeOccupies = volumeOccupies;
    }

    public Double getWeightOccupies() {
        return weightOccupies;
    }

    public void setWeightOccupies(Double weightOccupies) {
        this.weightOccupies = weightOccupies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(LocalDate dateEntry) {
        this.dateEntry = dateEntry;
    }

    public LocalDate getDateExit() {
        return dateExit;
    }

    public void setDateExit(LocalDate dateExit) {
        this.dateExit = dateExit;
    }

    //sender
    //addressee
    //zoneLocationWarehouse



}
