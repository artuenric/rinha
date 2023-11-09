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
        defineAtributos(raridade);
        // Ataques
        setAtaques("Atropelamento", "VrumVrum Gatinha", "Gasolina de Milho", "Freio da Blazer");
        // Foto
        setFotoBatalha("/imgs/galos/galobmw.png");
    }     
}
