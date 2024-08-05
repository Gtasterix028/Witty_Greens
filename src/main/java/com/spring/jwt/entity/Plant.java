package com.spring.jwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class Plant {
    @Id
    @GeneratedValue
    private Integer plantId;
    private String name;



    private double temperature;
    private double humidity;
    private String growMedium;
    private String nutritions;
    private String containerType;
    private double plantHeight;
    private String comment;
    private byte[] photo;
    private LocalDateTime dateTime;
    private Integer LUX;
    private Integer PPFD;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getGrowMedium() {
        return growMedium;
    }

    public void setGrowMedium(String growMedium) {
        this.growMedium = growMedium;
    }

    public String getNutritions() {
        return nutritions;
    }

    public void setNutritions(String nutritions) {
        this.nutritions = nutritions;
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public double getPlantHeight() {
        return plantHeight;
    }

    public void setPlantHeight(double plantHeight) {
        this.plantHeight = plantHeight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public Integer getLUX() {
        return LUX;
    }

    public void setLUX(Integer LUX) {
        this.LUX = LUX;
    }

    public Integer getPPFD() {
        return PPFD;
    }

    public void setPPFD(Integer PPFD) {
        this.PPFD = PPFD;
    }
}