package com.rinha.galos.raridade;

import java.util.Random;

public class Lendario extends Raridade {
    
    public Lendario(int nivel){
        Random random = new Random();
        // Tipo de raridade
        this.tipoRaridade = "Lendario";

        // Valor
        // De 200 a 1000
        this.valor = 200 * nivel;

        // Defesa (Nível: Mínimo - Máximo)
        // 1: 46 - 56 ; 2: 47 - 57 ; 3: 48 - 58  4: 49 - 59 ; 5: 50 - 60
        this.defesa = random.nextInt(11) + 45 + nivel; 

        // Força (Nível: Mínimo - Máximo)
        // 1: 61 - 71 ; 2: 62 - 72 ; 3: 63 - 73  4: 64 - 74 ; 5: 65 - 75
        this.forca = random.nextInt(11) + 60 + nivel;

        // Agilidade (Nível: Mínimo - Máximo)
        // 1: 61 - 71 ; 2: 62 - 72 ; 3: 63 - 73  4: 64 - 74 ; 5: 65 - 75
        this.agilidade = random.nextInt(11) + 60 + nivel;

        // Vida
        // De 245 a 350
        this.vida = 230 + nivel * 15;
        this.vida += random.nextInt(46);
    }
}
