package com.rinha.galos;

public class GaloBMW extends Galo {
        // Definindo informações básicas
    
       public GaloBMW(int nivel){
            setNome("Galo BMW");
            setRaridade("Epico");
            setTipo("A");
            setNivel(nivel);
            
            // Nomes para os ataques
            String[] ataques = {"Atropelamento", "VrumVrumGatinha", "Gasolina de Milho", "Freio da Blazer"};
            setAtaques(ataques);
        
            // Definindo a partir das informações dadas 
            defineAtributos();  
       }
}
