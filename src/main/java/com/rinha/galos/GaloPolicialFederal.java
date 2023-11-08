package com.rinha.galos;
import com.rinha.galos.raridade.Lendario;

import com.rinha.ataque.AtaqueAgil;
import com.rinha.ataque.AtaqueBasico;
import com.rinha.ataque.AtaqueTipificado;
import com.rinha.ataque.AtaqueUltimate;


public class GaloPolicialFederal extends Galo{
    
    public GaloPolicialFederal(int nivel, String apelido){
        // Definindo informações básicas
        setApelido(apelido);
        setNome("Galo Policial Federal");
        setNivel(nivel);
        setTipo("A");
        setVantagem();
        
        // Raridade e atributos
        Lendario raridade = new Lendario(nivel);
        this.raridade = raridade.getTipoRaridade();
        this.valor = raridade.getValor();
        this.forca = raridade.getForca();
        this.defesa = raridade.getDefesa();
        this.agilidade = raridade.getAgilidade();
        this.vida = raridade.getVida();
        this.vidaAtual = this.vida;

        //Nova implementação de ataques
        
        this.atqBasico = new AtaqueBasico("Coronhada", this.forca, this.nivel, this.agilidade);
        this.atqTipificado = new AtaqueTipificado("Oprimir ", this.nivel, this.defesa, this.agilidade);
        this.atqAgil = new AtaqueAgil("Operação Policial", this.forca, this.nivel, this.agilidade);
        this.atqUltimate = new AtaqueUltimate("Motopatrulhamento Ostensivo", this.forca, this.nivel, this.agilidade);
        
        // Nomes para os ataques
        String[] atcks = {"Coronhada", "Oprimir", "AK-47 é o porte do homem", "Motopatrulhamentostensivo"};
        setAtaques(atcks);
    }
}
