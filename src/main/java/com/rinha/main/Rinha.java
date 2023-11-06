package com.rinha.main;
import com.rinha.torneio.Torneio;
import com.rinha.batalha.Batalha;
import com.rinha.galos.GaloItaipava;
import com.rinha.galos.GaloBMW;
import com.rinha.galos.GaloCego;
import com.rinha.galos.GaloCiborg;
import com.rinha.galos.GaloPolicialFederal;


public class Rinha {
    public static void main(String[] args) {
       

        GaloItaipava galinhoitaipava = new GaloItaipava(3, "Mandrake");
        GaloBMW galinhobmw =  new GaloBMW(3, "Pilão");
        GaloCego galinhocegueira = new GaloCego(3, "Meleca");
        GaloPolicialFederal pistolera = new GaloPolicialFederal(4, "Aguia 65");
        GaloCiborg galoCiborg = new GaloCiborg(3,"Citroen");
        
        /* //Teste de Torneio
        Torneio torneio = new Torneio(pistolera, galinhoitaipava, galinhobmw, galinhocegueira);
        torneio.iniciarCompeticao();
        */
        
        Batalha batalha = new Batalha(pistolera, galinhoitaipava);
        batalha.batalhar();
        System.out.println(batalha.getVencedor());
        

        
    }
}
