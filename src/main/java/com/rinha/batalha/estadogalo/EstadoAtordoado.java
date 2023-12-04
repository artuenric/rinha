package com.rinha.batalha.estadogalo;

import com.rinha.galos.Galo;

// Não consegue atacar por uma rodada

public class EstadoAtordoado implements EstadoGalo{
    
    private String nomeEstado = "Atordoado";
    
    //Efeito
    @Override
    public void aplicaEfeito(Galo contexto) {
        System.out.println("Efeito Atordoado Aplicado à "+ contexto.getNome());
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
}
