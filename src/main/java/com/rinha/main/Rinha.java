package com.rinha.main;
import com.rinha.batalha.Batalha;
import com.rinha.galos.GaloItaipava;
import com.rinha.galos.GaloBMW;
import com.rinha.galos.GaloCego;


public class Rinha {
    public static void main(String[] args) {
       

        GaloItaipava galinhoitaipava = new GaloItaipava(3, "eu mermo");
        GaloBMW galinhobmw =  new GaloBMW(3, "caio");
        GaloCego galinhocegueira = new GaloCego(3, "neyma");
        
        System.out.println(galinhoitaipava.getStatus());
        System.out.println(galinhocegueira.getStatus());
        
        Batalha vamove = new Batalha(galinhoitaipava, galinhocegueira);
        
        vamove.batalhar();
        System.out.println("O Vencedor da Batalha foi: " + vamove.getVencedor());

        
    }
}
