package Blackjack;

public enum Rank {

    TWO("2",2),
    THREE("3",3),
    FOUR("4",4),
    FIVE("5",5),
    SIX("6",6),
    SEVEN("7",7),
    EIGHT("8",8),
    NINE("9",9),
    TEN("10",10),
    JACK("J",10),
    QUEEN("Q",10),
    KING("K",10),
    ACE("A",1);

    private String arg;
    private int value;

    Rank(String arg, int value) {
        this.arg = arg;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getArg() {
        return arg;
    }
}
