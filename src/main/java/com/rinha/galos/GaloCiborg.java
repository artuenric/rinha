package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

public class GaloCiborg extends Galo {
    
        public GaloCiborg(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Ciborg");
        setNivel(nivel);
        setTipo("A");
        setVantagem();
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        this.raridade = raridade.getTipoRaridade();
        this.valor = raridade.getValor();
        this.forca = raridade.getForca();
        this.defesa = raridade.getDefesa();
        this.agilidade = raridade.getAgilidade();
        this.vida = raridade.getVida();

        // Nomes para os ataques
        String[] atcks = {"Curso do SENAI", "Curto circuito", "Chute mecânico", "Raio laser"};
        setAtaques(atcks);
    }
    
}
