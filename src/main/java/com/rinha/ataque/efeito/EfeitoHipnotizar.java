package com.rinha.ataque.efeito;

import com.rinha.batalha.estadogalo.EstadoHipnotizado;
import com.rinha.galos.Galo;

//Proximo ataque do galo volta contra ele mesmo

public class EfeitoHipnotizar extends Efeito{
    
    private EstadoHipnotizado estado = new EstadoHipnotizado();

    
     public EfeitoHipnotizar(){
        this.setNomeEfeito("Hipnotizar");
    }
    
    @Override
    public void aplicaEstado(Galo galo, int rodadaBatalha) {
        galo.setEstadoAtual(estado);
        galo.getEstadoAtual().aplicaEfeito(galo, rodadaBatalha);
    }

    
    
}
