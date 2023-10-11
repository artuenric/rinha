package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

public class GaloCego extends Galo{
    
    public GaloCego(int nivel){
        Raro raridade = new Raro(nivel);
        
        //Definir os outros valores nesse pique:
        setVida(raridade.getVida());
        //setDefesa
        //setVida
        //setForca
        //setAgilidade
        
        setNome("Galo Itaipava");
        setTipo("B");
        setVantagem();
        setNivel(nivel);
        
        
    }
}