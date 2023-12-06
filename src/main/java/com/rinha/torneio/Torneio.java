
package com.rinha.torneio;
import com.rinha.galos.Galo;
import com.rinha.batalha.BatalhaTorneio;
import com.rinha.batalha.Batalha;
import com.rinha.perfil.Perfil;
import java.util.ArrayList;

public class Torneio {

    // aqui
    protected Perfil player;
    protected ArrayList<Galo> inimigos = new ArrayList<>();
    protected boolean aberto = true;
    protected int rodada = 0;
    protected BatalhaTorneio batalhaAtual;
    protected int dinheiroPremio;
    protected Galo campeao;
    protected Galo galoPremio;

    // Construtor
    public Torneio(Perfil player, ArrayList<Galo> inimigos){
        this.player = player;
        this.inimigos = inimigos;
        this.galoPremio = inimigos.get(inimigos.size()-1);
        this.dinheiroPremio = 10;
    }

    // Getters e Setters
    public boolean isAberto() {
        return aberto;
    }

    public Batalha getBatalhaAtual() {
        return batalhaAtual;
    }

    public int getDinheiroPremio() {
        return dinheiroPremio;
    }

    public Galo getGaloPremio() {
        return galoPremio;
    }

    // Métodos
    private void atualizarPremio(){
        this.dinheiroPremio = this.batalhaAtual.getPremio() * this.rodada;
    }

    public void encerrar(){
        if (this.rodada == inimigos.size()){
            this.aberto = false;
            this.defineCampeao();
            this.premiarCampeao();
        }
    }

    public void premiarCampeao(){
        this.player.getGaloDex().addGalo(this.galoPremio);
        this.player.getCarteira().deposito(this.dinheiroPremio);
    }
    
    public void defineCampeao(){
        if (this.batalhaAtual.getVencedor() == player.getGaloDex().getAtacante()){
            this.campeao = player.getGaloDex().getAtacante();
            this.premiarCampeao();
        }
    }

    public boolean nextRodada(){
        if (this.aberto){
            if (this.rodada == 0){
                // Primeira batalha rodada = 0
                System.out.println("Primeira rodada.");
                this.nextBatalha();
                this.rodada += 1;
            }
            else if (this.batalhaAtual.getVencedor() == this.player.getGaloDex().getAtacante()){
                // Caso tenha ganhado a última batalha
                System.out.println("Rodada subsequente.");
                this.atualizarPremio();
                this.nextBatalha();
                this.rodada += 1;
            }
            else {
                // Não ganhou a última batalha, o torneio encerra
                System.out.println("Perdeu o torneio");
                this.aberto = false;
            }
        }
        System.out.println("Torneio aberto?" + this.aberto);
        this.encerrar();
        return aberto;
    }

    public void nextBatalha(){
        this.batalhaAtual = new BatalhaTorneio(this.player, this.inimigos.get(this.rodada));
    }

}