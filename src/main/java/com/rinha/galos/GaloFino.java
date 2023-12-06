package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

import javax.swing.ImageIcon;

public class GaloFino extends Galo{
    
    public GaloFino(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Fino");
        setNivel(nivel);
        setTipo("C");
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Esquiva", "Passar fome", "Espremida Mortal", "Perfuração");
        // Foto
        setFotoBatalha(foto);
    }    
}
