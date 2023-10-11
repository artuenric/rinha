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

                  switch (decidirAtaques) {
                        case 1:
                            player.atacar(maquina,0);
                            System.out.println("\nO Galo: " + this.player.getNome() + " efetuou o ataque: " + this.player.getAtaque(0) + " efetuando 10 de dano");      
                            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
                            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
                            break;
                        case 2:                      
                            player.atacar(maquina, 1);
                            System.out.println("\nO Galo: " + this.player.getNome() + " efetuou o ataque: " + this.player.getAtaque(1) + " efetuando 20 de dano");        
                            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
                            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
                            break;
                        case 3:                        
                            player.atacar(maquina, 2);
                            System.out.println("\nO Galo: " + this.player.getNome() + " efetuou o ataque: " + this.player.getAtaque(2) + " efetuando 30 de dano");            
                            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
                            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
                            break;
                        case 4:
                            player.atacar(maquina, 3);
                            System.out.println("\nO Galo: " + this.player.getNome() + " efetuou o ataque: " + this.player.getAtaque(3) + " efetuando 40 de dano");                       
                            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
                            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
                            break;
                        default:
                            System.out.println("\nErro ao atacar");
                            break;
                   }
                  turno = 1;
            } else {
                int ataqueAleatorio = random.nextInt(4) + 1; //se adicionar +1 existe a possibilidade de erro ao atacar.

                switch (ataqueAleatorio) {
                        case 1:
                            maquina.atacar(player, 0);
                            System.out.println("\nO Galo: " + this.maquina.getNome() + " efetuou o ataque: " + this.maquina.getAtaque(0) + " efetuando 10 de dano");
                            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
                            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
                            break;
                        case 2:                      
                            maquina.atacar(player, 1);
                            System.out.println("\nO Galo: " + this.maquina.getNome() + " efetuou o ataque: " + this.maquina.getAtaque(1) + " efetuando 20 de dano");
                            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
                            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
                            break;
                        case 3:                        
                            maquina.atacar(player, 2);
                            System.out.println("\nO Galo: " + this.maquina.getNome() + " efetuou o ataque: " + this.maquina.getAtaque(2) + " efetuando 30 de dano");
                            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
                            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
                            break;
                        case 4:
                            maquina.atacar(player, 3);
                            System.out.println("\nO Galo: " + this.maquina.getNome() + " efetuou o ataque: " + this.maquina.getAtaque(3) + " efetuando 40 de dano");
                            System.out.println("Vida de Galo: " + this.player.getNome() + ": " + this.player.getVida());
                            System.out.println("Vida de Galo: " + this.maquina.getNome() + ": " + this.maquina.getVida());
                            break;
                        default:
                            System.out.println("Erro ao atacar");
                            break;
                   }
               turno = 0;
          } 
          
          this.setVencedor();
        }
    
    }
    
    
}
