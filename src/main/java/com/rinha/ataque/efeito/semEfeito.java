package com.rinha.ataque.efeito;

import com.rinha.batalha.estadogalo.EstadoNormal;
import com.rinha.galos.Galo;

public class semEfeito extends Efeito{
    
    private EstadoNormal estado = new EstadoNormal();

    public semEfeito(){
        this.setNomeEfeito("O Ataque não possui efeito");
    }

    @Override
    public void aplicaEfeito(Galo galo) {   
        galo.setEstadoAtual(this.estado);
        galo.getEstadoAtual().aplicaEfeito(galo);
    }
    
}
