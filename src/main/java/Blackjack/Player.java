package Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player implements Blackjacker{
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

    @Override
    public void draw(Card card){
        hands.add(card);
        if (card.getRanks() == Rank.ACE){
            total += card.getValue() + 10;
            numberOfAce++;
        }else total += card.getValue();
        if (total > 21 && numberOfAce > 0){
            total -= 10;
            numberOfAce--;
        }
    }

    public void clearHands(){
        hands.clear();
        total = 0;
    }

    @Override
    public boolean isBusted(){
        return total > 21;
    }

    public List<Card> getHands() {
        return hands;
    }

    public int getTotal() {
        return total;
    }
}
