package com.hei;

import com.hei.carte.Carte;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Lieu {
    private final String nom;
    private final Set<Rue> rueInterconnect;
    private final Carte carte;


    public Lieu(String nom, Carte carte) {
        this.nom = nom;
        this.carte = carte;
        this.rueInterconnect = new HashSet<>();
        this.carte.ajouterLieux(this);
    }

    public Lieu(String nom) {
        this.nom = nom;
        this.rueInterconnect = new HashSet<>();
        this.carte = null;

    }


    public void ajouterRue(Rue rue) {
        this.rueInterconnect.add(rue);
    }

    @Override
    public String toString() {
        return "nom: " + nom;
    }

}
