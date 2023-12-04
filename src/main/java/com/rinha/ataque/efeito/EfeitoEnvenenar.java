package com.rinha.ataque.efeito;

import com.rinha.batalha.estadogalo.EstadoEnvenenado;
import com.rinha.batalha.estadogalo.EstadoNormal;
import com.rinha.galos.Galo;

// Perde 10 de vida em duas rodadas

public class EfeitoEnvenenar extends Efeito{
    private EstadoEnvenenado estado = new EstadoEnvenenado();
    
    public EfeitoEnvenenar(){
        this.setNomeEfeito("Envenenar");
    }

    @Override
    public void aplicaEstado(Galo galo, int rodadaBatalha) {
        galo.setEstadoAtual(estado);
        galo.getEstadoAtual().aplicaEfeito(galo, rodadaBatalha);
    }
    
}
