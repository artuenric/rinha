package com.rinha.batalha;
import com.rinha.galos.Galo;
import java.util.Random;
import java.util.Scanner;

public class Batalha {
    private Galo player;
    private Galo maquina;
    private String vencedor;
    private int premio;
    
    public Batalha(Galo player, Galo maquina){
        this.player = player;
        this.maquina = maquina;
    }
    
    Scanner sc = new Scanner(System.in);
    
    // Modificadores e Acessores
    public Galo getPlayer() {
        return player;
    }

    public void setPlayer(Galo player) {
        this.player = player;
    }

    public Galo getMaquina() {
        return maquina;
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
    
    public void infoTurno(int turn, int ataqueId){
        
        int dano = 0;
        
        if (turn == 0){
            
            if (this.maquina.esquivar()){
                System.out.println("\nMinha nossa! " + this.maquina.getApelido() + " esquivou!");
            } else {
                dano = this.player.atacar(this.maquina,ataqueId);
                this.maquina.setVida(this.maquina.getVida() - dano);
            }
            System.out.println("\nO Galo: " + this.player.getNome() + " efetuou o ataque: " + this.player.getAtaque(ataqueId - 1) + ", o dano foi de " + dano);
            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
            
        } else if(turn == 1){
            
            if (this.player.esquivar()){
                  System.out.println("\nMinha nossa! " + this.player.getApelido() + " esquivou!");
            } else {
                  dano = this.maquina.atacar(this.player,ataqueId);
                  this.player.setVida(this.player.getVida() - dano);
            }
            System.out.println("\nO Galo: " + this.maquina.getNome() + " efetuou o ataque: " + this.maquina.getAtaque(ataqueId - 1) + ", o dano foi de " + dano);
            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
        }
    }
    
    // Métodos principais
    
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
                System.out.print("\nAtaques disponiveis: " + this.player.getAtaques() + "\n Escolha um ataque: ");
                decidirAtaques = sc.nextInt();
                
                infoTurno(turno, decidirAtaques);
                turno = 1;
            } else {
                    int ataqueAleatorio = random.nextInt(4) +  1; 

                infoTurno(turno, ataqueAleatorio);
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