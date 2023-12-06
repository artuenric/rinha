package com.rinha.batalha.estadogalo;

import com.rinha.galos.Galo;

// Perde 10  de vida em duas rodadas

public class EstadoEnvenenado implements EstadoGalo {
    
    private String nomeEstado = "Envenenado";

    //Efeito
    @Override
    public void aplicarEfeito(Galo contexto, int rodadaBatalha) {
        
        //Efeito do estado
        contexto.setEstadoAtual(this);
        System.out.println("Galo: "+ contexto.getNome()+ " esta Envenenado");
        
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
    
    
}
