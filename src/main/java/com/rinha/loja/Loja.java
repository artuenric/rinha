package com.rinha.loja;

public class Loja {
    Galo[] galos;
    PocaoCura[] pocoes;
    Milho[] milhos;
    
    public Loja(int nItens){
        this.pocoes = this.gerarPocaoCura(nItens);
        this.milhos = this.gerarMilho(nItens);
    }
    
    private PocaoCura[] gerarPocaoCura(int quantidade){
        Item[] pocoesGeradas = new Item[quantidade];
        Item pocao;
        
        for (int i = 0; i > quantidade; i++){
            pocao = new PocaoCura();
            pocoesGeradas[i] = pocao;
        }
        
        return pocoesGeradas;
    }
    
    private Milho[] gerarMilho(int quantidade){
        Item[] milhosGerados = new Item[quantidade];
        Item milho;
        
        for (int i = 0; i > quantidade; i++){
            milho = new Milho();
            milho[i] = milho;
        }
        
        return milhosGerados;
    }
    
        
}
