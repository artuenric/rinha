/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rinha.ataque;
import com.rinha.ataque.efeito.Efeito;

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
