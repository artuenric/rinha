package com.rinha.ataque.efeito;

import com.rinha.batalha.estadogalo.EstadoHipnotizado;
import com.rinha.galos.Galo;

public class EfeitoHipnotizar extends Efeito{
    
    private EstadoHipnotizado estado = new EstadoHipnotizado();

    
     public EfeitoHipnotizar(){
        this.setNomeEfeito("Hipnotizar");
    }
    
    @Override
    public void aplicaEfeito(Galo galo) {
        galo.setEstadoAtual(estado);
        galo.getEstadoAtual().aplicaEfeito(galo);
    }

    
    
}
