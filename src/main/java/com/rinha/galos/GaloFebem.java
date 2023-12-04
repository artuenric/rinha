package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;

import javax.swing.ImageIcon;

public class GaloFebem extends Galo{
    
    public GaloFebem(int nivel, String apelido, ImageIcon foto){
    // Definindo informações básicas
    setApelido(apelido);
    setNome("Galo Policial Federal");
    setNivel(nivel);
    setTipo("A");

    // Raridade e atributos
    Lendario raridade = new Lendario(nivel);
    defineAtributos(raridade);
    // Ataques
    setAtaques("Piu", "Tiro de doze", "Sujar a fralda", "Chamar a mãe");
    // Foto
    setFotoBatalha(foto);
    }
}
