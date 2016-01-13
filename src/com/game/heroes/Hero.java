package com.game.heroes;

import com.game.Board;
import com.game.Hand;
import com.game.deck.Card;

/**
 * Created by isen on 11/01/2016.
 */
public abstract class Hero {

    protected int hpNumber;
    protected String name;
    protected final int ACTIONPOINTSREQUIREDFORHEROICPOWER =2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHpNumber() {
        return hpNumber;
    }

    public void setHpNumber(int hpNumber) {
        this.hpNumber = hpNumber;
    }

    public int getACTIONPOINTSREQUIREDFORHEROICPOWER() {
        return ACTIONPOINTSREQUIREDFORHEROICPOWER;
    }

    public abstract void heroicPower(int actionPoints, Board board, Hand hand, Card c, Hero hero);

    public static Hero chooseHero(int input, int hpHero){
            Hero hero = null;
                switch (input) {
            case 1:
                hero = new Paladin(hpHero);
                break;
            case 2:
                hero = new Warlock(hpHero);
                break;
            default:
                break;
        }
        return hero;
    }
}
