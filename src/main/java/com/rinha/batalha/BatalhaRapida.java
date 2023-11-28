package com.rinha.batalha;
import com.rinha.galos.Galinheiro;
import com.rinha.perfil.Perfil;


public class BatalhaRapida extends Batalha{
    
    public BatalhaRapida(Perfil perfil){ //Batalha Rápida
        this.player = perfil.getGaloDex().getAtacante();
        this.carteiraPlayer = perfil.getCarteira();
        int nivelPlayer = player.getNivel();
        // Definindo adversário com base no player
        Galinheiro galinheiro = new Galinheiro();
        switch (player.getRaridade()){
            case "Raro":{
                this.maquina = galinheiro.getRandomGaloRaro(nivelPlayer);
                break;
            }
            case "Epico":{
                this.maquina = galinheiro.getRandomGaloEpico(nivelPlayer);
                break;
            }
            case "Lendario":{
                this.maquina = galinheiro.getRandomGaloLendario(nivelPlayer);
                break;
            }
        }
        
        // Batalha aberta
        this.aberto = true;
    }
    
}