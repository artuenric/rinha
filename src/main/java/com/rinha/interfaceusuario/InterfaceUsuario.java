
package com.rinha.interfaceusuario;

import java.util.Scanner;
import com.rinha.batalha.BatalhaRapida;
import com.rinha.galos.Galo;

public class InterfaceUsuario {
    
    private Galo player;

    public int getDecidirAtaques(Galo player) {
        this.player = player;
        
        Scanner sc = new Scanner(System.in);
        int decidirAtaques;
        
        System.out.print("\nAtaques disponiveis: " + this.player.getInfoAtaques() + "\n Escolha um ataque: ");
        decidirAtaques = sc.nextInt(); 
        
        while(decidirAtaques < 1 || decidirAtaques > 4 ){
                System.out.println("Valor invalido para ataques, Tente Novamente!");
                decidirAtaques = this.getDecidirAtaques(this.player);
        }
        
        return decidirAtaques; 
    }
    
}
