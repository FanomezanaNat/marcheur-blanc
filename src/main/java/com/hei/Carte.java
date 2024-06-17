package com.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@AllArgsConstructor
@Getter
public class Carte {
    private String nom;
    private List<Lieu> lieux;

    public void ajouterLieux(Lieu lieu) {
        this.lieux.add(lieu);
    }
}
