package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

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
        defineAtributos(raridade); 
        // Ataques
        setAtaques("Curso do SENAI", "Curto circuito", "Chute mecânico", "Raio laser");
        // Foto
        setFotoBatalha("/imgs/galos/galobmw.png");
    }
}
