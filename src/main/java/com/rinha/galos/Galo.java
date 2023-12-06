package com.rinha.galos;
import com.rinha.batalha.estadogalo.*;
import com.rinha.ataque.*;
import com.rinha.galos.raridade.Raridade;
import com.rinha.loja.Milho;

import java.util.Random;
import javax.swing.ImageIcon;

public class Galo {
    
    // Propriedades Básicas do Galo
    protected String apelido;          // Nome personalizado para o Galo
    protected String nome;             // Galo Alguma Coisa
    protected String raridade;         // Lendário, Épico, Raro
    protected int nivel;               // Nivel do galo
    protected int xp;                  // Experiência para evolução
    protected String tipo;             // 3 tipos: A, B e C
    protected String vantagem;         // A bate em B, B bate em C, C bate em A
    protected int valor;               // Preço de venda
    protected int forca;               // Força do galo: 1  - 100
    protected int defesa;              // Defesa do galo:  1  - 100
    protected int agilidade;           // Agilidade do galo: 1  - 100
    protected int vida;                // Vida Original do galo: 10 - 1.000
    protected int vidaAtual;            // Vida atual do gal. Finalidade: Alteração de vida na batalha
    protected EstadoGalo estado = new EstadoNormal(); //Estado atual do galo.
    
    
    //Contador de quantas rodadas o Galo está com o mesmo Estado, finalidade é o controle de estado
    protected int contadorEstado = 0;
    
    //ATAQUES
    protected AtaqueBasico atqBasico;
    protected AtaqueTipificado atqTipificado;
    protected AtaqueAgil atqAgil;
    protected AtaqueUltimate atqUltimate;
    
    // Interface
    protected ImageIcon fotoBatalha;
    
    // Getters e Setters
    public ImageIcon getFotoBatalha() {
        return fotoBatalha;
    }

    public EstadoGalo getEstadoAtual(){
        return this.estado;
    }
    
    //Modificadores e Acessores do contador de estado do galo 
    
    public int getContadorEstado(){
        return this.contadorEstado;
    }
    
    public void setContadorEstado(){
        this.contadorEstado++;
    }
    
    public void zeraContadorEstado(){
        this.contadorEstado = 0;
    }
    
    // Manipulação de estado do galo
    public void setEstadoAtual(EstadoGalo novoEstado){
        this.estado = novoEstado;
    }
    
    public void setFotoBatalha(ImageIcon fotoBatalha) {
        this.fotoBatalha = fotoBatalha;
    }
    
    //Modificadores e Acessores dos ataques
    
    public AtaqueBasico getAtqBasico(){
        return atqBasico;
    }
    
    public AtaqueTipificado getAtqTipificado(){
        return atqTipificado;
    }
    
    public AtaqueUltimate getAtqUltimate(){
        return atqUltimate;
    }
    
    public AtaqueAgil getAtqAgil(){
        return atqAgil;
    }
    
    public Ataque getAtaque(int ataqueId){
        Ataque ataque = null;     
        switch (ataqueId){
            case 1:{
                ataque = this.getAtqBasico();
                break;
            }
            case 2:{
                ataque = this.getAtqTipificado();
                break;
            }
            case 3:{
                ataque = this.getAtqAgil();
                break;
            }
            case 4:{
                ataque = this.getAtqUltimate();
                break;
            }
        }
        return ataque;
    }
     
    public void setAtaques(String nomeAtaqueBasico, String nomeAtaqueTipificado, String nomeAtaqueAgil, String nomeAtaqueUltimate){
        // Define os ataques e seus nomes
        this.atqBasico = new AtaqueBasico(nomeAtaqueBasico, this.forca, this.nivel, this.agilidade);
        this.atqTipificado = new AtaqueTipificado(nomeAtaqueTipificado, this.nivel, this.defesa, this.agilidade);
        this.atqAgil = new AtaqueAgil(nomeAtaqueAgil, this.forca, this.nivel, this.agilidade);
        this.atqUltimate = new AtaqueUltimate(nomeAtaqueUltimate, this.forca, this.nivel, this.agilidade);
        this.setVantagem();
    }
    
    // Para efeito de log
    public String getInfoAtaques(){
    return    "\n Ataquei 1: " + this.atqBasico.getNomeAtaque() + " PP: " + this.atqBasico.getPontosDePoderAtual() +
              "\n Ataquei 2: " + this.atqTipificado.getNomeAtaque() + " PP: " + this.atqTipificado.getPontosDePoderAtual() +
              "\n Ataquei 3: " + this.atqAgil.getNomeAtaque() + " PP: " + this.atqAgil.getPontosDePoderAtual() +
              "\n Ataquei 4: " + this.atqUltimate.getNomeAtaque() + " PP: " + this.atqUltimate.getPontosDePoderAtual();
    }
    
    // Para efeito de log
    public String getStatus(){
        return      "\n Nome do Galo: " + this.nome +
                      "\n Raridade: " + this.raridade +
                      "\n Nivel: " + this.nivel +
                      "\n Vida: " + this.vidaAtual  +
                      "\n Forca: " + this.forca +
                      "\n Defesa: " + this.defesa +
                      "\n Agilidade: " + this.agilidade +
                      "\n Valor: " + this.valor + " Moedas" +
                      "\n Ataquei 1: " + this.atqBasico.getNomeAtaque() +
                      "\n Ataquei 2: " + this.atqTipificado.getNomeAtaque() +
                      "\n Ataquei 3: " + this.atqAgil.getNomeAtaque() +
                      "\n Ataquei 4: " + this.atqUltimate.getNomeAtaque();
    }
    
    public int getVidaPercentual(){
        int vidaPercentual = (this.getVidaAtual() * 100) / getVida();
        return vidaPercentual;
    }
    
    
    
    // Getters e Setters gerais do galo:
    public int getXp(){
        return xp;
    }
    
    public String getApelido(){ 
        return apelido;
    }
    
    public void setApelido(String apelido){
        this.apelido = apelido;
    }
   
    public String getNome() {    
        return nome;
    }
    public void setNome(String nome) {    
        this.nome = nome;
    }

    public String getRaridade() {
        return raridade;
    }
    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
    
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVantagem() {
        return vantagem;
    }

    public void setVantagem() {
        // A bate em B
        // B bate em C
        // C bate em A
        switch(this.tipo){
            case "A": {
                this.vantagem = "B";
                this.atqAgil.setEstadoAtaque(new EstadoEnvenenado());
                this.atqTipificado.setEstadoAtaque(new EstadoAtordoado());
            break;
            }
            case "B": {
                this.vantagem = "C";
                this.atqAgil.setEstadoAtaque(new EstadoAtordoado());
                this.atqTipificado.setEstadoAtaque(new EstadoHipnotizado());
            break;
            }
            case "C": {
                this.vantagem = "A";
                this.atqAgil.setEstadoAtaque(new EstadoHipnotizado());
                this.atqTipificado.setEstadoAtaque(new EstadoEnvenenado());
            break;
            }
        }
    }
    
    public int getValor() {
        return valor;
    }

    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    
    public int getVida() {
        return vida;
    }

    //Modificar vida atual sem alterar valor da vida original do galo
    
    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        if (vidaAtual <= 0 ){
            this.vidaAtual = 0;
        } else{
            this.vidaAtual = vidaAtual;
        }
    }
    
    public void defineAtributos(Raridade raridade){
        // Define os atributos de um galo a partir de sua raridade;
        this.raridade = raridade.getTipoRaridade();
        this.valor = raridade.getValor();
        this.forca = raridade.getForca();
        this.defesa = raridade.getDefesa();
        this.agilidade = raridade.getAgilidade();
        this.vida = raridade.getVida();
        this.vidaAtual = this.vida;
    }
    
    
    // Métodos para a batalha 
    // Esses métodos definem a lógica das ações realizadas no combate, que serão utilizadas na classe Batalha.

    public int atacar(Galo adversario, int ataque, int rodadaBatalha){
        // Tira um certo dano da vida do galo adversário de acordo com o ataque escolhido.
        int dano = 0;
        
        // Informações do oponente
        String tipo_adversario = adversario.getTipo();
            
        
        // Escolha do ataque
        switch (ataque) {
            case 1: { 
                // Ataque básico baseado em força
                dano = atqBasico.getDanoBase() - (adversario.getDefesa()/2);
                atqBasico.getEstadoAtaque().aplicarEfeito(adversario, rodadaBatalha);
            break;
            }
            case 2 : {
                //Ataque Tipificado
                // Dano recebe a lógica base do ataque, caso o tipo do adversário seja o tipo que o galo tem vantagem, é adicionado um bonûs de 50% a 75% da sua força.
                dano = (atqTipificado.getDanoBase()) - (adversario.getDefesa());
                atqTipificado.getEstadoAtaque().aplicarEfeito(adversario, rodadaBatalha);
                if (tipo_adversario.equals(this.vantagem)){
                    System.out.println("ENTROU NO IF");
                    dano += (atqTipificado.getBonus() / 100) * this.forca;
                }
            break;    
            }
            case 3: { 
                //Ataque Agil
                // Ataque baseado na agilidade, mesma lógica do baseado em força
                System.out.println("ENTROU NO 3");
                dano =  atqAgil.getDanoBase() - (adversario.getDefesa()/2);
                atqAgil.getEstadoAtaque().aplicarEfeito(adversario, rodadaBatalha);
            break;
            }
            case 4: {
                //Ultimate
                dano = (atqUltimate.getDanoBase() - adversario.getDefesa()/3);
                atqUltimate.getEstadoAtaque().aplicarEfeito(adversario, rodadaBatalha);
            break;
            }
            
            default:
                System.out.println("O ataque fornecido para " + this.getNome() + " não está de acordo aos valores aceitos.");
            break;
        }
        
        // Existe a chance de um galo fraco não conseguir gerar danos o suficiente para subtrarir da defesa, nesse caso, o resultado das operações para definir o dano serão negativos.
        // Ou seja, caso o dano gerado seja menor que 0, ainda há a chance de reduzir a vida se a força  do galo for maior ou igual a 10.
        if (dano < 0){
            dano = this.forca / 10;
        }
        return dano;
    }    
    
    public boolean esquivar(){
        // O galo tem 30% do valor agilidade de chance de desviar um ataque
        // Caso o galo esquive, retorna true, caso não, false
        
        Random random = new Random();
        float tentativa = random.nextInt(100);
        float esquiva = this.agilidade * 0.3f; 
        
        if (tentativa < esquiva){
            return true;
        }
        return false;
    }
    
    public int getPercentualVidaAtual(){
        // Retorna o valor percentual da vida para barra de vida
        int percent = (this.getVidaAtual()*100) / getVida();
        return percent;
    }

    public void regeneraPontosDePoderOriginal() {
        this.atqBasico.recuperaPontosDePoderOriginal();
        this.atqTipificado.recuperaPontosDePoderOriginal();
        this.atqAgil.recuperaPontosDePoderOriginal();
        this.atqUltimate.recuperaPontosDePoderOriginal();
    }
    
    public void regeneraVidaAtual(){
        this.vidaAtual = this.vida; //Destinada a regenerar a vida ao final da batalha
    }
    
    // Métodos para evolução e recuperação
    public void alimentar(Milho milho){
        this.xp += milho.getXp();
        System.out.println(this.apelido + " comeu e está com o xp em " + this.xp);
        // Checa se é possível evoluir
        if (this.xp >= 100){
            this.evoluir();
        }
    }
    public void evoluir(){
        // Aumenta o nível
        this.nivel += 1;
        // Evoluindo seus atributos
        this.agilidade = (int) (this.agilidade * 0.2f + this.agilidade);
        this.forca = (int) (this.forca * 0.1f + this.forca);
        this.defesa = (int) (this.defesa * 0.1f + this.defesa);
        this.vida = (int) (this.vida * 0.1f + this.vida);
        // Reinicia a contagem de xp para o próximo nível.
        this.xp = 0;
        System.out.println("Opa! O galo evoluiu!");
    }

}
