package com.hei;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MarcheurTest {


    @Test
    public void avoir_liste_marche() {
        var Bjarni = new Marcheur("Bjarni");

        var Hei = new Lieu("HEI");
        var Pullman = new Lieu("Pullman");
        var Nexta = new Lieu("Nexta");
        var Sekolintsika = new Lieu("Sekolintsika");
        var Marais = new Lieu("Marais");
        var Balancoire = new Lieu("Balancoire");
        var Esti = new Lieu("Esti");
        var Boulevard = new Lieu("Boulevard de l'Europe");
        var Meteo = new Lieu("Meteo");


        var Andriatsihoarana = new Rue("Rue Andriatsihoarana", Hei, Pullman);
        var heiBalancoire = new Rue("Hei Balancoire", Hei, Balancoire);
        var Ranaivo = new Rue("Rue Ranaivo", Pullman, Balancoire);
        var pullmanNexta = new Rue("Pullman Nexta", Pullman, Nexta);
        var maraisSekoly = new Rue("Marais Sekoly", Marais, Sekolintsika);
        var sekolyHei = new Rue("Sekoly Hei", Sekolintsika, Hei);
        var balancoireEsti = new Rue("Balancoire Esti", Balancoire, Esti);
        var balancoireBoulevard = new Rue("Balancoire Boulevar", Balancoire, Boulevard);
        var boulevardEsti = new Rue("Boulevard Esti", Boulevard, Esti);
        System.out.println(Bjarni.marche(Hei, Esti));
    }


    @Test
    public void est_vraiment_dernier_localisation() {

        var Bjarni = new Marcheur("Bjarni");

        var Hei = new Lieu("HEI");
        var Pullman = new Lieu("Pullman");
        var Nexta = new Lieu("Nexta");
        var Sekolintsika = new Lieu("Sekolintsika");
        var Marais = new Lieu("Marais");
        var Balancoire = new Lieu("Balancoire");
        var Esti = new Lieu("Esti");
        var Boulevard = new Lieu("Boulevard de l'Europe");
        var Meteo = new Lieu("Meteo");


        var Andriatsihoarana = new Rue("Rue Andriatsihoarana", Hei, Pullman);
        var Ranaivo = new Rue("Rue Ranaivo", Pullman, Balancoire);
        var maraisSekoly = new Rue("Marais Sekoly", Marais, Sekolintsika);
        var sekolyHei = new Rue("Sekoly Hei", Sekolintsika, Hei);
        var heiBalancoire = new Rue("Hei Balancoire", Hei, Balancoire);
        var pullmanNexta = new Rue("Pullman Nexta", Pullman, Nexta);
        var balancoireEsti = new Rue("Balancoire Esti", Balancoire, Esti);
        var balancoireBoulevard = new Rue("Balancoire Boulevar", Balancoire, Boulevard);
        var boulevardEsti = new Rue("Boulevard Esti", Boulevard, Esti);


        var route = Bjarni.marche(Esti, Hei).getRoute();
        assertEquals(Hei, route.get(route.size() - 1));
    }

    @Test
    public void est_vraiment_premier_localisation() {

        var Bjarni = new Marcheur("Bjarni");

        var Hei = new Lieu("HEI");
        var Pullman = new Lieu("Pullman");
        var Nexta = new Lieu("Nexta");
        var Sekolintsika = new Lieu("Sekolintsika");
        var Marais = new Lieu("Marais");
        var Balancoire = new Lieu("Balancoire");
        var Esti = new Lieu("Esti");
        var Boulevard = new Lieu("Boulevard de l'Europe");
        var Meteo = new Lieu("Meteo");


        var Andriatsihoarana = new Rue("Rue Andriatsihoarana", Hei, Pullman);
        var Ranaivo = new Rue("Rue Ranaivo", Pullman, Balancoire);
        var maraisSekoly = new Rue("Marais Sekoly", Marais, Sekolintsika);
        var sekolyHei = new Rue("Sekoly Hei", Sekolintsika, Hei);
        var heiBalancoire = new Rue("Hei Balancoire", Hei, Balancoire);
        var pullmanNexta = new Rue("Pullman Nexta", Pullman, Nexta);
        var balancoireEsti = new Rue("Balancoire Esti", Balancoire, Esti);
        var balancoireBoulevard = new Rue("Balancoire Boulevar", Balancoire, Boulevard);
        var boulevardEsti = new Rue("Boulevard Esti", Boulevard, Esti);


        var route = Bjarni.marche(Esti, Hei).getRoute();
        assertEquals(Esti, route.get(0));
    }

    @Test
    public void passe_par_balancoire() {

        var Bjarni = new Marcheur("Bjarni");

        var Hei = new Lieu("HEI");
        var Pullman = new Lieu("Pullman");
        var Nexta = new Lieu("Nexta");
        var Sekolintsika = new Lieu("Sekolintsika");
        var Marais = new Lieu("Marais");
        var Balancoire = new Lieu("Balancoire");
        var Esti = new Lieu("Esti");
        var Boulevard = new Lieu("Boulevard de l'Europe");
        var Meteo = new Lieu("Meteo");


        var Andriatsihoarana = new Rue("Rue Andriatsihoarana", Hei, Pullman);
        var Ranaivo = new Rue("Rue Ranaivo", Pullman, Balancoire);
        var maraisSekoly = new Rue("Marais Sekoly", Marais, Sekolintsika);
        var sekolyHei = new Rue("Sekoly Hei", Sekolintsika, Hei);
        var heiBalancoire = new Rue("Hei Balancoire", Hei, Balancoire);
        var pullmanNexta = new Rue("Pullman Nexta", Pullman, Nexta);
        var balancoireEsti = new Rue("Balancoire Esti", Balancoire, Esti);
        var balancoireBoulevard = new Rue("Balancoire Boulevar", Balancoire, Boulevard);
        var boulevardEsti = new Rue("Boulevard Esti", Boulevard, Esti);

        var lieux = List.of(Marais, Sekolintsika, Hei, Pullman, Nexta, Balancoire, Boulevard, Esti);

        assertTrue(Bjarni.marche(Esti, Hei).getRoute().contains(Balancoire));
    }

}