package com.rinha.galos;

import com.rinha.galos.raridade.Epico;

import javax.swing.ImageIcon;

public class GaloMecatronico extends Galo{
    
    public GaloMecatronico(int nivel, String apelido, ImageIcon foto){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Mecatronico");
        setNivel(nivel);
        setTipo("A");
        
        // Raridade e atributos
        Epico raridade = new Epico(nivel);
        defineAtributos(raridade);
        // Ataques
        setAtaques("Choque", "Chave de Fenda", "Desmontada", "Prisma Ultravioleta");
        // Foto
        setFotoBatalha(foto);
    }    
}
