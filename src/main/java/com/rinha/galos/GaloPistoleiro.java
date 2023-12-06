package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

import javax.swing.ImageIcon;

public class GaloPistoleiro extends Galo{
    
    public GaloPistoleiro(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Pistoleiro");
        setNivel(nivel);
        setTipo("A");
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Sacar pistola", "Coldre de couro", "Pei Pei!", "Sacar a pistola");
        // Foto
        setFotoBatalha(foto);
    }    
}
