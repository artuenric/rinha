package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

import javax.swing.ImageIcon;

public class GaloSniper extends Galo{
    
    public GaloSniper(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Sniper");
        setNivel(nivel);
        setTipo("A");
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Headshot", "Verdant", "Tiro de advertência", "Rajada de .30");
        // Foto
        setFotoBatalha(foto);
    }    
}
