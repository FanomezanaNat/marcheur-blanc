package com.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
public class Marche {
    List<Lieu> marche;


    @Override
    public String toString() {
        StringBuilder marche = new StringBuilder("Marche: ");

        for (Lieu lieu : this.marche) {
            marche.append(lieu.getNom()).append(" ");

        }
        return marche.toString();
    }

}
