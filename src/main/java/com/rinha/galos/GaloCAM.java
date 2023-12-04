package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

import javax.swing.*;

public class GaloCAM extends Galo{
    public GaloCAM(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo CAM");
        setNivel(nivel);
        setTipo("B");
       
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("Galoucura", "Eu ACREDITO!", "Mineirada","Furar Bloqueio");
        // Foto
        setFotoBatalha(foto);
    }
}
