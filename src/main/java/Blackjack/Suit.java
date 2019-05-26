package Blackjack;

public enum Suit {
    SPADES("♠"),
    HEARTS("❤"),
    DIAMONDs("♦"),
    CLUBS("♣");

    private String arg;

    Suit(String arg) {
        this.arg = arg;
    }

    public String getArg() {
        return arg;
    }
}
