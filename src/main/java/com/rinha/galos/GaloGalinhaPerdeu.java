package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;

import javax.swing.ImageIcon;

public class GaloGalinhaPerdeu extends Galo{
    
    public GaloGalinhaPerdeu(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galinha Perdeu");
        setNivel(nivel);
        setTipo("A");
        
        // Raridade e atributos
        Lendario raridade = new Lendario(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Não olhe!", "Desafio", "Ei, psiu olha aqui!", "Perdeu!");
        // Foto
        setFotoBatalha(foto);
    }    
}
