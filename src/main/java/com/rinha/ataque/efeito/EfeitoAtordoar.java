package com.rinha.ataque.efeito;

import com.rinha.batalha.estadogalo.EstadoAtordoado;
import com.rinha.galos.Galo;

// Não consegue atacar por uma rodada

public class EfeitoAtordoar extends Efeito {
    private EstadoAtordoado estado = new EstadoAtordoado();

    public EfeitoAtordoar(){
        this.setNomeEfeito("Atordoar");
    }
    
    @Override
    public void aplicaEstado(Galo galo, int rodadaBatalha){ // Galo que recebe o efeito
        galo.setEstadoAtual(estado);
        galo.getEstadoAtual().aplicaEfeito(galo, rodadaBatalha);
    }
    
}
