package com.rinha.perfil;

public class Carteira {
    int saldo = 0;
    
    // Getters e Setters
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    // Construtor
    public Carteira(int saldo) {
        this.saldo = saldo;
    }
    
    // Demais métodos
    public void deposito(int valor){
        this.saldo += valor;
    }
    
    public void saque(int valor){
        this.saldo -= valor;
    }
    
    public boolean solicitacao(int valor){
        return valor <= this.getSaldo();
    }
}
