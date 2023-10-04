package game.rinha;
import java.util.Random;

public class Galo {
    
    // Propriedades do Galo - 03/10/2023
    protected String nome;
    protected String raridade;        // Lendário, Épico, Comum
    protected boolean inGaloDex;      // Está ou não na sua GaloDex
    protected int nivel;              // ⭐⭐⭐
    protected int valor;              // Preço de venda
    protected int forca;              // 1 - 100
    protected int defesa;             // 1 -  100
    protected int vida;               //  10 - 1.000
    protected String[] ataques;       // Lista com os nomes dos ataques
    protected int atck;
    
   
    // Acessores e Modificadores
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

    public boolean isInGaloDex() {
        return inGaloDex;
    }

    public void setInGaloDex(boolean inGaloDex) {
        this.inGaloDex = inGaloDex;
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

    public int getAtck() {
        return atck;
    }

    public void setAtck(int atck) {
        this.atck = atck;
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
    
    ////////////////// Principais métodos //////////////////
    
    public void defineValor() {
        // Define o valor em função do nível e da raridade.
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
                break;
        }
    }
    
    public void defineDefesa(){
        // Define a defesa em função do nível e da raridade. 
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
                break;
        }
    }
    
   
    public void defineAtaque(){
        // Define o ataque em função do nível e da raridade. 
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
                break;
        }
    }
    
    
    public void atacar(){
    }
    
    // Escolher um dos 4 ataques
    // protected  void defender();  // Random de acordo com a defesa
    //protected  void regenerar(); // Com itens comprados na loja
    //protected  void evoluir();   // Itens comprados na loja
    //protected  void comer();     // Com itens da loja para evoluir
    
}
