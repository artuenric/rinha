package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

import javax.swing.ImageIcon;

public class GaloBMW extends Galo {
       
    public GaloBMW(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo BMW");
        setNivel(nivel);
        setTipo("B");
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Atropelamento", "VrumVrum Gatinha", "Gasolina de Milho", "Freio da Blazer");
        // Foto
        setFotoBatalha(foto);
    }     
}
