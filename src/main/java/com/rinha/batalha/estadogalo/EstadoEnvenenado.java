package com.rinha.batalha.estadogalo;

import com.rinha.galos.Galo;

// Perde 10  de vida em duas rodadas

public class EstadoEnvenenado implements EstadoGalo {
    
    private String nomeEstado = "Envenenado";

    //Efeito
    @Override
    public void aplicaEfeito(Galo contexto, int rodadaBatalha) {
        
        //Efeito do estado
        
        if (contexto.getContadorEstado() < 2){
            contexto.setVidaAtual(contexto.getVidaAtual() - 10);
            System.out.println("Galo: "+ contexto.getNome() + " esta envenenado, sofreu dano de 10 por envenenamento");
        } else {
            contexto.zeraContadorEstado();
            contexto.setEstadoAtual(new EstadoNormal());
        }
        
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
    
    
}
