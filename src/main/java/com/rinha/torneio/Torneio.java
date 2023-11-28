
package com.rinha.torneio;
import com.rinha.galos.Galo;
import com.rinha.batalha.Batalha;
import com.rinha.perfil.Perfil;
import java.util.ArrayList;
import java.util.List;

public class Torneio {

    protected Perfil player;
    ArrayList<Galo> inimigos = new ArrayList<>();
    protected int vitorias;
    protected int recompensa = 0;
    protected boolean torneioState = true;
    protected String campeaoTorneio;
    
    public Torneio(Perfil player, Galo primeiroInimigo, Galo segundoInimigo, Galo terceiroInimigo){
        this.player = player;
        this.inimigos.add(primeiroInimigo);
        this.inimigos.add(segundoInimigo);
        this.inimigos.add( terceiroInimigo);
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
    
    public void verificaVitoriaPlayer(Batalha batalhaAtual){
        if(batalhaAtual.getVencedor().equals(this.player.getGaloDex().getAtacante().getApelido())){
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
    
    public void combateTorneio(){
        
        if (this.getState() == true){
            Batalha batalhaTorneio = new Batalha(this.player, this.inimigos.get(0)); 
            batalhaTorneio.batalhar();
            verificaVitoriaPlayer(batalhaTorneio);
            
            this.inimigos.remove(0);
            
            if (batalhaTorneio.getVencedor().equals(this.player.getGaloDex().getAtacante().getApelido())){
                System.out.println("\n  Parabéns voce venceu a Batalha do torneio");
            } else {
                System.out.println("\n  Você Perdeu a batalha, o Torneio ACABOU");
            }
            
            this.setCampeaoTorneio(batalhaTorneio.getVencedor());
            
        }
        
    }
    

}