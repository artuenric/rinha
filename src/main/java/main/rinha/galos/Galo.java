package main.rinha.galos;
import java.util.Random;
import java.util.Arrays;

public class Galo {
    
    // Propriedades do Galo - 03/10/2023
    protected String nome;            // Galo Alguma Coisa // Ver depois possibilidade de nomear um galo
    protected String raridade;        // Lendário, Épico, Comum
    protected int nivel;              // ⭐⭐⭐
    protected String tipo;            // 3 tipos: A, B e C
    protected int valor;              // Preço de venda
    protected int forca;              // 1 - 100
    protected int defesa;             // 1 -  100
    protected int vida;               // 10 - 1.000
    protected String[] ataques;       // Lista com os nomes dos ataques
    protected boolean inGaloDex;      // Está ou não na sua GaloDex
    protected String informacoes;     // Nome, raridade e nível
    

    ////////////// Acessores e Modificadores ///////////////
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
        this.vida = vida;
    }

    public String[] getAtaques() {
        return ataques;
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

    public String getInformacoes() {
        return informacoes;
    }
    
    
    ////////////////// Principais métodos //////////////////
    public void defineValor() {
        // Define o valor em função do nível e da raridade.
        // Nível: Mínimo - Máximo
        switch (this.raridade) {
            case "Raro":
                this.valor = 50 * this.nivel;
                break;
            case "Epico":
                this.valor = 100 * this.nivel;
                break;
            case "Lendario":
                this.valor = 200 * this.nivel;
                break;
            default:
                System.out.println("A raridade fornecida para " + getInformacoes() + " não está de acordo aos valores aceitos.");
                break;
        }
    }
    
    public void defineDefesa(){
        // Define a defesa em função do nível e da raridade.
        // Nível: Mínimo - Máximo
        Random random = new Random();
        switch (this.raridade) {
            case "Raro":
                // 1: 1 - 16 ; 2: 2 - 17 ; 3: 3 - 18 ; 4: 4 - 19 ; 5: 5 - 20
                this.defesa = random.nextInt(16) + this.nivel; 
                break;
            case "Epico":
                // 1: 26 - 36 ; 2: 27 - 37 ; 3: 28 - 38 ; 4: 29 - 39 ; 5: 30 - 40
                this.defesa = random.nextInt(11) + 25 + this.nivel; 
                break;
            case "Lendario":
                // 1: 46 - 56 ; 2: 47 - 57 ; 3: 48 - 58  4: 49 - 59 ; 5: 50 - 60
                this.defesa = random.nextInt(11) + 45 + this.nivel; 
                break;
            default:
                System.out.println("A raridade fornecida para " + getInformacoes() + " não está de acordo aos valores aceitos.");
                break;
        }
    }
   
    public void defineForca(){
        // Define o ataque em função do nível e da raridade. 
        // Nível: Mínimo - Máximo
        Random random = new Random();
        switch (this.raridade) {
            case "Raro":
                // 1: 1 - 26 ; 2: 2 - 27 ; 3: 3 - 28 ; 4: 4 - 29 ; 5: 5 - 30
                this.defesa = random.nextInt(26) + this.nivel; 
                break;
            case "Epico":
                // 1: 31 - 41 ; 2: 32 - 42 ; 3: 33 - 43 ; 4: 34 - 44 ; 5: 35 - 45
                this.defesa = random.nextInt(11) + 30 + this.nivel; 
                break;
            case "Lendario":
                // 1: 61 - 71 ; 2: 62 - 72 ; 3: 63 - 73  4: 64 - 74 ; 5: 65 - 75
                this.defesa = random.nextInt(11) + 60 + this.nivel; 
                break;
            default:
                System.out.println("A raridade fornecida para " + getInformacoes() + " não está de acordo aos valores aceitos.");
                break;
        }
    }

    public void defineVida(){
        // Define a vida em função do nível e da raridade. 
        // Nível: Mínimo - Máximo
        Random random = new Random();
        switch (this.raridade) {
            case "Raro":
                // 1: 1 - 16 ; 2: 2 - 17 ; 3: 3 - 18 ; 4: 4 - 19 ; 5: 5 - 20
                this.defesa = random.nextInt(21) + this.nivel; 
                break;
            case "Epico":
                // 1: 26 - 36 ; 2: 27 - 37 ; 3: 28 - 38 ; 4: 29 - 39 ; 5: 30 - 40
                this.defesa = random.nextInt(11) + 30 + this.nivel; 
                break;
            case "Lendario":
                // 1: 46 - 56 ; 2: 47 - 57 ; 3: 48 - 58  4: 49 - 59 ; 5: 50 - 60
                this.defesa = random.nextInt(11) + 60 + this.nivel; 
                break;
            default:
                System.out.println("A raridade fornecida para " + getInformacoes() + " não está de acordo aos valores aceitos.");
                break;
        }
    }
    
    // Ver depois
    // Explorar mais. Tudo sobre o galo deve estar aqui. Tá MUITO feio kkkkkkkkk
    // Talvez mudar o nome da propriedade e método.
    public void defineInformacoes() {
        // nome / raridade / nível
        // ataque 1 / ataque 2 / ataque 3 / ataque 4
        String at1 = this.ataques[0];
        String at2 = this.ataques[1];
        String at3 = this.ataques[2];
        String at4 = this.ataques[3];
        String info = String.format("%s / %s / Nível %d\n%s / %s / %s / %s", this.nome, this.raridade, this.nivel, at1, at2, at3, at4 );
        this.informacoes = info;
    }
        
    public void atacar(Galo inimigo){
        // Ataca o galo inimigo
        // Ver depois
        // [0] Dá o daninho e vai comendo vida, [1] mais dano menos pp, [2] um pouco mais dano menos pp tipo influencia, [3] bem mais dano, bem menos pp
        Random random = new Random();
        
    }
    
    // Escolher um dos 4 ataques
    // protected  void defender();  // Random de acordo com a defesa
    //protected  void regenerar(); // Com itens comprados na loja
    //protected  void evoluir();   // Itens comprados na loja
    //protected  void comer();     // Com itens da loja para evoluir
    
}
