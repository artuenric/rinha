package main.rinha.batalha;

import main.rinha.galos.Galo;

public class Batalha {
    private Galo jogador;
    private Galo maquina;
    private Galo vencedor;
    private int premio;
    
    // Modificadores e Acessores
    public Galo getJogador() {
        return jogador;
    }

    public void setJogador(Galo jogador) {
        this.jogador = jogador;
    }

    public Galo getMaquina() {
        return maquina;
    }

    public void setMaquina(Galo maquina) {
        this.maquina = maquina;
    }

    public void setVencedor() {
        
        if (this.jogador.getVida() == 0){
            this.vencedor = this.maquina;
        } 
        else if (this.maquina.getVida() == 0){
            this.vencedor = this.jogador;
        }
    }
    
    public Galo getVencedor(){
        return this.vencedor;
    }
    
    // Métodos principais
    public void rodada(){

    }
    
}
