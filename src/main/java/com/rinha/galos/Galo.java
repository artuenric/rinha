package com.rinha.galos;
import java.util.Random;

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
    protected String[] ataques;        // Lista com os nomes dos ataques
    protected boolean inGaloDex;       // Está ou não na sua GaloDex
    
    
    public String getStatus(){
        return      "\n Nome do Galo: " + this.nome +
                      "\n Raridade: " + this.raridade +
                      "\n Nivel: " + this.nivel +
                      "\n Vida: " + this.vida  +
                      "\n Forca: " + this.forca +
                      "\n Defesa: " + this.defesa +
                      "\n Agilidade: " + this.agilidade +
                      "\n Valor: " + this.valor + " Moedas" +
                      "\n Ataquei 1: " + this.ataques[0] +
                      "\n Ataquei 2: " + this.ataques[1] +
                      "\n Ataquei 3: " + this.ataques[2] +
                      "\n Ataquei 4: " + this.ataques[3];
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
            case "A" -> {
                this.vantagem = "B";
            }
            case "B" ->{
                this.vantagem = "C";
            }
            case "C" -> {
                this.vantagem = "A";
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
    
    public String getAtaque(int x){
        return this.ataques[x];
    }
    
    public String getAtaques(){
       return       "\n Ataquei 1: " + this.ataques[0] +
                      "\n Ataquei 2: " + this.ataques[1] +
                      "\n Ataquei 3: " + this.ataques[2] +
                      "\n Ataquei 4: " + this.ataques[3];
    }
    
    public void setAtaques(String[] ataques) {
        this.ataques = ataques;
    }
    
    public boolean isInGaloDex() {
        return inGaloDex;
    }
    public void setInGaloDex(boolean inGaloDex) {
        this.inGaloDex = inGaloDex;
    }

    /* Métodos para a batalha */
    // Esses métodos definem a lógica das ações realizadas no combate, que serão utilizadas na classe Batalha.

    public int atacar(Galo adversario, int ataque){
        // Tira um certo dano da vida do galo adversário de acordo com o ataque escolhido.
        Random random = new Random();
        int dano = 0;
        int bonus = 0;
        
        // Informações do oponente
        int vida_adversario = adversario.getVida();
        String tipo_adversario = adversario.getTipo();
        
        // Escolha do ataque
        switch (ataque) {
            case 1 -> {
                // Ataque básico baseado em força
                dano = (this.forca * (this.nivel/10) + this.forca) - (adversario.getDefesa()/2);
            }
            
            case 2 -> {
                // Dano recebe a lógica base do ataque, caso o tipo do adversário seja o tipo que o galo tem vantagem, é adicionado um bonûs de 50% a 75% da sua força.
                dano = (this.forca * (this.nivel/10) + this.forca) - (adversario.getDefesa());
                if (tipo_adversario.equals(this.vantagem)){
                    dano += ((random.nextInt(26) + 50) / 100) * this.forca;
                }
            }
            
            case 3 -> { 
                // Ataque baseado na agilidade, mesma lógica do baseado em força
                dano =  (this.agilidade * (this.nivel/10) + this.agilidade) - (adversario.getDefesa()/2);
            }
            
            case 4 -> {
                dano = (((random.nextInt(121) + 100) / 100) * this.forca) - (adversario.getDefesa()/3);
            }
            
            default -> System.out.println("O ataque fornecido para " + getNome() + " não está de acordo aos valores aceitos.");
        }
        
        // Existe a chance de um galo fraco não conseguir gerar danos o suficiente para subtrarir da defesa, nesse caso, o resultado das operações para definir o dano serão negativos
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
}
