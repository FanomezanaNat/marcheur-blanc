package com.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Environnement {
    private Lieu positionActuel;


    public List<Rue> ruesDisponibles() {
        return new ArrayList<>(this.positionActuel.getRueInterconnect());
    }
}
