package com.rinha.batalha.EstadoGalo;

import com.rinha.galos.Galo;

// Perde vida em duas rodadas


public class EstadoEnvenenado implements EstadoGalo {
    
    private String nomeEstado = "Envenenado";

    //Efeito
    @Override
    public void aplicaEfeito(Galo contexto) {
        System.out.println("Efeito Envenenado Aplicado à "+ contexto.getNome());
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
    
    
}
