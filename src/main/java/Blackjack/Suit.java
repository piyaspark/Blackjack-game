package Blackjack;

public enum Suit {
    SPADES("♠"),
    HEARTS("❤"),
    DIAMONDS("♦"),
    CLUBS("♣");

    private String arg;

    Suit(String arg) {
        this.arg = arg;
    }

    public String getArg() {
        return arg;
    }
}
