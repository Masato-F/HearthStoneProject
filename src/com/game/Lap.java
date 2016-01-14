package com.game;

import java.util.Scanner;

/**
 * Created by isen on 13/01/2016.
 */
public class Lap {
    public static int lapNumber = 0;

    public static int askLapFinished(int lapFinished) {
        do {
            System.out.println("Avez vous fini votre tour?");
            System.out.println("Non     = 0");
            System.out.println("Oui     = 1");
            Scanner sc = new Scanner(System.in);
            lapFinished = sc.nextInt();
            if ((lapFinished != 0) && (lapFinished != 1)) {
                System.out.println("Mauvaise commande");
            }
        }
        while (lapFinished != 1 && lapFinished != 0);
        return lapFinished;
    }

    public static void doAnAction(Player player, Board board){
        int input = 0;
        while (input!=1) {
            System.out.println("Quelle action voulez vous faire?");
            System.out.println("Poser une carte      = 1");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            if (input != 1) {
                System.out.println("Mauvaise commande");
            }
        }
        if (input ==1){
            System.out.println("Quelle carte voulez vous poser?");
            for (int i=0;i<player.getHand().getCards().size();i++){
                System.out.println("Carte "+(i+1)+": "+player.getHand().getCards().get(i).getName()+ " = "+(i+1));
            }
            input = 0;
            while ( input > player.getHand().getCards().size() && input == 0) {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                if (input > player.getHand().getCards().size() && input == 0) {
                    System.out.println("Mauvaise commande");
                }
                //player.getHand().removeCardToHand();
            }

        }
    }

    public static void playerLap(Player player, Board board, int lapNumber){

    }
}
