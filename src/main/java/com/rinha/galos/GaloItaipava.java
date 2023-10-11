package com.rinha.galos;

public class GaloItaipava extends Galo{
    
    public GaloItaipava(int nivel){
        // Definindo informações básicas
        setNome("Galo Itaipava");
        setRaridade("Raro");
        setTipo("B");
        setVantagem();
        setNivel(nivel);
        
        // Nomes para os ataques
        String[] ataques = {"Voadora", "Arremesso de Tampinha", "Ressaca", "Apagar Cigarro"};
        setAtaques(ataques);
        
        // Definindo a partir das informações dadas 
        defineAtributos();
      }
          
}
    
/* 
Nota:
Chamar o método defineValor()- e provavelmente qualquer método da função main, desde que não seja privado -
pode ser feito com, ou sem, o this. Isso pq o escopo da função na main já atribui os valores nos locais corretos.
No entanto, chamar a função sem a raridade definida, dá erro. Deve ser por causa do switch.
Na verdade, acredito que seja por não haver nada para o switch escolher.
*/