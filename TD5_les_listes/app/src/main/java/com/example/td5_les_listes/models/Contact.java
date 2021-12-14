package com.example.td5_les_listes.models;

import java.io.Serializable;

public class Contact implements Serializable {

    private static final long serialVersionUID = 8164310873415567723L;

    private String nom;
    private String prenom;
    private String imageUrl;

    public Contact(String nom, String prenom, String imageUrl) {
        this.nom = nom;
        this.prenom = prenom;
        this.imageUrl = imageUrl;
    }

    public Contact(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.imageUrl = null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
