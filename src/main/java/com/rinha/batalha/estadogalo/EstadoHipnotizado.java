package com.rinha.batalha.estadogalo;

import com.rinha.galos.Galo;

//Proximo ataque do galo volta contra ele mesmo

public class EstadoHipnotizado implements EstadoGalo{
    
    private String nomeEstado = "Hipnotizado";
    
    //Efeito
    @Override
    public void aplicaEfeito(Galo contexto, int rodadaBatalha) {
        
        //Efeito da batalha 
        
        System.out.println("Efeito Hipnotizado Aplicado à "+ contexto.getNome());
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
    
}
