
package com.rinha.torneio;
import com.rinha.galos.Galo;
import com.rinha.batalha.Batalha;
import com.rinha.batalha.BatalhaTorneio;
import com.rinha.batalha.BatalhaRapida;
import com.rinha.batalha.Batalha;
import com.rinha.perfil.Perfil;
import java.util.ArrayList;
import java.util.List;

public class Torneio {

    // aqui
    protected Perfil player;
    protected ArrayList<Galo> inimigos = new ArrayList<>();
    protected boolean aberto = true;
    protected int rodada = 0;
    protected BatalhaTorneio batalhaAtual;
    protected int dinheiroPremio;
    protected Galo campeao;





    // antigo
    protected int vitorias;
    protected int recompensa = 0;
    protected boolean torneioState = true;
    protected String campeaoTorneio;
    protected int rodadaAtual = 0;

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

    public void fechar(){
        if (this.rodada == inimigos.size()){
            this.aberto = false;
            this.defineCampeao();
            this.premiar();
        }
    }

    public void defineCampeao(){
        if (this.batalhaAtual.getVencedor() == player.getGaloDex().getAtacante()){
            this.campeao = player.getGaloDex().getAtacante();
        }
    }

    public void nextRodada(){
        if (this.aberto){
            if (this.rodada == 0){
                // Primeira batalha rodada = 0
                this.nextBatalha();
                this.rodada += 1;
            }
            else if (this.batalhaAtual.getVencedor() == this.player.getGaloDex().getAtacante()){
                // Caso tenha ganhado a última batalha
                this.atualizarPremio();
                this.nextBatalha();
                this.rodada += 1;
            }
            else {
                // Não ganhou a última batalha, o torneio encerra
                this.premiar();
                this.aberto = false;
            }
        }
        this.fechar();
    }

    public void nextBatalha(){
        this.batalhaAtual = new BatalhaTorneio(this.player, this.inimigos.get(this.rodada));
    }

    public void premiar(){
        if (this.campeao == this.player.getGaloDex().getAtacante()){
            this.player.getGaloDex().addGalo(this.galoPremio);
        }
        this.player.getCarteira().deposito(this.dinheiroPremio);
    }























    public Torneio(Perfil player, Galo primeiroInimigo, Galo segundoInimigo, Galo terceiroInimigo){
        this.player = player;
        this.inimigos.add(primeiroInimigo);
        this.inimigos.add(segundoInimigo);
        this.inimigos.add( terceiroInimigo);
        
        this.galoPremio = terceiroInimigo;
        
        this.vitorias = 0;
    }   
    
    
    
    public void getInimigo(int indexInimigo){
        this.inimigos.get(indexInimigo);
    }
    
    public boolean getState(){
        return this.torneioState;
    }
    
    public void setState(boolean state){
        this.torneioState = state;
    }
    
    public void verificaVitoriaPlayer(BatalhaTorneio batalhaAtual){
        if(batalhaAtual.getApelidoVencedor().equals(this.player.getGaloDex().getAtacante().getApelido())){
            setState(true);
        } else {
            setState(false);
        }
    }

    public String getCampeaoTorneio(){
        return this.campeaoTorneio;
    }

    public void setCampeaoTorneio(String campeaoTorneio){
        this.campeaoTorneio = campeaoTorneio;
    }

    public int getRodadaAtual(){
        return this.rodadaAtual;
    }

    public void setRodadaAtual(){
        this.rodadaAtual += 1;
    }

    
    public void combateTorneio(){   
        setRodadaAtual();
        
        if (this.getState() == true){
            BatalhaTorneio batalhaTorneio = new BatalhaTorneio(this.player, this.inimigos.get(0)); 
            batalhaTorneio.batalhar();
            verificaVitoriaPlayer(batalhaTorneio);
            
            this.inimigos.remove(0);
            
            if (batalhaTorneio.getApelidoVencedor().equals(this.player.getGaloDex().getAtacante().getApelido())){
                
                System.out.println("\n  Parabéns voce venceu a Batalha do torneio");
                
            } else {
                System.out.println("\n  Você Perdeu a batalha, o Torneio ACABOU");
            }
            
            this.setCampeaoTorneio(batalhaTorneio.getApelidoVencedor());
            
            if (this.getCampeaoTorneio().equals(this.player.getGaloDex().getAtacante().getApelido())){
                this.player.getGaloDex().addGalo(this.galoPremio);
                System.out.println("Parabéns, você foi campeão e ganhou o galo: " + this.galoPremio.getNome());
            } 
        }
        
    }
}