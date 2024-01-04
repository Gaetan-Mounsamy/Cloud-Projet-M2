package Simone.service.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Famille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_famille;

    private String nom_famille;

    private String taille_famille;

    private int nbr_vehicule;

    @OneToMany(mappedBy = "famille")
    private ArrayList<Utilisateur> utilisateurs = new ArrayList<>();

    public int getId_famille() {
        return id_famille;
    }

    public void setId_famille(int id_famille) {
        this.id_famille = id_famille;
    }

    public String getNom_famille() {
        return nom_famille;
    }

    public void setNom_famille(String nom_famille) {
        this.nom_famille = nom_famille;
    }

    public String getTaille_famille() {
        return taille_famille;
    }

    public void setTaille_famille(String taille_famille) {
        this.taille_famille = taille_famille;
    }

    public int getNbr_vehicule() {
        return nbr_vehicule;
    }

    public void setNbr_vehicule(int nbr_vehicule) {
        this.nbr_vehicule = nbr_vehicule;
    }

    public ArrayList<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
