package com.rinha.galos;

import java.util.ArrayList;
import java.util.Random;

public class Galinheiro {
    ArrayList<Galo> galosEpicos;
    ArrayList<Galo> galosRaro;
    ArrayList<Galo> galosLendarios;
    // Lista com nomes legais
    ArrayList<String> nomes;
    
    public ArrayList<Galo> gerarGalosEpicos(int nivel){
        ArrayList<Galo> galosGerados = new ArrayList<>();
        // Adicionar Galos Raros
        galosGerados.add(new GaloBMW(nivel, "Apelido"));
        return galosGerados;
    }
    public ArrayList<Galo> gerarGalosRaros(int nivel){
        ArrayList<Galo> galosGerados = new ArrayList<>();
        // Adicionar Galos Raros
        galosGerados.add(new GaloBMW(nivel, "Apelido"));
        return galosGerados;
    }
    public ArrayList<Galo> gerarGalosLendarios(int nivel){
        ArrayList<Galo> galosGerados = new ArrayList<>();
        // Adicionar Galos Raros
        galosGerados.add(new GaloBMW(nivel, "Apelido"));
        return galosGerados;
    }
    public ArrayList<Galo> gerarGalosIniciais(){
        // Gera 3 galos iniciais padrão
        ArrayList<Galo> galosIniciais = new ArrayList<>();
        String apelidoInicial = "First";
        galosIniciais.add(new GaloAgiota(1, apelidoInicial));
        galosIniciais.add(new GaloCafe(1, apelidoInicial));
        galosIniciais.add(new GaloCiborg(1, apelidoInicial));
        return galosIniciais;
    }
    public Galo getRandomGaloEpico(int nivel){
        Random random = new Random();
        ArrayList<Galo> galosGerados;
        galosGerados = this.gerarGalosEpicos(nivel);
        Galo galo = galosGerados.get(random.nextInt(galosGerados.size()));
        return galo;
    }
    public Galo getRandomGaloRaro(int nivel){
        Random random = new Random();
        ArrayList<Galo> galosGerados;
        galosGerados = this.gerarGalosRaros(nivel);
        Galo galo = galosGerados.get(random.nextInt(galosGerados.size()));
        return galo;
    }
    public Galo getRandomGaloLendario(int nivel){
        Random random = new Random();
        ArrayList<Galo> galosGerados;
        galosGerados = this.gerarGalosLendarios(nivel);
        Galo galo = galosGerados.get(random.nextInt(galosGerados.size()));
        return galo;
    }
}
