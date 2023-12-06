package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

import javax.swing.ImageIcon;

public class GaloWhatsapp extends Galo{
        public GaloWhatsapp(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Whatsapp");
        setNivel(nivel);
        setTipo("B");
        
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("visualização única", "Zap", "Vácuo","Fifififiu");
        // Foto
        setFotoBatalha(foto);
    }
}
