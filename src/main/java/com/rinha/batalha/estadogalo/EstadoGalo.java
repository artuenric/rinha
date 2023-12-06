package com.rinha.batalha.estadogalo;

import com.rinha.batalha.Batalha;

import com.rinha.galos.Galo;
public interface EstadoGalo {
    public abstract void aplicarEfeito(Galo contexto, int rodadaBatalha); // Contexto da batalha
    public abstract String getNomeEstadoAtual();
}
