
package com.rinha.ataque;
import java.util.Random;

public abstract class Ataque {
    
    protected String nomeAtaque;
    protected int forca;           
    protected int nivel;
    protected int agilidade;  
    protected int dano;
    protected int bonusAtq;
    protected int pontosDePoderOriginal;
    protected int pontosDePoderAtual;

    public String getNomeAtaque(){
        return this.nomeAtaque;
    }
    
    public int getDanoBase(){
        return this.dano;
         
    }
    
    public int getPontosDePoderOriginal(){
        return this.pontosDePoderOriginal;
    }
    
    public void setPontosDePoderOriginal(int novoValor){
        this.pontosDePoderOriginal = novoValor;
    }
    
    public int getPontosDePoderAtual(){
        return this.pontosDePoderAtual;
    }
    
    public void setPontosDePoderAtual(int ppAtual){
        this.pontosDePoderAtual = ppAtual;
    }
    
    public int getBonus(){
        return this.bonusAtq;
    }
    
}
