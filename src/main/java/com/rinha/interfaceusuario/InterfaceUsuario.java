
package com.rinha.interfaceusuario;

import java.util.Scanner;
import com.rinha.batalha.Batalha;
import com.rinha.galos.Galo;

public class InterfaceUsuario {
    
    private Galo player;

    public int getDecidirAtaques(Galo player) {
        this.player = player;
        
        Scanner sc = new Scanner(System.in);
        int decidirAtaques;
        
        System.out.print("\nAtaques disponiveis: " + this.player.getAtaques() + "\n Escolha um ataque: ");
        return decidirAtaques = sc.nextInt(); 
    }
    
}
