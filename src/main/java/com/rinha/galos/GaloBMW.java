package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

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

        // Nomes para os ataques
        String[] atcks = {"Atropelamento", "VrumVrumGatinha", "Gasolina de Milho", "Freio da Blazer"};
        setAtaques(atcks);
    }     
}
