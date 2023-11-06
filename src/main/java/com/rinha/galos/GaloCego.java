package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;

import com.rinha.ataque.AtaqueAgil;
import com.rinha.ataque.AtaqueBasico;
import com.rinha.ataque.AtaqueTipificado;
import com.rinha.ataque.AtaqueUltimate;


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
        
        this.atqBasico = new AtaqueBasico("5 Reais", this.forca, this.nivel, this.agilidade);
        this.atqTipificado = new AtaqueTipificado("Midnight Club", this.nivel, this.defesa, this.agilidade);
        this.atqAgil = new AtaqueAgil("Sol da Meia Noite", this.forca, this.nivel, this.agilidade);
        this.atqUltimate = new AtaqueUltimate("Comprar Alimento", this.forca, this.nivel, this.agilidade);
    }
}