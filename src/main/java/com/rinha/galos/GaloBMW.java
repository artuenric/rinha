package com.rinha.galos;


import com.rinha.galos.raridade.Epico;

import com.rinha.ataque.AtaqueBasico;
import com.rinha.ataque.AtaqueTipificado;
import com.rinha.ataque.AtaqueAgil;
import com.rinha.ataque.AtaqueUltimate;

public class GaloBMW extends Galo {
       
       public GaloBMW(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo BMW");
        setNivel(nivel);
        setTipo("B");
        setVantagem();
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        this.raridade = raridade.getTipoRaridade();
        this.valor = raridade.getValor();
        this.forca = raridade.getForca();
        this.defesa = raridade.getDefesa();
        this.agilidade = raridade.getAgilidade();
        this.vida = raridade.getVida();
        
        this.atqBasico = new AtaqueBasico("Atropelamento", this.forca, this.nivel, this.agilidade);
        this.atqTipificado = new AtaqueTipificado("VrumVrum Gatinha", this.nivel, this.defesa, this.agilidade);
        this.atqAgil = new AtaqueAgil("Gasolina de Milho", this.forca, this.nivel, this.agilidade);
        this.atqUltimate = new AtaqueUltimate("Freio da Blazer", this.forca, this.nivel, this.agilidade);

        // Nomes para os ataques
        String[] atcks = {"Atropelamento", "VrumVrumGatinha", "Gasolina de Milho", "Freio da Blazer"};
        setAtaques(atcks);
    }     
}
