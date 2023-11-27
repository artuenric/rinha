package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

public class GaloCAM extends Galo{
    public GaloCAM(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo CAM");
        setNivel(nivel);
        setTipo("B");
        setVantagem();
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("Galoucura", "Eu ACREDITO!", "Mineirada","Furar Bloqueio");
        // Foto
        setFotoBatalha("/imgs/galos/galocam.png");
    }
}
