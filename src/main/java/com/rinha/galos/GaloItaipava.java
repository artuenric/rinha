package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;

import javax.swing.ImageIcon;

public class GaloItaipava extends Galo{
    
    public GaloItaipava(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Itaipava");
        setNivel(nivel);
        setTipo("B");
        setVantagem();
        
        // Raridade e atributos
        Lendario raridade = new Lendario(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Voadora", "Arremesso de Tampinha", "Ressaca", "Apagar Cigarro");       
        // Foto
        setFotoBatalha(foto);
    }    
}
