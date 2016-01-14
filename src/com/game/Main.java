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
        List<Card> c1 = new ArrayList<Card> ();
        for (int i=0;i<10;i++){
            c1.add(gnome);
        }
        List<Card> c2 = new ArrayList<Card> ();

        for (int i=0;i<10;i++){
            c2.add(raptor);
        }
        Deck deck1 = new Deck(c1);
        Deck deck2 = new Deck(c2);

        //board creation : empty
        Board board = new Board(hero1,hero2);
        board.printBoard();

        //Players creation
        Player player1 = new Player(deck1, board.getHero1(), null);
        Player player2 = new Player(deck2, board.getHero2(), null);

        //Initialisation
        //Le joueur 1 pioche 3 cartes
        List<Card> cards1 = new ArrayList<Card> ();
        cards1 = player1.handInitialisation(player1, 3);
        Hand hand1 = new Hand(cards1);
        player1.setHand(hand1);

        //Le joueur 2 pioche 4 cartes
        List<Card> cards2 = new ArrayList<Card> ();
        cards2 = player2.handInitialisation(player2, 4);
        Hand hand2 = new Hand(cards2);
        player2.setHand(hand2);

        //Déroulement du jeu

        //while(player1.getHero().getHpNumber() !=0 || player2.getHero().getHpNumber() !=0){
            if (Lap.lapNumber < 11){
                Lap.lapNumber++;
            }
            //Tour du joueur 1
            player1.setActionPoints(Lap.lapNumber);
            player1.dropACard();
            player1.getHand().printHand(player1.getHand().getCards().size());
            int lapFinished = 0;
            while (lapFinished != 1){
                lapFinished = Lap.askLapFinished(lapFinished);
                Lap.doAnAction(player1,board);
                board.printBoard();
                player1.getHand().printHand(player1.getHand().getCards().size());
            }

            //Tour du joueur 2

        //}


        //Hand hand1 = new Hand(deck1.getCards());

        //player1.setHand(hand1);

        /*
        board.getHero1().heroicPower(2, board, null, null, board.getHero1());
        board.addCardToBoard(gnome,paladin);
        board.printBoard();

        board.addCardToBoard(deck2.cards.get(1), board.getHero2());
        board.printBoard();
        */
    }
}
