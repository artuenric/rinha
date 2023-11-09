package com.rinha.galos;

import java.util.Random;

public class Galinheiro {
    Galo[] todos = new Galo[6];
    
    public Galinheiro(int nivel){
        gerarGalos(nivel);
    }
    
    public Galo getGalo(int i) {
        return todos[i];
    }
    
    public Galo[] gerarGalos(int nivel){
        Random random = new Random();
        Galo[] galos = new Galo[6];
        Galo galo;
        String nome = "Maquininha";
        
        galo = new GaloCego(nivel, nome);
        
        for (int x = 0; x < 6; x++){
            int escolha = random.nextInt(6);
            System.out.println(x);
            switch (escolha){
                case 0:{
                    galo = new GaloBMW(nivel, nome);
                    break;
                }
                case 1:{
                    galo = new GaloCego(nivel, nome);
                    break;
                }
                case 2:{
                    galo = new GaloCiborg(nivel, nome);
                    break;
                }
                case 3:{
                    galo = new GaloItaipava(nivel, nome);
                    break;
                }
                case 4:{
                    galo = new GaloFebem(nivel, nome);
                    break;
                }
            }
            
            galos[x] = galo;
        }
        
        this.todos = galos;
        return galos;
    }
}
