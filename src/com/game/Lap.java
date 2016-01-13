package com.game;

import java.util.Scanner;

/**
 * Created by isen on 13/01/2016.
 */
public class Lap {
    public static int lapNumber = 0;

    public static void askLapFinished(int lapFinished) {
        do {
            System.out.println("Avez vous fini votre tour?");
            Scanner sc = new Scanner(System.in);
            lapFinished = sc.nextInt();
            if ((lapFinished != 1) && (lapFinished != 2)) {
                System.out.println("Mauvaise commande");
            }
        }
        while (lapFinished != 1 || lapFinished != 0);
    }
}
