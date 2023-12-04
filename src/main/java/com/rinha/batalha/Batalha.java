package com.rinha.batalha;
import com.rinha.ataque.Ataque;
import com.rinha.ataque.efeito.Efeito;
import com.rinha.galos.Galo;
import com.rinha.interfaceusuario.InterfaceUsuario;
import com.rinha.perfil.Carteira;
import java.util.Random;

public abstract class Batalha {
    
    protected InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
    
    protected Galo player;
    protected Galo maquina;
    protected Carteira carteiraPlayer;
    
    protected Galo atacante;
    protected Galo atacado;
    
    protected String vencedor;
    protected int premio = 10;
    
    // Controle da batalha
    protected boolean aberto;
    
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
            this.vencedor = this.maquina.getApelido();
        } 
        else if (this.maquina.getVidaAtual() <= 0){
            this.vencedor = this.player.getApelido();
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
                
                //logs de informação de funcionamento da batalha 
                System.out.println(atacante.getApelido() + " efetuou ataque " + atacante.getAtaque(ataqueId).getNomeAtaque() + " com dano de " + dano);
                System.out.println("\n Vida de Galo: " + atacante.getNome() + ": " + atacante.getVidaAtual());
                System.out.println(" Estado de Galo: " + atacante.getNome()+ ": "+ atacante.getEstadoAtual().getNomeEstadoAtual());
                
                System.out.println("\n Vida de Galo: " + atacado.getNome() + ": " + atacado.getVidaAtual());
                System.out.println(" Estado de Galo: " + atacado.getNome()+ ": "+ atacado.getEstadoAtual().getNomeEstadoAtual());
                
                
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
            
            if (this.vencedor.equals(player.getApelido())){
                this.carteiraPlayer.deposito(premio);
                System.out.println("Voce possui: " + this.carteiraPlayer.getSaldo()); // Para efeito de log
            }
            
            System.out.println("Entrou em fechar");
            this.player.regeneraVidaAtual();
            this.player.regeneraPontosDePoderOriginal();
            this.setAberto(false);
        }
    }
    
    // Para efeito de log
    public void batalhar(){
        Random random = new Random();
        
        int decidirAtaques;
        int turno = random.nextInt(2);
        
        while ((this.getVencedor() != this.player.getApelido()) && (this.getVencedor() != this.maquina.getApelido())){

            if (turno ==  0){
                
                decidirAtaques = interfaceUsuario.getDecidirAtaques(this.player);
                
                nextTurno(this.player, this.maquina, decidirAtaques);
                turno = 1;
            } else {
                int ataqueAleatorio = random.nextInt(4) +  1; 
                nextTurno(this.maquina, this.player, ataqueAleatorio);
                turno = 0;
            }
          } 
        }
    
    public int getPremio(){
        return this.premio;
    }
    
    public void setPremio(int rodadaAtual) {
        this.premio = premio*rodadaAtual;
    }
    
}
