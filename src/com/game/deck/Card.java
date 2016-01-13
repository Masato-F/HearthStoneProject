package com.game.deck;

/**
 * Created by isen on 11/01/2016.
 */
public class Card implements CardCharacteristics {

    private int actionPointsRequired;
    private int attack;
    private int healthPoints;
    private String name;

    public Card() {
    }

    public Card(int actionPointsRequired, String name, int healthPoints, int attack) {
        this.actionPointsRequired = actionPointsRequired;
        this.name = name;
        this.healthPoints = healthPoints;
        this.attack = attack;
    }

    public int getActionPointsRequired() {
        return actionPointsRequired;
    }

    public void setActionPointsRequired(int actionPointsRequired) {
        this.actionPointsRequired = actionPointsRequired;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void printActionPointsRequired(){
        System.out.printf("%-15d",actionPointsRequired);
    }

    public void printName(){
        System.out.printf("%-15s",name);
    }

    public void printAttackAndHealthPoints(){
        System.out.print(attack+"             "+healthPoints);
    }


    public void printCard(){
        System.out.print("|");
        printActionPointsRequired();

    }
    @Override
    public void specialEffect() {

    }
}
