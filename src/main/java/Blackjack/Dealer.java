package Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Blackjacker{
    private static Dealer instance = null;
    private BotStrategy botStrategy;
    private List<Card> hands;
    private int total = 0;
    private int numberOfAce = 0;

    public Dealer(BotStrategy botStrategy){
        hands = new ArrayList<Card>();
        this.botStrategy = botStrategy;
    }

    public static Dealer getInstance() {
        if (instance == null)
            instance = new Dealer(new ExpertBotStrategy());
        return instance;
    }

    public void setBotStrategy(BotStrategy botStrategy) {
        this.botStrategy = botStrategy;
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

    public boolean canDraw(){
        return botStrategy.canDraw(this.total);
    }

    @Override
    public boolean isBusted(){
        return total > 21;
    }

    public void clearHands(){
        hands.clear();
        total = 0;
    }

    public List<Card> getHands() {
        return hands;
    }

    public int getTotal() {
        return total;
    }
}
