package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

import javax.swing.*;

public class GaloCafe extends Galo{
    public GaloCafe(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Cafe");
        setNivel(nivel);
        setTipo("C");
       
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("Fefeti", "Grãos selecionados", "Três Corações","Café?");
        // Foto
        setFotoBatalha(foto);
    }
}
