
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
        this.dano = this.agilidade * (this.nivel/10) + this.agilidade ;
    }

    @Override
    public void definePontosDePoder() {
        
    }
    
    public int setBonus(){
        Random random = new Random();
        return random.nextInt(121) + 100;
    }
    
    //FALTA CONTINUAR
    
}
