package Simone.service.service;

import Simone.service.model.Famille;
import Simone.service.repository.FamilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilleServiceImplementation implements FamilleService{

    @Autowired
    private FamilleRepository familleRepository;

    @Override
    public Famille saveFamille(Famille famille) {
        return familleRepository.save(famille);
    }

    @Override
    public List<Famille> getAllFamilles() {
        return familleRepository.findAll();
    }
}
