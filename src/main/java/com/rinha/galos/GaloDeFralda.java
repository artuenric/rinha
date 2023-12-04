package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

import javax.swing.ImageIcon;

public class GaloDeFralda extends Galo{
    public GaloDeFralda(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo de Fralda");
        setNivel(nivel);
        setTipo("A");
        setVantagem();
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("Fralda Suja", "Número 3(?)", "Incontinência","Geriatricamente");
        // Foto
        setFotoBatalha(foto);
    }
}
