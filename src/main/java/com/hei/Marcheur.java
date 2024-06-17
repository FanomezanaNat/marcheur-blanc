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

    public Marche marche(Lieu positionActuel, Lieu destination, Carte carte) {
        if (carte.getLieux().isEmpty() || !carte.getLieux().contains(positionActuel) || !carte.getLieux().contains(destination)) {

            throw new CustomExecption("ça ne marche pas");
        }
        List<Lieu> marche = new ArrayList<>();
        marche.add(positionActuel);
        while (!positionActuel.equals(destination)) {
            List<Rue> ruesDisponibles = positionActuel.ruesDisponible();
            Rue rue = ruesDisponibles.get(new Random().nextInt(ruesDisponibles.size()));
            Lieu prochainLieu = rue.obtenirProchainLieu(positionActuel);

            marche.add(prochainLieu);
            positionActuel = prochainLieu;
        }


        return new Marche(marche);
    }
}
