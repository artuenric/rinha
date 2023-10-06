package main.rinha;
import main.rinha.batalha.Batalha;
import main.rinha.galos.GaloItaipava;
import main.rinha.galos.GaloBMW;
import java.util.Arrays;


public class Rinha {
    public static void main(String[] args) {
       
        GaloItaipava galinhoitaipava = new GaloItaipava(3);
        System.out.println(galinhoitaipava.getStatus());
       
        GaloBMW galinhobmw =  new GaloBMW(3);
        System.out.println(galinhobmw.getStatus());
        
        Batalha vamove = new Batalha(galinhoitaipava, galinhobmw);
        
       vamove.batalhar();
        System.out.println("O Vencedor da Batalha foi: " + vamove.getVencedor());
        
        
    }
}
