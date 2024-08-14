package com.spring.jwt.Interfaces;

import com.spring.jwt.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlantRepository extends JpaRepository<Plant, UUID> {
    // You can add custom repository methods here
}