package com.rinha.galos;
import com.rinha.ataque.Ataque;
import com.rinha.ataque.AtaqueBasico;
import com.rinha.ataque.AtaqueTipificado;
import com.rinha.ataque.AtaqueAgil;
import com.rinha.ataque.AtaqueUltimate;
import com.rinha.galos.raridade.Raridade;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class Galo {
    
    // Propriedades do Galo - 03/10/2023
    protected String apelido;          // Nome personalizado para o Galo
    protected String nome;             // Galo Alguma Coisa
    protected String raridade;         // Lendário, Épico, Raro
    protected int nivel;               // ⭐⭐⭐⭐⭐
    protected String tipo;             // 3 tipos: A, B e C
    protected String vantagem;         // A bate em B, B bate em C, C bate em A
    protected int valor;               // Preço de venda
    protected int forca;               // 1  - 100
    protected int defesa;              // 1  - 100
    protected int agilidade;           // 1  - 100
    protected int vida;                // 10 - 1.000
    protected int vidaAtual;
    protected String[] ataques;        // Lista com os nomes dos ataques
    protected boolean inGaloDex;       // Está ou não na sua GaloDex
    
    //ATAQUES
    protected AtaqueBasico atqBasico;
    protected AtaqueTipificado atqTipificado;
    protected AtaqueAgil atqAgil;
    protected AtaqueUltimate atqUltimate;
    
    // Interface
    protected ImageIcon fotoBatalha;
    
    public ImageIcon getFotoBatalha() {
        return fotoBatalha;
    }
    
    public void setImageIcon(String path){
        // Por padrão, as fotos dos galos estão no caminho /imgs/galos/nomedogalo.png
        this.fotoBatalha = new ImageIcon(getClass().getResource(path));
    }
    
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
    
    public String getNomeAtaque(int ID){
        String nomeAtq = null;
        
        switch(ID){
            case 1:
                nomeAtq = atqBasico.getNomeAtaque();
                break;
            case 2:
                nomeAtq = atqTipificado.getNomeAtaque();
                break;
            case 3:
                nomeAtq = atqAgil.getNomeAtaque();
                break;
            case 4:
                nomeAtq = atqUltimate.getNomeAtaque();
                break;
        }
        
        return nomeAtq;  
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
            
    public String getInfoAtaques(){
    return    "\n Ataquei 1: " + this.atqBasico.getNomeAtaque() + " PP: " + this.atqBasico.getPontosDePoderAtual() +
              "\n Ataquei 2: " + this.atqTipificado.getNomeAtaque() + " PP: " + this.atqTipificado.getPontosDePoderAtual() +
              "\n Ataquei 3: " + this.atqAgil.getNomeAtaque() + " PP: " + this.atqAgil.getPontosDePoderAtual() +
              "\n Ataquei 4: " + this.atqUltimate.getNomeAtaque() + " PP: " + this.atqUltimate.getPontosDePoderAtual();
    }
    
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
    
    
    /*
    Métodos Acessores e Modificadores:
    Esses métodos pegam e alteram, obviamente, as propriedades dos galos.
    */
    
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
            break;
            }
            case "B": {
                this.vantagem = "C";
            break;
            }
            case "C": {
                this.vantagem = "A";
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

    public int getVida() {
        return vida;
    }
    
    public void setVida(int vida) {
        if (vida <= 0 ){
            this.vida = 0;
        } else{
            this.vida = vida;
        }
    }

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
    
    public void setAtaques(String[] ataques) {
        this.ataques = ataques; //sairá
    }
    
    public boolean isInGaloDex() {
        return inGaloDex;
    }
    public void setInGaloDex(boolean inGaloDex) {
        this.inGaloDex = inGaloDex;
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
    
    
    /* Métodos para a batalha */
    // Esses métodos definem a lógica das ações realizadas no combate, que serão utilizadas na classe Batalha.

    public int atacar(Galo adversario, int ataque){
        // Tira um certo dano da vida do galo adversário de acordo com o ataque escolhido.
        int dano = 0;
        
        // Informações do oponente
        String tipo_adversario = adversario.getTipo();
            
        
        // Escolha do ataque
        switch (ataque) {
            case 1: { 
                // Ataque básico baseado em força
                dano = atqBasico.getDanoBase() - (adversario.getDefesa()/2);
            break;
            }
            case 2 : {
                //Ataque Tipificado
                // Dano recebe a lógica base do ataque, caso o tipo do adversário seja o tipo que o galo tem vantagem, é adicionado um bonûs de 50% a 75% da sua força.
                dano = (atqTipificado.getDanoBase()) - (adversario.getDefesa());
                if (tipo_adversario.equals(this.vantagem)){
                    dano += (atqTipificado.getBonus() / 100) * this.forca;
            break;    
                }
            }
            case 3: { 
                //Ataque Agil
                // Ataque baseado na agilidade, mesma lógica do baseado em força
                dano =  atqAgil.getDanoBase() - (adversario.getDefesa()/2);
            break;
            }
            case 4: {
                //Ultimate
                dano = (atqUltimate.getDanoBase() - adversario.getDefesa()/3);
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
        // O galo tem 80% do valor agilidade de chance de desviar um ataque
        // Caso o galo esquive, retorna true, caso não, false
        Random random = new Random();
        float tentativa = random.nextInt(100);
        float esquiva = this.agilidade * 0.3f; // A probabilidade de desviar de um ataque estava muito alta, reduzimos para 30%
        
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
}
