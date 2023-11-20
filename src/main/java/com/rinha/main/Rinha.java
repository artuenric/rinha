package com.rinha.main;
import com.rinha.batalha.Batalha;
import com.rinha.galos.Galinheiro;
import com.rinha.galos.Galo;
import com.rinha.galos.GaloItaipava;
import com.rinha.galos.GaloBMW;
import com.rinha.galos.GaloCego;
import java.util.Random;
import java.util.Scanner;


public class Rinha {
    public static void main(String[] args) {

        
        
        /*
        GaloItaipava galinhoitaipava = new GaloItaipava(3, "eu mermo");
        GaloBMW galinhobmw =  new GaloBMW(3, "caio");
        GaloCego galinhocegueira = new GaloCego(3, "neyma");
        
        System.out.println(galinhoitaipava.getStatus());
        System.out.println(galinhocegueira.getStatus());
        
        Batalha vamove = new Batalha(galinhoitaipava, galinhocegueira);
        int turno = 0;
        int ataqueId = 0;
        Random random = new Random();
        
        while(vamove.isAberto()){
            System.out.println("\n While da main, vez do Player");
            if (turno == 0){
                ataqueId = random.nextInt(4)+1;
                vamove.nextTurno(vamove.getPlayer(), vamove.getMaquina(), ataqueId);
                turno = 1;
            }
            else if (turno == 1){
                System.out.println("\n While da main, vez da Maquina");
                vamove.turnoMaquina();
                turno = 0;
            }
        }
        
        System.out.println("OOOOOOOOOOOOOOOO Vencedor da Batalha foi: " + vamove.getVencedor());
        
        // O galo muda que nem ontem, muito foda
        System.out.println(galinhoitaipava.getStatus());
        System.out.println(galinhocegueira.getStatus());
        */
    }
}
