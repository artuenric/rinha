package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

import javax.swing.ImageIcon;

public class GaloGol extends Galo{
    
    public GaloGol(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Gol");
        setNivel(nivel);
        setTipo("A");
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Toca e não olha", "Finta", "Dominada com nojo", "Pega o Golaço!");
        // Foto
        setFotoBatalha(foto);
    }    
}
