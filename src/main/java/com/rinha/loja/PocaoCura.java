package com.rinha.loja;

import java.util.Random;
import com.rinha.galos.Galo;

public class PocaoCura extends Item{
    int restauracao;
    
    public PocaoCura(){
        this.nome = "Poção de Cura";
        Random random = new Random();
        this.restauracao = random.nextInt(20)+10;
        this.preco = restauracao / 2;
    }

    public int getRestauracao() {
        return restauracao;
    }
    
    public void curar(Galo galo){
        galo.setVidaAtual(galo.getVidaAtual() + this.restauracao);
    }
}
