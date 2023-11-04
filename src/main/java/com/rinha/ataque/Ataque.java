/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rinha.ataque;
import java.util.Random;
/**
 *
 * @author caio
 */
public abstract class Ataque {
    
    protected String nomeAtaque;
    protected int pontosDePoder;
    protected int forca;           
    protected int nivel;
    protected int agilidade;  
    protected int dano;
    protected int bonusAtq;
    

    public String getNomeAtaque(){
        return this.nomeAtaque;
    }
    
    public int getDanoBase(){
        
        return this.dano;
         
    }
    
    public int getPontosDePoder(){
        return this.pontosDePoder;
    }
    
    public int getBonus(){
        return this.bonusAtq;
    }
    
}
