package com.rinha.galos;

import com.rinha.galos.raridade.Lendario;
import com.rinha.ataque.Ataque;

public class GaloItaipava extends Galo{
    
    public GaloItaipava(int nivel, String apelido){
        
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Itaipava");
        setNivel(nivel);
        setTipo("B");
        setVantagem();
        
        // Raridade e atributos
        Lendario raridade = new Lendario(nivel);
        this.raridade = raridade.getTipoRaridade();
        this.valor = raridade.getValor();
        this.forca = raridade.getForca();
        this.defesa = raridade.getDefesa();
        this.agilidade = raridade.getAgilidade();
        this.vida = raridade.getVida();
                
        this.atq01 = new Ataque("Voadora", 1, this.forca, this.defesa, this.agilidade);
        this.atq02 = new Ataque("Arremesso de Tampinha", 2, this.forca, this.defesa, this.agilidade);
        this.atq03 = new Ataque("Ressaca", 3, this.forca, this.defesa, this.agilidade);
        this.atq04 = new Ataque("Apagar Cigarro", 4, this.forca, this.defesa, this.agilidade);
        
        // Nomes para os ataques
        String[] atcks = {"Voadora", "Arremesso de Tampinha", "Ressaca", "Apagar Cigarro"};
        setAtaques(atcks);
        
    }
    
}
    
/* 
Nota:
Chamar o método defineValor()- e provavelmente qualquer método da função main, desde que não seja privado -
pode ser feito com, ou sem, o this. Isso pq o escopo da função na main já atribui os valores nos locais corretos.
No entanto, chamar a função sem a raridade definida, dá erro. Deve ser por causa do switch.
Na verdade, acredito que seja por não haver nada para o switch escolher.
*/