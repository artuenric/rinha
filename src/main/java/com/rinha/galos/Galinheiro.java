package com.rinha.galos;

import java.util.ArrayList;
import java.util.Random;

public class Galinheiro {
    private FlyWeightFotos flyWeightFotos = new FlyWeightFotos();
    private String nome = "Máquina";

    public FlyWeightFotos getFlyWeightFotos() {
        return flyWeightFotos;
    }
    
    public ArrayList<Galo> gerarGalosEpicos(int nivel){
        ArrayList<Galo> galosGerados = new ArrayList<>();
        // Adicionar Galos Épicos
        galosGerados.add(new GaloBMW(nivel, nome, this.flyWeightFotos.getBmw()));
        galosGerados.add(new GaloCiborg(nivel, nome, this.flyWeightFotos.getCiborg()));
        return galosGerados;
    }
    public ArrayList<Galo> gerarGalosRaros(int nivel){
        ArrayList<Galo> galosGerados = new ArrayList<>();
        // Adicionar Galos Raros
        galosGerados.add(new GaloCAM(nivel, nome, this.flyWeightFotos.getCam()));
        galosGerados.add(new GaloCafe(nivel, nome, this.flyWeightFotos.getCafe()));
        galosGerados.add(new GaloChorao(nivel, nome, this.flyWeightFotos.getChorao()));
        galosGerados.add(new GaloDeFralda(nivel, nome, this.flyWeightFotos.getDefralda()));
        galosGerados.add(new GaloChorao(nivel, nome, this.flyWeightFotos.getChorao()));
        return galosGerados;
    }
    public ArrayList<Galo> gerarGalosLendarios(int nivel){
        ArrayList<Galo> galosGerados = new ArrayList<>();
        // Adicionar Galos Lendarios
        galosGerados.add(new GaloCego(nivel, nome, this.flyWeightFotos.getCego()));
        galosGerados.add(new GaloFebem(nivel, nome, this.flyWeightFotos.getFebem()));
        galosGerados.add(new GaloItaipava(nivel, nome, this.flyWeightFotos.getItaipava()));
        return galosGerados;
    }
    public ArrayList<Galo> gerarGalosIniciais(){
        // Gera 3 galos iniciais padrão
        ArrayList<Galo> galosIniciais = new ArrayList<>();
        String apelidoInicial = "First";
        galosIniciais.add(new GaloAgiota(1, apelidoInicial, this.flyWeightFotos.getAgiota()));
        galosIniciais.add(new GaloCafe(1, apelidoInicial, this.flyWeightFotos.getCafe()));
        galosIniciais.add(new GaloCiborg(1, apelidoInicial, this.flyWeightFotos.getCiborg()));
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
