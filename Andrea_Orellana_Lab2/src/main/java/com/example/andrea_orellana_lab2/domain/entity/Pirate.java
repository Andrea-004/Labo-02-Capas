package com.example.andrea_orellana_lab2.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name = "Pirate")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pirate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "pirateName")
    private String name;

    @Column(name = "pirateBounty")
    private Double bounty;

    @Column(name = "pirateCrew")
    private String crew;

    @Column(name = "pirateLife")
    private Boolean isAlive;
}
