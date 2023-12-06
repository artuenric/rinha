package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

import javax.swing.ImageIcon;

public class GaloRikixa extends Galo{
    
    public GaloRikixa(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Rikixá");
        setNivel(nivel);
        setTipo("A");
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("我不懂中文", "你能給我一點嗎？", "neyma-san", "駕駛艙");
        // Foto
        setFotoBatalha(foto);
    }    
}
