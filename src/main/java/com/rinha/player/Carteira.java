package com.rinha.player;

public class Carteira {
    int saldo;
    
    // Getters e Setters
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    // Construtor
    public Carteira() {
        this.saldo = 0;
    }
    
    // Demais métodos
    public void deposito(int valor){
        this.saldo += valor;
    }
    
    public void saque(int valor){
        this.saldo -= valor;
    }
    
    public boolean solicitacao(int valor){
        if (valor > this.getSaldo()){
            return false;
        }
        return true;
    }
}
