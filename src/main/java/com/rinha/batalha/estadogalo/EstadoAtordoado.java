package com.rinha.batalha.estadogalo;

import com.rinha.galos.Galo;

public class EstadoAtordoado implements EstadoGalo{
    
    private String nomeEstado = "Atordoado";
   
    @Override
    public void aplicaEfeito(Galo contexto, int rodadaBatalha) {
        
        //Efeito do estado
        
        System.out.println("Efeito Atordoado Aplicado à "+ contexto.getNome());
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
}
