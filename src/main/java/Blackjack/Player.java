package Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private static Player instance = null;
    private List<Card> hands;
    private int total = 0;
    private int numberOfAce = 0;

    public Player(){
        hands = new ArrayList<Card>();
    }

    public static Player getInstance() {
        if (instance == null)
            instance = new Player();
        return instance;
    }

    public void draw(Card card){
        hands.add(card);
        if (card.getRanks() == Rank.ACE){
            total += card.getValue() + 10;
            numberOfAce++;
        }
        if (total > 21 && numberOfAce > 0){
            total -= 10;
            numberOfAce--;
        }
        total += card.getValue();
    }

    public void clearHands(){
        hands.clear();
        total = 0;
    }

    public boolean isBusted(){
        return total > 21;
    }

    public List<Card> getHands() {
        return hands;
    }

    public int getTotal() {
        return total;
    }

    public Card getCard(Suit s,Rank r){
        Card card = new Card(s,r);
        if (hands.contains(card))return card;
        return null;
    }
}
