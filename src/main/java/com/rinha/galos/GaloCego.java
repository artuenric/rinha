package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;

public class GaloCego extends Galo{
    
    public GaloCego(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Cego");
        setNivel(nivel);
        setTipo("C");
        setVantagem();
        
        // Raridade e atributos
        Lendario raridade = new Lendario(nivel);
        defineAtributos(raridade);   
        // Ataques
        setAtaques("5 Reais", "Midnight Club", "Sol da Meia Noite","Comprar Alimento");
        // Foto
        setFotoBatalha("/imgs/galos/galocego.png");
    }
}