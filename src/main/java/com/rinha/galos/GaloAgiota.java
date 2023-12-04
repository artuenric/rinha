package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

import javax.swing.ImageIcon;

public class GaloAgiota extends Galo {
        public GaloAgiota(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Agiota");
        setNivel(nivel);
        setTipo("B");
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Me paga", "Ameaça", "Aumentar os Juros", "Estelionato");
        // Foto
        setFotoBatalha(foto);
    }    
}
