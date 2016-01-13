package com.game.heroes;

import com.game.Board;
import com.game.Hand;
import com.game.deck.Card;

/**
 * Created by isen on 11/01/2016.
 */
public class Warlock extends Hero {

    public Warlock(int hpNumber) {
        this.hpNumber = hpNumber;
        this.name = "Warlock";
    }

    @Override
    public void heroicPower(int actionPoints, Board board, Hand hand, Card c, Hero hero) {
        hpNumber =-1;
        hand.addCardToHand(c);


    }
}
