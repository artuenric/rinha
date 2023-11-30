package com.rinha.ataque.Efeito;

import com.rinha.batalha.EstadoGalo.EstadoEnvenenado;
import com.rinha.galos.Galo;

public class EfeitoEnvenenar extends Efeito{
    private EstadoEnvenenado estado = new EstadoEnvenenado();
    
    public EfeitoEnvenenar(){
        this.setNomeEfeito("Envenenar");
    }

    @Override
    public void aplicaEfeito(Galo galo) {
        galo.setEstadoAtual(this.estado);
        galo.getEstadoAtual().aplicaEfeito(galo);
    }
    
}
