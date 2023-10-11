package com.rinha.galos.raridade;

import java.util.Random;

public class Raro extends Raridade{
    
    public Raro(int nivel) {
        
        Random random = new Random();
        // Valor
        // De 50 a 250
        this.valor = 50 * nivel;

        // Defesa (Nível: Mínimo - Máximo)
        // 1: 1 - 16 ; 2: 2 - 17 ; 3: 3 - 18 ; 4: 4 - 19 ; 5: 5 - 20
        this.defesa = random.nextInt(16) + nivel; 

        // Força (Nível: Mínimo - Máximo)
        // 1: 1 - 26 ; 2: 2 - 27 ; 3: 3 - 28 ; 4: 4 - 29 ; 5: 5 - 30
        this.forca = random.nextInt(26) + nivel;

        // Agilidade (Nível: Mínimo - Máximo)
        // 1: 1 - 26 ; 2: 2 - 27 ; 3: 3 - 28 ; 4: 4 - 29 ; 5: 5 - 30
        this.agilidade = random.nextInt(26) + nivel;

        // Vida
        // De 100 a 150
        this.vida = 90 + nivel * 10;
        this.vida += random.nextInt(51);
    }
    
}
