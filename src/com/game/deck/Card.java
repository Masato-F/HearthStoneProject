package com.game.deck;

import com.game.heroes.Hero;

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
    
        public static List<Card> loadCard() throws IOException {
        FileReader file = new FileReader("cardFile.txt");
        BufferedReader reader = new BufferedReader(file);
        LineNumberReader count = new LineNumberReader(reader);
        String line = null;
        List<Card> cardList = null;

        while((line = count.readLine())!= null){
            char[] chain = line.toCharArray();
            Card newCard = new Card();
            int counter = 0;
            char[] buffer = new char[0];
            for(int i=0; i <=chain.length; i++) {
                if(counter == 2) {
                    for (int n = 0; n < buffer.length; n++) {
                        buffer[n] = chain[i];
                    }
                }
                if (chain[i] == ',') {
                    counter ++;
                    if (counter == 1 & i == 1) {
                        int val = Character.getNumericValue(chain[0]);
                        newCard.actionPointsRequired = val;
                    }

                    if (counter == 1 & i == 2) {
                        String s = Character.toString(chain[0]);
                        s.concat(Character.toString(chain[1]));
                        int val = Integer.parseInt(s);
                        newCard.actionPointsRequired = val;
                    }

                    if(counter == 2){
                        String name = new String(buffer);
                        newCard.name=name;
                    }

                    if(counter == 3){
                        int val = Character.getNumericValue(chain[i-1]);
                        newCard.healthPoints = val;
                    }

                }
                if( i == chain.length-1){
                    int val = Character.getNumericValue(chain[chain.length-1]);
                    newCard.attack = val;
                }
            }
            cardList.add(newCard);

        }
        return cardList;
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

    public void cardAttacks(Card card, Hero hero){
        if (card == null){
            hero.setHpNumber(hero.getHpNumber()-attack);
        }
        else{
            card.setHealthPoints(card.getHealthPoints()-attack);
            healthPoints =-card.getAttack();
        }
    }
    @Override
    public void specialEffect() {

    }
}
