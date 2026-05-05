package com.example.andrea_orellana_lab2.respository;

import com.example.andrea_orellana_lab2.domain.entity.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PirateRepository extends JpaRepository<Pirate, UUID> {
}
