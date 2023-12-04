package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

import javax.swing.ImageIcon;

public class GaloChorao extends Galo{
        public GaloChorao(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Chorão");
        setNivel(nivel);
        setTipo("B");
        setVantagem();
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("Front Back-Ollie Noise Side 380", "Charlie Brown Jr", "O que os loucos sabem","Natural luz do dia");
        // Foto
        setFotoBatalha(foto);
    }
}
