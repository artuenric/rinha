
package com.rinha.ataque;
import com.rinha.batalha.estadogalo.EstadoGalo;


public abstract class Ataque {
    
    protected String nomeAtaque;
    protected int forca;           
    protected int nivel;
    protected int agilidade;  
    protected int dano;
    protected int bonusAtq;
    protected int pontosDePoderOriginal;
    protected int pontosDePoderAtual;
    protected EstadoGalo estadoAtaque;
            
    public void setEstadoAtaque(EstadoGalo estadoAtaque){
        this.estadoAtaque = estadoAtaque;
    }
    
    public EstadoGalo getEstadoAtaque(){
        return this.estadoAtaque;
    }

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
    
    public void decrementaPontosDePoderAtual(){
        // Decrementa o PP até no mínimo 0
        if (this.getPontosDePoderAtual() > 0){
            this.setPontosDePoderAtual(getPontosDePoderAtual()-1);
        }
    }
    
    public void recuperaPontosDePoderOriginal(){
        this.pontosDePoderAtual = this.pontosDePoderOriginal;
    }
    
}
