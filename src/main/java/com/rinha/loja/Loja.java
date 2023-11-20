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
    
    // Métodos para a loja
    public Object[] getInfoPocoes(int index){
        PocaoCura pocao = this.pocoes.get(index);
        Object[] info = {pocao.getNome(), pocao.getRestauracao(), pocao.getPreco()};
        return info;
    }
    
    public Object[] getInfoMilhos(int index){
        Milho milho = this.milhos.get(index);
        Object[] info = {milho.getNome(), milho.getXp(), milho.getPreco()};
        return info;
    }
    
}
