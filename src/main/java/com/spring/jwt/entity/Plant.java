package com.spring.jwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Plant {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID plantId;

    private String name;
    private Double temperature;
    private Double humidity;
    private String growMedium;
    private String nutritions;
    private String containerType;
    private Double plantHeight;
    private String comment;
    private byte[] photo;
    private LocalDateTime dateTime;
    private Integer LUX;
    private Integer PPFD;

    public void setName(String name) {
        this.name = (name != null) ? name.toLowerCase() : null;
    }

    public void setGrowMedium(String growMedium) {
        this.growMedium = (growMedium != null) ? growMedium.toLowerCase() : null;
    }

    public void setNutritions(String nutritions) {
        this.nutritions = (nutritions != null) ? nutritions.toLowerCase() : null;
    }

    public void setContainerType(String containerType) {
        this.containerType = (containerType != null) ? containerType.toLowerCase() : null;
    }

    public void setComment(String comment) {
        this.comment = (comment != null) ? comment.toLowerCase() : null;
    }
}
