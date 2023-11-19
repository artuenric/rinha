package com.rinha.player;

import java.util.ArrayList;
import com.rinha.galos.Galo;

public class Perfil {
    private String nome;
    private int nivel;
    private GaloDex galoDex;
    private Carteira carteira;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public GaloDex getGaloDex() {
        return galoDex;
    }

    public Carteira getCarteira() {
        return carteira;
    }
    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }
    
    public Perfil(String nome){
        this.nome = nome;
        this.nivel = 0;
        this.carteira = new Carteira(100);
        this.galoDex = new GaloDex();
    }
}
