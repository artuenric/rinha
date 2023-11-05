
package com.rinha.ataque;
import java.util.Random;

public class AtaqueUltimate extends Ataque implements Golpe {
    
    public AtaqueUltimate(String nomeAtaque, int forca, int nivel, int agilidade){
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
        Random random = new Random();
        this.dano = ((random.nextInt(121) + 100) / 100) * this.forca;
    }

    @Override
    public void definePontosDePoder() {
        this.pontosDePoderOriginal = 5; //Substituir pela lógica para atribuição dos pontos de poder
    }
   
    
    //FALTA CONTINUAR
    
}
