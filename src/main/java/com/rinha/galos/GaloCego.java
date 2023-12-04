package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;

import javax.swing.*;

public class GaloCego extends Galo{
    
    public GaloCego(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Cego");
        setNivel(nivel);
        setTipo("C");
        
        
        // Raridade e atributos
        Lendario raridade = new Lendario(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("5 Reais", "Midnight Club", "Sol da Meia Noite","Comprar Alimento");
        // Foto
        setFotoBatalha(foto);
    }
}