package com.rinha.loja;

import java.util.Random;

public class Milho extends Iten{
    int xp;
    
    public Milho(){
        this.nome = "Milho";
        Random random = new Random();
        this.xp = random.nextInt(20)+10;
        this.preco = this.xp / 3;
    }
}
