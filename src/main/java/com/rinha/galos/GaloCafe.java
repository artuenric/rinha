package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

public class GaloCafe extends Galo{
    public GaloCafe(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Cafe");
        setNivel(nivel);
        setTipo("C");
        setVantagem();
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("Fefeti", "Grãos selecionados", "Três Corações","Café?");
        // Foto
        setFotoBatalha("/imgs/galos/galocafe.png");
    }
}
