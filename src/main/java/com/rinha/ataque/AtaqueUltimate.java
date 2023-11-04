
package com.rinha.ataque;
import java.util.Random;

public class AtaqueUltimate extends Ataque implements Golpe {
    
    public AtaqueUltimate(String nomeAtaque, int forca, int nivel, int agilidade){
           this.nomeAtaque = nomeAtaque;
           this.forca = forca;
           this.nivel = nivel;
           this.agilidade = agilidade;
           defineDano();
    }
    
    @Override
    public void defineDano() {
        Random random = new Random();
        this.dano = ((random.nextInt(121) + 100) / 100) * this.forca;
    }

    @Override
    public void definePontosDePoder() {
        
    }
   
    
    //FALTA CONTINUAR
    
}
