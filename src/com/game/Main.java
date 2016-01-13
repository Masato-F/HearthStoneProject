package com.game;

import com.game.deck.Card;
import com.game.deck.Deck;
import com.game.heroes.Hero;
import com.game.heroes.Paladin;
import com.game.heroes.Warlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int hpHero = 10;


        //Choix des paramètres du duel
            //Player 1 choice
        int input = Player.chooseClass(1);
        Hero hero1 = Hero.chooseHero(input, hpHero);
            //Player 2 choice
        input = Player.chooseClass(2);
        Hero hero2 = Hero.chooseHero(input, hpHero);

        //Create card
        Card gnome = new Card(1, "gnome", 1, 2);
        Card raptor = new Card(2,"Raptor",2,3);
        //Deck 1 and 2
        List<Card> c = new ArrayList<Card> ();
        for (int i=0;i<10;i++){
            c.add(gnome);
        }
        List<Card> c2 = new ArrayList<Card> ();

        for (int i=0;i<10;i++){
            c2.add(raptor);
        }
        Deck deck1 = new Deck(c);
        Deck deck2 = new Deck(c2);

        //board creation : empty
        Board board = new Board(hero1,hero2);

        board.printBoard();

        Player player1 = new Player(deck2, board.getHero1(), null);
        Player player2 = new Player(deck2, board.getHero2(), null);

        int nbCards = deck1.getCards().size();

        int oneCard = (int)(Math.random() * (nbCards));

        Hand hand1 = new Hand(deck1.getCards());

        player1.setHand(hand1);
        player1.getHand().printHand(player1.getHand().getCards().size());

        player1.getHand().addCardToHand(deck2.getCards().get(oneCard));
        player1.getDeck().removeCardToDeck(deck2.getCards().get(oneCard));
        player1.getHand().printHand(player1.getHand().getCards().size());



        /*
        board.getHero1().heroicPower(2, board, null, null, board.getHero1());
        board.addCardToBoard(gnome,paladin);
        board.printBoard();

        board.addCardToBoard(deck2.cards.get(1), board.getHero2());
        board.printBoard();
        */
    }
}
