package com.game;
import com.game.deck.Card;
import com.game.deck.Deck;
import com.game.heroes.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by isen on 11/01/2016.
 */
public class Player {

    private Deck deck;
    private Hero hero;
    private Hand hand;
    private int actionPoints = 0;

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

    public int getActionPoints() {
        return actionPoints;
    }

    public void setActionPoints(int actionPoints) {
        this.actionPoints = actionPoints;
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

    public List<Card> handInitialisation(Player player, int cardsNumber){
        List<Card> cards = new ArrayList<Card>();
        for (int i=0;i<cardsNumber;i++){
            int oneCard = (int)(Math.random() * (player.getDeck().getCards().size()));
            cards.add(player.getDeck().getCards().get(oneCard));
            player.getDeck().removeCardToDeck(player.getDeck().getCards().get(oneCard));
        }
        return cards;
    }
}
