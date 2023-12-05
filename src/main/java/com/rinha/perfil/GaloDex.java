package com.rinha.perfil;

import com.rinha.galos.Galo;
import java.util.ArrayList;

public class GaloDex {
    private ArrayList<Galo> galos;
    private Galo atacante;
    
    public ArrayList<Galo> getGalos() {
        return galos;
    }
    
    public Galo getGalo(int index){
        return this.galos.get(index);
    }

    public Galo getAtacante() {
        return atacante;
    }

    public void setAtacante(Galo atacante) {
        this.atacante = atacante;
    }
    
    public int getTamanho(){
        return this.galos.size();
    }
    
    public Object[] getInfoGalo(int index){
        Galo galo = this.galos.get(index);
        Object[] info = {galo.getApelido(), galo.getTipo(), galo.getRaridade(), galo.getNivel(), galo.getVida()};
        return info;
    }
    public GaloDex(){
        this.galos = new ArrayList<>();
    }
    
    public void addGalo(Galo galo){
        this.galos.add(galo);
    }
    
    public void removeGalo(Galo galo){
        this.galos.remove(galo);
        if (galo == this.atacante){
            this.atacante = null;
        }
    }
    
}
