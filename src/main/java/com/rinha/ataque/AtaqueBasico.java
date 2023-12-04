package com.rinha.ataque;

import com.rinha.ataque.efeito.Efeito;
import com.rinha.ataque.efeito.SemEfeito;


public class AtaqueBasico extends Ataque implements Golpe {
    
    public AtaqueBasico(String nomeAtaque, int forca, int nivel, int agilidade){
        this.nomeAtaque = nomeAtaque;
        this.forca = forca;
        this.nivel = nivel;
        this.agilidade =  agilidade;
        this.defineDano();
        this.definePontosDePoder();
        this.setPontosDePoderAtual(this.getPontosDePoderOriginal());
        this.setEfeitoAtaque(new SemEfeito());
    }
    
    
    
    @Override
    public void defineDano() {
        this.dano = this.forca * (this.nivel/10) + this.forca;
    }

    @Override
    public void definePontosDePoder() {
        this.pontosDePoderOriginal = 10; //Substituir pela lógica para atribuição dos pontos de poder
    }
    
}
