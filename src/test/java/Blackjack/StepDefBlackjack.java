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
    Dealer dealer;

    @Before
    public void init() {
        m = new Money(0);
        bet = 0;
        player = new Player();
        dealer = new Dealer(new ExpertBotStrategy());
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

    @When("(.*) draw a card with suit (.*) and rank (.*) from the decks")
    public void draw_card_from_the_deck(String person,String s, String r){
        Card card = deck.getCard(Suit.valueOf(s), Rank.valueOf(r));
        switch (person){
            case "player" : player.draw(card);break;
            case "dealer" : dealer.draw(card);break;
        }
        deck.remove(card);
    }


    @Then("The system show i have (\\d+) in my balance")
    public void the_system_show_i_have_money_in_my_balance(int balance) {
        assertEquals(balance, m.getBalance());
    }

    @Then("Bet money is (\\d+)")
    public void bet_money_is(int bet) {
        assertEquals(bet, this.bet);
    }

    @Then("i will have card with suit (.*) and rank (.*) in my hand")
    public void i_will_have_card_in_my_hand(String s, String r) {
        boolean haveCard = false;
        Card card = new Card(Suit.valueOf(s),Rank.valueOf(r));
        for (Card c : player.getHands()) {
            if(card.getRanks() == c.getRanks() && card.getSuits() == c.getSuits())haveCard = true;
        }
        assertTrue(haveCard);
    }

    @Then("(.*) will have total points equals (\\d+)")
    public void i_will_have_total_points(String person, int total){
        switch (person){
            case "player" : assertEquals(total,player.getTotal());break;
            case "dealer" : assertEquals(total,dealer.getTotal());break;
        }
    }

    @Then("the amount of card in the deck is (\\d+)")
    public void the_amount_of_card_in_the_deck(int size){
        assertEquals(size,deck.getDecks().size());
    }

    @Then("player have more points than dealer")
    public void more_point_than(){
        assertTrue(player.getTotal() > dealer.getTotal());
    }

    @Then("player is busted")
    public void player_is_busted(){
        assertTrue(player.isBusted());
    }

    @Then("(.*) is the winner")
    public void is_the_winner(String person){
        switch (person){
            case "player" :
                assertTrue(!player.isBusted() && (player.getTotal() > dealer.getTotal() || dealer.isBusted()));
                break;
            case "dealer" :
                assertTrue(!dealer.isBusted() && (player.getTotal() < dealer.getTotal() || player.isBusted()));
                break;
        }
    }
}