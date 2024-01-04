package Simone.service.service;

import Simone.service.model.Vehicule;

import java.util.List;

public interface VehiculeService {
    public Vehicule saveVehicule(Vehicule vehicule);
    public List<Vehicule> getAllVehicules();
}
