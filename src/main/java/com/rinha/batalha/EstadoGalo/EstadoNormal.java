
package com.rinha.batalha.EstadoGalo;

// Galo esta normal

import com.rinha.galos.Galo;

public class EstadoNormal implements EstadoGalo{
    
    private String nomeEstado = "Normal";

    @Override
    public void aplicaEfeito(Galo contexto) {
        System.out.println("Efeito Normal Aplicado à "+ contexto.getNome());
    }

    @Override
    public String getNomeEstadoAtual() {
        return this.nomeEstado;
    }
    
    
    
}
