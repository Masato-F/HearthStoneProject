package com.game;
import com.game.deck.Deck;
import com.game.heroes.Hero;

import java.util.Scanner;

/**
 * Created by isen on 11/01/2016.
 */
public class Player {

    private Deck deck;
    private Hero hero;
    private Hand hand;

    public Player(Deck deck, Hero hero, Hand hand) {
        this.deck = deck;
        this.hero = hero;
        this.hand = hand;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public static int chooseClass(int playerNumber) {
        int input = 0;
        while ((input != 1) && (input != 2)) {
            System.out.println("Classe joueur "+playerNumber+"?");
            System.out.println("Paladin      = 1");
            System.out.println("Warlock      = 2");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            if ((input != 1) && (input != 2)) {
                System.out.println("Mauvaise commande");
            }
        }
        return input;
    }
}
