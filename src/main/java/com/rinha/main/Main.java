package com.rinha.main;
import com.rinha.batalha.BatalhaRapida;
import com.rinha.galos.*;
import com.rinha.gui.mainFrame;
import com.rinha.torneio.Torneio;
import com.rinha.perfil.Perfil;



public class Main {
    public static void main(String[] args) {
        //new mainFrame().setVisible(true);
        Galinheiro gl = new Galinheiro();

        Perfil meuPerfil = new Perfil("Caiola");
        
        GaloItaipava galoCharlie = new GaloItaipava(4, "Chorao", gl.flyWeightFotos.getItaipava());
        meuPerfil.getGaloDex().setAtacante(galoCharlie);
        
        GaloAgiota galoAgiota = new GaloAgiota(3, "Agioter", gl.flyWeightFotos.getAgiota());
        GaloBMW galoBmw = new GaloBMW(3, "Bmwabler", gl.flyWeightFotos.getBmw());
        GaloCAM galoMineiro = new GaloCAM(3,  "Galoucura", gl.flyWeightFotos.getCam());
        
         //Teste Torneio
        
        Torneio torneioTeste = new Torneio(meuPerfil, galoAgiota, galoBmw, galoMineiro);
        
        for (int i = 0; i < 3; i++){
            torneioTeste.combateTorneio();
        }
        
        System.out.println("O Campeão do torneio foi: " + torneioTeste.getCampeaoTorneio());
        
        
        /* //Teste Batalha Rápida
        BatalhaRapida batalha = new BatalhaRapida(meuPerfil);
        batalha.batalhar();
        System.out.println("Vencedor: " + batalha.getVencedor());
        */
        
    }
}
