package Simone.service.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.*;

@Entity
public class Famille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_famille;

    private String nom_famille;

    private String taille_famille;

    private int nbr_vehicule;

    public Famille() {

    }
    @JsonCreator
    public Famille(@JsonProperty("nom_famille") String nom_famille, @JsonProperty("taille_famille") String taille_famille, @JsonProperty("nbr_vehicule") int nbr_vehicule) {
        this.nom_famille = nom_famille;
        this.taille_famille = taille_famille;
        this.nbr_vehicule = nbr_vehicule;
    }

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

    /*
    @OneToMany(mappedBy = "famille")
    private Set<Utilisateur> utilisateurs = new Set<Utilisateur>() {
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
        public Iterator<Utilisateur> iterator() {
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
        public boolean add(Utilisateur utilisateur) {
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
        public boolean addAll(Collection<? extends Utilisateur> c) {
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
    public Set<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
    */
}
