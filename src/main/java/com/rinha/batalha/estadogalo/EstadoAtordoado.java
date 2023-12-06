package com.rinha.batalha.estadogalo;

import com.rinha.galos.Galo;

public class EstadoAtordoado implements EstadoGalo{
    
    private String nomeEstado = "Atordoado";
   
    @Override
    public void aplicarEfeito(Galo contexto, int rodadaBatalha) {
        
        //Efeito do estado
        contexto.setEstadoAtual(this);
        System.out.println("Galo: "+ contexto.getNome()+ " esta Atordoado");
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
}
