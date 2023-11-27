package com.rinha.galos;

import com.rinha.galos.raridade.Raro;

public class GaloAgiota extends Galo {
        public GaloAgiota(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Agiota");
        setNivel(nivel);
        setTipo("B");
        setVantagem();
        
        // Raridade e atributos
        Raro raridade = new Raro(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Me paga", "Ameaça", "Aumentar os Juros", "Estelionato");
        // Foto
        setFotoBatalha("/imgs/galos/galoagiota.png");
    }    
}
