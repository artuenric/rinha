package com.rinha.loja;

import java.util.ArrayList;

public class Loja {
    ArrayList <PocaoCura> pocoes;
    ArrayList <Milho> milhos;
    
    public Loja(int nItens){
        this.pocoes = this.gerarPocaoCura(nItens);
        this.milhos = this.gerarMilho(nItens);
    }
    
    private ArrayList gerarPocaoCura(int quantidade){
        ArrayList <PocaoCura> pocoesGeradas = new ArrayList<>();
        PocaoCura pocao;
        
        for (int i = 0; i > quantidade; i++){
            pocao = new PocaoCura();
            pocoesGeradas.add(pocao);
        }
        
        return pocoesGeradas;
    }  
    
    private ArrayList gerarMilho(int quantidade){
        ArrayList <Milho> milhosGerados = new ArrayList<>();
        Milho milho;
        
        for (int i = 0; i > quantidade; i++){
            milho = new Milho();
            milhosGerados.add(milho);
        }
        
        return milhosGerados;
    }   
}
