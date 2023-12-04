package com.rinha.ataque.efeito;

import com.rinha.batalha.estadogalo.EstadoNormal;
import com.rinha.galos.Galo;

public class SemEfeito extends Efeito{
    
    private EstadoNormal estado = new EstadoNormal();

    public SemEfeito(){
        this.setNomeEfeito("O Ataque não possui efeito");
    }

    @Override
    public void aplicaEstado(Galo galo, int rodadaBatalha) {   
        galo.setEstadoAtual(this.estado);
        galo.getEstadoAtual().aplicaEfeito(galo, rodadaBatalha);
    }
    
}
