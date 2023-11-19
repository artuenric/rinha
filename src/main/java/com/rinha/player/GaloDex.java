package com.rinha.player;

import com.rinha.galos.Galo;
import java.util.ArrayList;

public class GaloDex {
    private ArrayList<Galo> galos;

    public ArrayList<Galo> getGalos() {
        return galos;
    }
    
    public GaloDex(){
        this.galos = new ArrayList<>();
    }
    
    public void addGalo(Galo galo){
        this.galos.add(galo);
    }
}
