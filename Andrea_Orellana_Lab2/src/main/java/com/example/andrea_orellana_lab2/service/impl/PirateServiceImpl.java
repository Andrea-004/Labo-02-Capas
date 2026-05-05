package com.example.andrea_orellana_lab2.service.impl;

import com.example.andrea_orellana_lab2.domain.entity.Pirate;
import com.example.andrea_orellana_lab2.respository.PirateRepository;
import com.example.andrea_orellana_lab2.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PirateServiceImpl implements PirateService {
    private final PirateRepository pirateRepository;

    @Override
    public void createPirate(Pirate pirate) {
        pirateRepository.save(pirate);
    }
}
