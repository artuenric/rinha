package com.rinha.batalha.estadogalo;

import com.rinha.galos.Galo;

//Proximo ataque do galo volta contra ele mesmo

public class EstadoHipnotizado implements EstadoGalo{
    
    private String nomeEstado = "Hipnotizado";
    
    //Efeito
    @Override
    public void aplicarEfeito(Galo contexto, int rodadaBatalha) {
        
        //Efeito da batalha 
        contexto.setEstadoAtual(this);
        System.out.println("Galo: "+ contexto.getNome()+ " esta Hipnotizado");
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
    
}
