package Blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Deck {
    private List<Card> decks;

    public Deck(int num_of_deck){
        decks = new ArrayList<Card>();
        for (int d=0;d<num_of_deck;d++)
            for (int i=0;i<4;i++)
                for (int j=0;j<13;j++){
                    decks.add(new Card(Suit.values()[i],Rank.values()[j]));
                 }
    }

    public Card getCard(int index){
        return decks.get(index);
    }

    public Card getCard(Suit s,Rank r){
        Card card = new Card(s,r);
        for (Card c : decks){
            if (card.getRanks() == c.getRanks() && card.getSuits() == c.getSuits())return card;
        }
        return null;
    }

    public List<Card> getDecks() {
        return decks;
    }

    public boolean remove(Card card) {
        for (Card c : decks) {
            if (card.getRanks() == c.getRanks() && card.getSuits() == c.getSuits()) {
                decks.remove(c);
                return true;
            }
        }
        return false;
    }
}
