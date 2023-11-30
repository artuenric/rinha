package com.rinha.ataque.Efeito;

import com.rinha.batalha.EstadoGalo.EstadoNormal;
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
