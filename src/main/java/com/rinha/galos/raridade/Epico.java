package com.rinha.galos.raridade;

import java.util.Random;

public class Epico extends Raridade {
    
    public Epico(int nivel){
        Random random = new Random();
        // Tipo de raridade
        this.tipoRaridade = "Epico";
        
        // Valor
        // De 100 a 500
        this.valor = 100 * nivel;

        // Defesa (Nível: Mínimo - Máximo)
        // 1: 26 - 36 ; 2: 27 - 37 ; 3: 28 - 38 ; 4: 29 - 39 ; 5: 30 - 40
        this.defesa = random.nextInt(11) + 25 + nivel; 

        // Força (Nível: Mínimo - Máximo)
        // 1: 31 - 41 ; 2: 32 - 42 ; 3: 33 - 43 ; 4: 34 - 44 ; 5: 35 - 45
        this.forca = random.nextInt(11) + 30 + nivel;

        // Agilidade (Nível: Mínimo - Máximo)
        // 1: 31 - 41 ; 2: 32 - 42 ; 3: 33 - 43 ; 4: 34 - 44 ; 5: 35 - 45
        this.agilidade = random.nextInt(11) + 30 + nivel;

        // Vida
        // De 115 a 225
        this.vida = 100 + nivel * 15;
        this.vida += random.nextInt(51);
    }
}