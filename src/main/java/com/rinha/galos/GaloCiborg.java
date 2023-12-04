package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

import javax.swing.ImageIcon;

public class GaloCiborg extends Galo {
    
    public GaloCiborg(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Ciborg");
        setNivel(nivel);
        setTipo("A");
        
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        defineAtributos(raridade); 
        // Ataques
        setAtaques("Curso do SENAI", "Curto circuito", "Chute mecânico", "Raio laser");
        // Foto
        setFotoBatalha(foto);
    }
}
