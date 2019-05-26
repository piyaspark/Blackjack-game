package Blackjack;

public class Money {
    private int balance;

    public Money(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int bet) {
        this.balance -= bet;
    }
}
