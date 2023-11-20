package com.rinha.batalha;
import com.rinha.galos.Galo;
import java.util.Random;
import com.rinha.ataque.Ataque;
import com.rinha.galos.Galinheiro;
import com.rinha.interfaceusuario.InterfaceUsuario;

public class Batalha{
    protected InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
    
    protected Galo player;
    protected Galo maquina;
    
    protected Galo atacante;
    protected Galo atacado;
    
    protected String vencedor;
    protected int premio;
    
    // Controle da batalha
    protected boolean aberto;
    
    // Construtor
    public Batalha(Galo player, Galo maquina){
        this.player = player;
        this.maquina = maquina;
        this.aberto = true;
    }
    public Batalha(Galo player){
        this.player = player;
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
    
    // Modificadores e Acessores
    public void setAtacante(Galo atacante){
        this.atacante = atacante;
    }    
    
    public void setAtacado(Galo atacado){
        this.atacado = atacado;
    }
    
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

    public void setVencedor(){
        
        if (this.player.getVidaAtual() <= 0){
            this.vencedor = this.maquina.getNome();
        } 
        else if (this.maquina.getVidaAtual() <= 0){
            this.vencedor = this.player.getNome();
        } else {
            this.vencedor = null;
        }
    }
    
    public String getVencedor(){
        return this.vencedor;
    }
    
    public void setAberto(boolean b){
        this.aberto = false;
    }
    
    public boolean isAberto(){
        return this.aberto;
    }
    
    public void atualizaPontosDePoder(Galo galo, int ataqueId){       
        Ataque ataque = galo.getAtaque(ataqueId);
        ataque.decrementaPontosDePoderAtual();
    }
    
    public int quantidadePontosDePoder(Galo galo, int ataqueId){
        //Função serve para verificar a quantidade de pontos de poder, recebe o numero do ataque 
        Ataque ataque = galo.getAtaque(ataqueId);
        int ppAtual = ataque.getPontosDePoderAtual();
        return ppAtual;
    }
    
    public boolean verificaPontosDePoder(Galo galo, int ataqueId){
        int ppAtual = this.quantidadePontosDePoder(galo, ataqueId);
        return ppAtual > 0;
    }
    
    public boolean nextTurno(Galo atacante, Galo atacado, int ataqueId){
        boolean concluido = false;
        int pp = atacante.getAtaque(ataqueId).getPontosDePoderAtual();
        int dano;
        if (aberto && pp > 0){
            if (atacado.esquivar()){
                System.out.println("Opa! " + atacado.getApelido() + " esquivou legal!");
                concluido = true;
            }
            else {
                dano = atacante.atacar(atacado,ataqueId);
                atacado.setVidaAtual(atacado.getVidaAtual() - dano);
                concluido = true;
                
                System.out.println(atacante.getApelido() + " efetuou ataque " + atacante.getAtaque(ataqueId).getNomeAtaque() + " com dano de " + dano);
                System.out.println("Vida de Galo: " + atacante.getNome() + ": " + atacante.getVidaAtual());
                System.out.println("Vida de Galo: " + atacado.getNome() + ": " + atacado.getVidaAtual());
            }
            this.atualizaPontosDePoder(atacante, ataqueId);
        }
        this.setVencedor();
        this.fechar();
        return concluido;
    }
    
    public void turnoMaquina(){
        Random random = new Random();
        int ataqueId = random.nextInt(4)+1;
        
        while (!this.verificaPontosDePoder(maquina, ataqueId)){
            ataqueId = random.nextInt(4)+1;
        }
        this.nextTurno(this.maquina, this.player, ataqueId);
    }
    
    public boolean turnoPlayer(int atqId){
        boolean turnoRealizado;
        turnoRealizado = this.nextTurno(this.player, this.maquina, atqId);
        return turnoRealizado;
    }
    
    private void fechar(){
        if (this.getVencedor()!= null){
            this.setAberto(false);
        }
    }
    
    /*
    public int combate(Galo atacante, Galo atacado, int ataqueId){    
        this.setAtacante(atacante);
        this.setAtacado(atacado);
        
 
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
    */
}