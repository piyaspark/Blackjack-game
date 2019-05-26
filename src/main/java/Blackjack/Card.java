package Blackjack;

public class Card {
    private Suit suits;
    private Rank ranks;

    public Card(Suit suits, Rank ranks){
        this.suits = suits;
        this.ranks = ranks;
    }


    public Rank getRanks() {
        return ranks;
    }

    public Suit getSuits() {
        return suits;
    }

    public int getValue(){
        return ranks.getValue();
    }

    @Override
    public String toString() {
        return "|"+suits.getArg()+ranks.getArg()+"|";
    }
}
