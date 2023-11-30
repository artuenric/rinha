package com.rinha.batalha.EstadoGalo;

import com.rinha.galos.Galo;

//Proximo ataque do galo volta contra ele mesmo
public class EstadoHipnotizado implements EstadoGalo{
    
    private String nomeEstado = "Hipnotizado";
    
    //Efeito
    @Override
    public void aplicaEfeito(Galo contexto) {
        System.out.println("Efeito Hipnotizado Aplicado à "+ contexto.getNome());
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
    
}
