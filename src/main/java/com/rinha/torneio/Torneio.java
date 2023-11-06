
package com.rinha.torneio;
import com.rinha.galos.Galo;
import com.rinha.batalha.Batalha;
import java.util.ArrayList;
import java.util.List;

public class Torneio {

    protected Galo jogador;
    protected String nomeJogador;
    List<Galo> inimigos = new ArrayList<>();
    protected int vitorias;
    protected int recompensa = 0;
    protected String vencedor;
    protected boolean continua = true;
    protected int cont = 0;
    
    public Torneio(Galo jogador, Galo primeiroInimigo, Galo segundoInimigo, Galo terceiroInimigo){
        this.nomeJogador = jogador.getNome();
        this.jogador = jogador;
        this.inimigos.add(primeiroInimigo);
        this.inimigos.add(segundoInimigo);
        this.inimigos.add( terceiroInimigo);
        this.vitorias = 0;
    }    
    
    public void combateTorneio(int i){
        System.out.println((i + 1) + "º BATALHA DO TORNEIO");
        Batalha batalhaTorneio = new Batalha(this.jogador, this.inimigos.get(i));
        batalhaTorneio.batalhar();
        this.vencedor = batalhaTorneio.getVencedor();
        
    }
    
    public void iniciarCompeticao(){
        
        int i = 0;
        while(this.vencedor == null || this.vencedor.equals(this.nomeJogador)){
            this.combateTorneio(i);
            i+=1;
            
            if (i == 1){
                System.out.println("PARÁBENS, VOCÊ VENCEU O TORNEIO");
                break;
            }
        } 
        
        if(!(this.vencedor.equals(this.nomeJogador))){
            System.out.println("Fim de Torneio, Você perdeu");
        }
    }
    
    
}