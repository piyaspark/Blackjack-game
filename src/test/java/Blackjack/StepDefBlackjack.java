package Blackjack;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefBlackjack {

    int bet;
    Money m;
    Deck deck;
    Player player;

    @Before
    public void init() {
        m = new Money(0);
        bet = 0;
        player = new Player();
    }

    @Given("a player with money (\\d+) in balance")
    public void a_player_with_money_in_balance(int money) {
        m.setBalance(-money);
    }

    @Given("i have (\\d+) deck of cards")
    public void a_deck_of_cards(int num_of_deck) {
        deck = new Deck(num_of_deck);
    }

    @When("I want to bet (.*)")
    public void i_want_to_bet(int bet) {
        bet = Math.abs(bet);
        m.setBalance(bet);
        this.bet = bet;
    }

    @When("i want to draw a card with suit ([^\\\"]*) and rank ([^\\\"]*) from the decks")
    public void draw_card_from_the_deck(Suit s, Rank r) {
        Card card = deck.getCard(s, r);
        player.draw(card);
    }

    @Then("The system show i have (\\d+) in my balance")
    public void the_system_show_i_have_money_in_my_balance(int balance) {
        assertEquals(balance, m.getBalance());
    }

    @Then("Bet money is (\\d+)")
    public void bet_money_is(int bet) {
        assertEquals(bet, this.bet);
    }

    @Then("i will have my (.*) card is (.*) in my hand")
    public void i_will_have_card_in_my_hand(String pos, String card) {
        int index = 0;
        switch (pos) {
            case "first":
                index = 0;
                break;
            case "second":
                index = 1;
                break;
            case "third":
                index = 2;
                break;
            case "fourth":
                index = 3;
                break;
            case "fifth":
                index = 4;
                break;
            case "sixth":
                index = 5;
                break;
            case "seventh":
                index = 6;
                break;
            case "eighth":
                index = 7;
                break;
            case "ninth":
                index = 8;
                break;
            case "tenth":
                index = 9;
                break;
        }
        Card pcard = player.getHands().get(index);
        assertEquals(card, pcard.toString());

    }
}