package com.hei;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class Lieu {
    private final String nom;
    private final Set<Rue> rueInterconnect;

    public Lieu(String nom) {
        this.nom = nom;
        this.rueInterconnect = new HashSet<>();
    }


    public void ajouterRue(Rue rue) {
        this.rueInterconnect.add(rue);
    }

    public List<Rue> ruesDisponible() {
        return new ArrayList<>(this.rueInterconnect);
    }

    @Override
    public String toString() {
        return "nom: " + nom;
    }

}
