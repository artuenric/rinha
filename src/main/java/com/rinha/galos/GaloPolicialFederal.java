package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;

import javax.swing.*;

public class GaloPolicialFederal extends Galo{
    
    public GaloPolicialFederal(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Policial Federal");
        setNivel(nivel);
        setTipo("A");
        setVantagem();
        
        // Raridade e atributos
        Lendario raridade = new Lendario(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Abuso de autoridade", "Opressão", "AK-47 é o porte do homem", "Motopatrulhamentostensivo");
        // Foto
        // setFotoBatalha("/imgs/galos/galopolicialfederal.png");
    }
}
