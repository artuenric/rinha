/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rinha.ataque;
import java.util.Random;

/**
 *
 * @author caio
 */
public class AtaqueTipificado extends Ataque implements Golpe {
    
    public AtaqueTipificado(String nomeAtaque, int forca, int nivel, int agilidade){
           this.nomeAtaque = nomeAtaque;
           this.forca = forca;
           this.nivel = nivel;
           this.agilidade = agilidade;
           this.defineDano();
           this.definePontosDePoder();
           this.setPontosDePoderAtual(this.getPontosDePoderOriginal());
    }
    
    @Override
    public void defineDano(){
        this.dano = this.forca * (this.nivel/10) + this.forca; //dava p simplificar e por direto no construtor mas o ratola quer se aparecer
    }

    @Override
    public void definePontosDePoder() {
        this.pontosDePoderOriginal = 8; //Substituir pela lógica para atribuição dos pontos de poder
    }   
    
    public int getBonus(){
        //Método especifico deste ataque, para setar bonus de tipificação
        Random random = new Random();
        return random.nextInt(26) +50;
    }
    
}
