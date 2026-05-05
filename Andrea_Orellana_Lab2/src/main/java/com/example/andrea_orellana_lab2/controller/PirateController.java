package com.example.andrea_orellana_lab2.controller;

import com.example.andrea_orellana_lab2.domain.entity.Pirate;
import com.example.andrea_orellana_lab2.service.impl.PirateServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/pirates")
@AllArgsConstructor
public class PirateController {
    private final PirateServiceImpl pirateService;

    @PostMapping
    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate) {
        pirateService.createPirate(pirate);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(pirate);
    }

    @GetMapping
    public ResponseEntity<List<Pirate>> getAllPirates(){
        return ResponseEntity
                .ok(pirateService.getAllPirates());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pirate> getPirateById(@PathVariable UUID id){
        return ResponseEntity
                .ok(pirateService.getPirateById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pirate> updatePirate(
            @PathVariable UUID id,
            @RequestBody Pirate pirate
    ) {
        pirateService.updatePirate(id, pirate);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(pirate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pirate> deletePirate(@PathVariable UUID id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(pirateService.deletePirate(id));
    }
}
