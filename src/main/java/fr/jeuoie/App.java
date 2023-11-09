package fr.jeuoie;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random generateur = new Random();
        int lancer;
        int restecase = 20;
        int numerocase = 0;
        int dernierecase = 20;
        int nbrsumulation = 0;
        boolean verife = false;
        
        while (verife==false) {
            numerocase = 0;
            restecase = 20;
            for(int i = 1; i<=5;i++){
                lancer =  generateur.nextInt(6) + 1;
                numerocase = numerocase + lancer;
                restecase = restecase - lancer;
                System.out.println("lancer "+ i + " : vous avez fait "+ lancer + ". Vous etes sur la case "+numerocase+ " (encore "+restecase+ " cases)");
                

            }
            if(numerocase==dernierecase){
                System.out.println("Vous avez gagnez !");
                verife = true;
            }
            else{
                System.out.println("Vous avez perdu !");
            }
            nbrsumulation = nbrsumulation + 1;
        }
        System.out.println("vous avez réussi en "+nbrsumulation+ " simulation(s)");

    }
    
}
