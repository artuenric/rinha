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
    
    public int c = 0;
    
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
        Ataque ataque = this.atacante.getAtaque(ataqueId);
        ataque.decrementaPontosDePoderAtual();
    }
    
    public int quantidadePontosDePoder(int ataqueId){
        //Função serve para verificar a quantidade de pontos de poder, recebe o numero do ataque 
        Ataque ataque = this.atacante.getAtaque(ataqueId);
        int ppAtual = ataque.getPontosDePoderAtual();
        return ppAtual;
    }
    
    public boolean verificaPontosDePoder(int ataqueId){
        int ppAtual = this.quantidadePontosDePoder(ataqueId);
        if (ppAtual > 0){
            return true;
        }
        return false;
    }
    
    public int combate(Galo atacante, Galo atacado, int ataqueId){    
        this.setAtacante(atacante);
        this.setAtacado(atacado);
        
        System.out.println(this.c);
        System.out.println("");
        int dano = 0;    
              
        if (this.atacado.esquivar()){
            //System.out.println("\nMinha nossa! " + this.atacado.getApelido() + " esquivou!");
            System.out.println("");
        } else {
            dano = this.atacante.atacar(this.atacado,ataqueId);
            this.atacado.setVidaAtual(this.atacado.getVidaAtual() - dano);
        }
        System.out.println("player" + player.getStatus());
        System.out.println("maquina" + maquina.getStatus());
        
        System.out.println("atacante atual" + atacante.getStatus());
        System.out.println("atacado atual" + atacado.getStatus());
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //System.out.println("\nO Galo: " + this.atacante.getNome() + " efetuou o ataque: " + this.atacante.getNomeAtaque(ataqueId) + ", o dano foi de " + dano);
        //System.out.println("Vida de Galo: " + this.atacante.getNome() + ": " + this.atacante.getVidaAtual());
        //System.out.println("Vida de Galo: " + this.atacado.getNome() + ": " + this.atacado.getVidaAtual());

        this.atualizaPontosDePoder(ataqueId);

        return dano;
    }
    
    public void turnoMaquina(){
        // Maquina ataca
        this.setAtacante(this.maquina);
        Random random = new Random();
        int ataqueId = random.nextInt(4)+1;
        while(!this.verificaPontosDePoder(ataqueId)){
            ataqueId = random.nextInt(4)+1;
        }
        this.combate(this.maquina, this.player, ataqueId);
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