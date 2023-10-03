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
    
    // Principais métodos
    
    // Definir valor, defesa e ataque em função do nível do galo
    public void defineValor() {
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
        Random random = new Random();
   
        switch (this.raridade) {
            case "Raro":
                this.defesa = random.nextInt(16) + this.nivel;
                break;
            case "Epico":
                // Vai de 30 a 40, sendo o máximo atingido com o nível 5
                // REVISAR o número pode ser 25, mas o valor mínimo esperado para defesa é 30
                this.defesa = random.nextInt(11) + 25  + this.nivel;
                break;
            case "Lendario":
                this.defesa = random.nextInt() + 45 + this.nivel;
                break;
            default:
                break;
        }
        
        int aleatorio = random.nextInt(10) + 20;
        
        
    }
    
    
    
    public void atacar(){
    }
    
    // Escolher um dos 4 ataques
    // protected  void defender();  // Random de acordo com a defesa
    //protected  void regenerar(); // Com itens comprados na loja
    //protected  void evoluir();   // Itens comprados na loja
    //protected  void comer();     // Com itens da loja para evoluir
    
}
