package com.hei;

import lombok.Getter;

@Getter

public class Rue {
    private final String nom;
    private final Lieu debut;
    private final Lieu fin;

    public Rue(String nom, Lieu debut, Lieu fin) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.debut.ajouterRue(this);
        this.fin.ajouterRue(this);
    }

    public Lieu obtenirProchainLieu(Lieu lieuActuel) {
        if (this.debut.equals(lieuActuel)) {
            return this.fin;
        } else if (this.fin.equals(lieuActuel)) {
            return this.debut;
        } else {
            return null;
        }
    }

}
