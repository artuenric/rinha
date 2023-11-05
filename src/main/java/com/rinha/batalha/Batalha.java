package com.rinha.batalha;
import com.rinha.galos.Galo;
import java.util.Random;
import com.rinha.ataque.Ataque;
import com.rinha.interfaceusuario.InterfaceUsuario;

public class Batalha{
    protected InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
    
    protected Galo player;
    protected Galo maquina;
    
    protected Galo atacante;
    protected Galo atacado;
    
    protected String vencedor;
    protected int premio;
    
    public Batalha(Galo player, Galo maquina){
        this.player = player;
        this.maquina = maquina;
    }
    
    public void setAtacante(Galo atacante){
        this.atacante = atacante;
    }    
    
    public void setAtacado(Galo atacado){
        this.atacado = atacado;
    }
    
    // Modificadores e Acessores
    public Galo getPlayer() {
        return this.player;
    }

    public void setPlayer(Galo player) {
        this.player = player;
    }

    public Galo getMaquina() {
        return this.maquina;
    }

    public void setMaquina(Galo maquina) {
        this.maquina = maquina;
    }

    public void setVencedor() {
        
        if (this.player.getVida() <= 0){
            this.vencedor = this.maquina.getNome();
        } 
        else if (this.maquina.getVida() <= 0){
            this.vencedor = this.player.getNome();
        } else {
            this.vencedor = null;
        }
    }
    
    public String getVencedor(){
        return this.vencedor;
    }
    
    public void atualizaPontosDePoder(int ataqueId){
        /*Função serve para atualizar os pontos de poder, recebendo o numero do ataque 
        (de acordo com a interface de linha de comando que controla os ataques, ainda não está adaptado para botões)*/
        
        switch(ataqueId){ //decrementa pontos de poder para controle dos mesmos
            case 1:
                this.atacante.getAtqBasico().setPontosDePoderAtual(this.atacante.getAtqBasico().getPontosDePoderAtual() - 1); //Remove 1 de PP do ataque basico
            break;
            case 2:
                this.atacante.getAtqTipificado().setPontosDePoderAtual(this.atacante.getAtqTipificado().getPontosDePoderAtual() - 1); //Remove 1 de PP do ataque tipificado
            break;
            case 3:
               this.atacante.getAtqAgil().setPontosDePoderAtual(this.atacante.getAtqAgil().getPontosDePoderAtual() - 1); //Remove 1 de PP do ataque agil
            break;
            case 4:
                this.atacante.getAtqUltimate().setPontosDePoderAtual(this.atacante.getAtqUltimate().getPontosDePoderAtual() - 1); //Remove 1 de PP do ataque ultimate
            break;
        }    
    }
    
    public int verificaPontosDePoder(int ataqueId){
        /*Função serve para verificar a quantidade de pontos de poder, recebe o numero do ataque 
        (de acordo com a interface de linha de comando que controla os ataques, ainda não está adaptado para botões)*/
        
        
        if (ataqueId == 1){
            return this.atacante.getAtqBasico().getPontosDePoderAtual(); 
        }
        
        if(ataqueId == 2){   
            return this.atacante.getAtqTipificado().getPontosDePoderAtual(); 
        }
        
        if (ataqueId == 3){
            return this.atacante.getAtqAgil().getPontosDePoderAtual();
        }
        
        if (ataqueId == 4){
           return this.atacante.getAtqUltimate().getPontosDePoderAtual();
        }
        
        return 0;
    }
    
    /*
    public void infoTurno(int turn, int ataqueId){
        
        int dano = 0;
        
        if (turn == 0){ //Vez do Player
            
            this.atualizaPontosDePoder(ataqueId);    
                   
            if (this.maquina.esquivar()){
                System.out.println("\nMinha nossa! " + this.maquina.getApelido() + " esquivou!");
            } else {
                dano = this.player.atacar(this.maquina,ataqueId);
                this.maquina.setVida(this.maquina.getVida() - dano);
            }
            
            System.out.println("\nO Galo: " + this.player.getNome() + " efetuou o ataque: " + this.player.getNomeAtaque(ataqueId) + ", o dano foi de " + dano);
            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
            
        } else if(turn == 1){ //Vez da Máquina
            
            if (this.player.esquivar()){
                  System.out.println("\nMinha nossa! " + this.player.getApelido() + " esquivou!");
            } else {
                  dano = this.maquina.atacar(this.player,ataqueId);
                  this.player.setVida(this.player.getVida() - dano);
            }
            System.out.println("\nO Galo: " + this.maquina.getNome() + " efetuou o ataque: " + this.maquina.getNomeAtaque(ataqueId) + ", o dano foi de " + dano);
            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
        }
    }
    */
    
    // Métodos principais
    
    public void combate(Galo atacante, Galo atacado, int ataqueId){
        
        this.setAtacante(atacante);
        this.setAtacado(atacado);
        
        int dano = 0;
        
        if(this.verificaPontosDePoder(ataqueId) == 0){
            System.out.println("Pontos de Poder Insuficiente para utilização do ataque");
        } else {
                   
            if (this.atacado.esquivar()){
                System.out.println("\nMinha nossa! " + this.atacado.getApelido() + " esquivou!");
            } else {
                dano = this.atacante.atacar(this.atacado,ataqueId);
                this.atacado.setVida(this.atacado.getVida() - dano);
            }

            System.out.println("\nO Galo: " + this.atacante.getNome() + " efetuou o ataque: " + this.atacante.getNomeAtaque(ataqueId) + ", o dano foi de " + dano);
            System.out.println("Vida de Galo: " + this.atacante.getNome() + ": " + this.atacante.getVida());
            System.out.println("Vida de Galo: " + this.atacado.getNome() + ": " + this.atacado.getVida());
            
            this.atualizaPontosDePoder(ataqueId);
        }    
    }
    
    public void batalhar(){
        // Ataca o galo inimigo
        // Ver depois
        // [0] Dá o daninho e vai comendo vida, [1] mais dano menos pp, [2] um pouco mais dano menos pp tipo influencia, [3] bem mais dano, bem menos pp
        
        //modelo de batalha (NECESSARIO REVISAR)
        
        Random random = new Random();
        
        int decidirAtaques;
        int turno = random.nextInt(2);
        
        while ((this.getVencedor() != this.player.getNome()) && (this.getVencedor() != this.maquina.getNome())){
            
            if (turno ==  0){
                
                decidirAtaques = interfaceUsuario.getDecidirAtaques(this.player);
                
                combate(this.player, this.maquina, decidirAtaques);
                this.setPlayer(this.atacante);
                this.setMaquina(this.atacado);
                turno = 1;
            } else {
                int ataqueAleatorio = random.nextInt(4) +  1; 

                combate(this.maquina, this.player, ataqueAleatorio);
                this.setMaquina(this.atacante);
                this.setPlayer(this.atacado);
                turno = 0;
          } 
          
          this.setVencedor();
        }
    
    }
    
    
}

/*
        // Bonus pela raridade do Galo
        switch (this.raridade) {
            case "Raro" -> bonus = 3 * this.nivel;
            case "Epico" -> bonus = 5 * this.nivel;
            case "Lendario" -> bonus = 7 * this.nivel;
            default -> System.out.println("A raridade fornecida para " + getStatus() + " não está de acordo aos valores aceitos.");
        }
*/