package com.game;

import com.game.deck.Card;
import com.game.heroes.Hero;
import com.game.heroes.Warlock;

/**
 * Created by isen on 11/01/2016.
 */

public class Board {
    private Hero hero1;
    private Hero hero2;
    public Card plateau[][] = new Card[7][2];

    public Hero getHero1() {
        return hero1;
    }

    public Hero getHero2() {
        return hero2;
    }

    public Board(Hero hero1, Hero hero2) {
        this.hero1 = hero1;
        this.hero2 = hero2;
        Card empty = new Card();
        for (int i=0;i<7;i++){
            for (int j=0;j<2;j++){
                plateau[i][j] = empty;
            }
        }
    }

    public Board(Card[][] plateau) {
        this.plateau = plateau;

        //this.hero1 = Warlock(2) ;  //a voir comment faire sans devoir instancier chaque type de heros
    }

    public void printBoard(){

        //Hero1 Characteristics
        System.out.println(hero1.getName()+ " "+ hero1.getHpNumber()+" hp");

        //Print the first part of the board
        for (int i=0;i<121;i++) {
            System.out.print("_");
        }
        System.out.println("");
        System.out.print("|");
        System.out.print("|");
        for(int i=0;i<7;i++){
            plateau[i][0].printActionPointsRequired();
            System.out.print("||");
        }
        System.out.println("");
        System.out.print("||");
        for(int i=0;i<7;i++){
            plateau[i][0].printName();
            System.out.print("||");
        }
        System.out.println("");
        System.out.print("|");
        System.out.print("|");
        for(int i=0;i<7;i++){
            plateau[i][0].printAttackAndHealthPoints();
            System.out.print("||");
        }
        System.out.println("");
        for (int i=0;i<121;i++) {
            System.out.print("_");
        }

        //Print the second part of the board
        System.out.println("");
        System.out.println("");
        for (int i=0;i<121;i++) {
            System.out.print("_");
        }
        System.out.println("");
        System.out.print("|");
        System.out.print("|");
        for(int i=0;i<7;i++){
            plateau[i][1].printActionPointsRequired();
            System.out.print("||");
        }
        System.out.println("");
        System.out.print("|");
        System.out.print("|");
        for(int i=0;i<7;i++){
            plateau[i][1].printName();
            System.out.print("||");
        }
        System.out.println("");
        System.out.print("|");
        System.out.print("|");
        for(int i=0;i<7;i++){
            plateau[i][1].printAttackAndHealthPoints();
            System.out.print("||");
        }
        System.out.println("");
        for (int i=0;i<121;i++) {
            System.out.print("_");
        }
        System.out.println("");

        //Hero1 Characteristics
        System.out.println(hero2.getName()+ " "+ hero2.getHpNumber()+" hp");
        System.out.println("");
    }

    public void addCardToBoard(Card c, Hero hero){
        int i =0;
        if (hero == hero1){
            while ((i<7) && (plateau[i][0].getName() != "")){

                if (plateau[i][0].getName() == null){
                    plateau[i][0] = c;
                    return;
                }
                i++;
            }
            System.out.println("Board plein, vous ne pouvez plus poser de créatures");
        }
        else {
            while ((i<7) && (plateau[i][1].getName() != "")) {

                if (plateau[i][1].getName() == null) {
                    plateau[i][1] = c;
                    return;
                }
                i++;
            }
            System.out.println("Board plein, vous ne pouvez plus poser de créatures");
        }
    }
}

