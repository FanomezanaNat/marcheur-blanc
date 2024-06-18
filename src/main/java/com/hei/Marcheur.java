package com.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@Getter
public class Marcheur {
    private String nom;

    public Marche marche(Lieu positionActuel, Lieu destination) {
        Environnement environnement = new Environnement(positionActuel);
        List<Lieu> marche = new ArrayList<>();
        marche.add(positionActuel);
        while (!positionActuel.equals(destination)) {
            List<Rue> ruesDisponibles = environnement.ruesDisponibles();
            Rue rue = ruesDisponibles.get(new Random().nextInt(ruesDisponibles.size()));
            Lieu prochainLieu = rue.obtenirProchainLieu(positionActuel);

            marche.add(prochainLieu);
            positionActuel = prochainLieu;
            environnement.setPositionActuel(prochainLieu);
        }


        return new Marche(marche);
    }
}
