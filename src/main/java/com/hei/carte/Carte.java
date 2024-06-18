package com.hei.carte;

import com.hei.Lieu;
import lombok.Getter;

import java.util.List;


@Getter
public class Carte {
    private String nom;
    private List<Lieu> lieux;

    public Carte() {
    }

    public void ajouterLieux(Lieu lieu) {
        this.lieux.add(lieu);
    }


}
