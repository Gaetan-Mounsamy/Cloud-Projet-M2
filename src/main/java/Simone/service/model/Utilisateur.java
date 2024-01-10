package Simone.service.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_utilisateur;

    private String prenom;

    private int nbr_vehicule;

    private int id_vehicule;


    public Utilisateur() {

    }

    @JsonCreator
    public Utilisateur(@JsonProperty("prenom") String prenom, @JsonProperty("nbr_vehicule") int nbr_vehicule, @JsonProperty("id_vehicule") int id_vehicule) {
        this.prenom = prenom;
        this.nbr_vehicule = nbr_vehicule;
        this.id_vehicule = id_vehicule;
    }

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

    /*
    @OneToMany(mappedBy = "utilisateur")
    private Set<Vehicule> vehicules = new Set<Vehicule>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Vehicule> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Vehicule vehicule) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Vehicule> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    public Set<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(Set<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }
    */

    /*
    @ManyToOne
    @JoinColumn(name = "id_famille")
    private Famille famille;

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }
    */
}