package Simone.service.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_utilisateur;

    private String prenom;

    private int nbr_vehicule;

    private int id_vehicule;

    @OneToMany(mappedBy = "utilisateur")
    private ArrayList<Vehicule> vehicules = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_famille")
    private Famille famille;

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNbr_vehicule() {
        return nbr_vehicule;
    }

    public void setNbr_vehicule(int nbr_vehicule) {
        this.nbr_vehicule = nbr_vehicule;
    }

    public int getId_vehicule() {
        return id_vehicule;
    }

    public void setId_vehicule(int id_vehicule) {
        this.id_vehicule = id_vehicule;
    }

    public ArrayList<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(ArrayList<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }
}