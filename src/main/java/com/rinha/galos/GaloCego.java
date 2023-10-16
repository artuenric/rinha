package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;

public class GaloCego extends Galo{
    
    public GaloCego(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Cego");
        setNivel(nivel);
        setTipo("C");
        setVantagem();
        
        // Raridade e atributos
        Lendario raridade = new Lendario(nivel);
        this.raridade = raridade.getTipoRaridade();
        this.valor = raridade.getValor();
        this.forca = raridade.getForca();
        this.defesa = raridade.getDefesa();
        this.agilidade = raridade.getAgilidade();
        this.vida = raridade.getVida();
        
        // Nomes para os ataques
        String[] atcks = {"5 Reais", "midnight club", "sol da meia noite", "Comprar alimento"};
        setAtaques(atcks);
    }
}