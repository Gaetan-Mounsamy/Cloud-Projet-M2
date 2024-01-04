package Simone.service.service;

import Simone.service.model.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    public Utilisateur saveUtilisateur(Utilisateur utilisateur);
    public List<Utilisateur> getAllUtilisateurs();
}
