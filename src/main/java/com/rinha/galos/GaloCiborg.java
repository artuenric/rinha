package com.rinha.galos;
import com.rinha.galos.raridade.Epico;

import com.rinha.ataque.AtaqueAgil;
import com.rinha.ataque.AtaqueBasico;
import com.rinha.ataque.AtaqueTipificado;
import com.rinha.ataque.AtaqueUltimate;


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
        this.vidaAtual = this.vida;
        
        this.atqBasico = new AtaqueBasico("Curso do SENAI", this.forca, this.nivel, this.agilidade);
        this.atqTipificado = new AtaqueTipificado("Curto Circuito", this.nivel, this.defesa, this.agilidade);
        this.atqAgil = new AtaqueAgil("Chute Mecânico", this.forca, this.nivel, this.agilidade);
        this.atqUltimate = new AtaqueUltimate("Raio Laser", this.forca, this.nivel, this.agilidade);

        // Nomes para os ataques
        String[] atcks = {"Curso do SENAI", "Curto circuito", "Chute mecânico", "Raio laser"};
        setAtaques(atcks);
    }
    
}
