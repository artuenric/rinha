package com.rinha.ataque;


public class AtaqueAgil extends Ataque implements Golpe{

    public AtaqueAgil(String nomeAtaque, int forca, int nivel, int agilidade){
        this.nomeAtaque = nomeAtaque;
        this.forca = forca;
        this.nivel = nivel;
        this.agilidade = agilidade;
        this.defineDano();
        this.definePontosDePoder();
        this.setPontosDePoderAtual(this.getPontosDePoderOriginal());
    }
    
    @Override
    public void defineDano() {
        this.dano = this.agilidade * (this.nivel/10) + this.agilidade ;
    }

    @Override
    public void definePontosDePoder() {
        this.pontosDePoderOriginal = 8; //Substituir pela lógica para atribuição dos pontos de poder 
    }

}
