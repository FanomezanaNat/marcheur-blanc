package com.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Marche {
    List<Lieu> route;


    @Override
    public String toString() {
        StringBuilder marche = new StringBuilder("Marche: ");

        for (Lieu lieu : this.route) {
            marche.append(lieu.getNom()).append(" ");

        }
        return marche.toString();
    }

}
