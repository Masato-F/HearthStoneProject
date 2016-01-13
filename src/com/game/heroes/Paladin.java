package com.game.heroes;

import com.game.Board;
import com.game.Hand;
import com.game.deck.Card;

/**
 * Created by isen on 11/01/2016.
 */
public class Paladin extends Hero {


    public Paladin(int hpNumber) {
        this.hpNumber = hpNumber;
        this.name = "Paladin";
    }
    @Override
    public void heroicPower(int actionPoints, Board board, Hand hand, Card c, Hero hero) {

        Card recrue = new Card (1,"Recrue",1,1);
        board.addCardToBoard(recrue, hero);


    }
}
