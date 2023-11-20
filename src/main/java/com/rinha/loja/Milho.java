package com.rinha.loja;

import java.util.Random;

public class Milho extends Item{
    int xp;

    public int getXp() {
        return xp;
    }
    
    public Milho(){
        this.nome = "Milho";
        Random random = new Random();
        this.xp = random.nextInt(20)+10;
        this.preco = this.xp / 3;
    }
}
