package com.rinha.perfil;

import com.rinha.loja.Item;
import com.rinha.loja.Loja;
import com.rinha.loja.Milho;
import com.rinha.loja.PocaoCura;
import java.util.ArrayList;

public class Perfil {
    private String nome;
    private int nivel;
    private GaloDex galoDex;
    private Carteira carteira;
    private ArrayList<PocaoCura> pocoes;
    private ArrayList<Milho> milhos;
    private Loja loja;
    
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

    public ArrayList<PocaoCura> getPocoes() {
        return pocoes;
    }

    public ArrayList<Milho> getMilhos() {
        return milhos;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    
    public boolean comprarItem(Item item){
        if (this.carteira.solicitacao(item.getPreco())){
            if (item.getNome().equals("Milho")){
                this.milhos.add((Milho) item);
            } 
            else if (item.getNome().equals("Poção de Cura")){
                this.pocoes.add((PocaoCura) item);
            }
            this.carteira.saque(item.getPreco());
            return true;
        }
        return false;
    }
    
    public Perfil(String nome){
        this.nome = nome;
        this.nivel = 0;
        this.carteira = new Carteira(100);
        this.galoDex = new GaloDex();
        this.milhos = new ArrayList<>();
        this.pocoes = new ArrayList<>();
        this.loja = new Loja(20);
    }
}
