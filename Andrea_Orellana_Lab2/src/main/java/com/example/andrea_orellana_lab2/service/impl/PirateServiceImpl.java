package com.example.andrea_orellana_lab2.service.impl;

import com.example.andrea_orellana_lab2.domain.entity.Pirate;
import com.example.andrea_orellana_lab2.respository.PirateRepository;
import com.example.andrea_orellana_lab2.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PirateServiceImpl implements PirateService {
    private final PirateRepository pirateRepository;

    @Override
    public void createPirate(Pirate pirate) {
        pirateRepository.save(pirate);
    }

    @Override
    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

    @Override
    public Pirate getPirateById(UUID id) {
        return pirateRepository.findById(id).orElseThrow(() -> new RuntimeException("Pirate not found!"));
    }

    @Override
    public void updatePirate(UUID id, Pirate pirate) {
        Pirate exists = pirateRepository.getPirateById(id);
        exists.setName(pirate.getName());
        exists.setBounty(pirate.getBounty());
        exists.setCrew(pirate.getCrew());
        exists.setIsAlive(pirate.getIsAlive());
        pirateRepository.save(exists);
    }

    @Override
    public Pirate deletePirate(UUID id) {
        Pirate exist = pirateRepository.getPirateById(id);
        pirateRepository.deleteById(id);
        return exist;
    }

}
