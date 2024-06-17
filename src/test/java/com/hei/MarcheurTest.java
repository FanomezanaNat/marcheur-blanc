package com.hei;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MarcheurTest {
    @Test
    public void ne_peut_pas_marcher() {
        var Hei = new Lieu("HEI");
        var Pullman = new Lieu("Pullman");
        var Nexta = new Lieu("Nexta");
        var Sekolintsika = new Lieu("Sekolintsika");
        var Marais = new Lieu("Marais");
        var Balancoire = new Lieu("Balancoire");
        var Esti = new Lieu("Esti");
        var Boulevard = new Lieu("Boulevard de l'Europe");
        var Meteo = new Lieu("Meteo");


        var Bjarni = new Marcheur("Bjarni");
        var lieux = List.of(Marais, Sekolintsika, Hei, Pullman, Nexta, Balancoire, Boulevard, Esti);

        var Antananarivo = new Carte("Antananarivo", lieux);

        assertThrows(CustomExecption.class, () -> Bjarni.marche(Meteo, Esti, Antananarivo));
    }


}