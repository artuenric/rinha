package com.rinha.ataque.Efeito;

import com.rinha.batalha.EstadoGalo.EstadoAtordoado;
import com.rinha.galos.Galo;

public class EfeitoAtordoar extends Efeito {
    private EstadoAtordoado estado = new EstadoAtordoado();

    public EfeitoAtordoar(){
        this.setNomeEfeito("Atordoar");
    }
    
    @Override
    public void aplicaEfeito(Galo galo){ // Galo que recebe o efeito
        galo.setEstadoAtual(estado);
        galo.getEstadoAtual().aplicaEfeito(galo);
    }
    
}
