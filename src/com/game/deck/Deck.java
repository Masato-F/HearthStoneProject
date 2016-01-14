package com.game.deck;

import java.util.List;

/**
 * Created by isen on 11/01/2016.
 */
public class Deck {

    private List <Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
        //cards.get(5);
        //cards.remove(5);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void createDeck(List<Card> c){
        cards = c;
    }

    public void removeCardToDeck(Card c){
        cards.remove(c);
    }
}
