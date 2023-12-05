package com.rinha.batalha;
import com.rinha.galos.Galo;
import com.rinha.perfil.Perfil;


public class BatalhaTorneio extends Batalha{
    // Construtor
    public BatalhaTorneio(Perfil perfil, Galo maquina){ //Batalha torneio
        this.tipoBatalha = "Torneio";
        this.player = perfil.getGaloDex().getAtacante();
        this.carteiraPlayer = perfil.getCarteira();
        this.maquina = maquina;
        this.aberto = true; //state
        this.premio = 50;
    }
}