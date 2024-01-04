package Simone.service.service;

import Simone.service.model.Famille;

import java.util.List;

public interface FamilleService {
    public Famille saveFamille(Famille Famille);
    public List<Famille> getAllFamilles();
}

