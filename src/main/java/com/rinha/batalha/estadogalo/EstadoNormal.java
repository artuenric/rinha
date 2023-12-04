
package com.rinha.batalha.estadogalo;

// Galo esta normal

import com.rinha.galos.Galo;

public class EstadoNormal implements EstadoGalo{
    
    private String nomeEstado = "Normal";

    @Override
    public void aplicaEfeito(Galo contexto, int rodadaBatalha) {
        System.out.println("Galo: "+ contexto.getNome()+ " esta normal (sem efeito algum)");
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
       
}
