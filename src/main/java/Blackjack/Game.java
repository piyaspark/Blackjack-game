package Blackjack;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Game instance = null;
    private Player player;
    private Dealer dealer;
    private Money money;
    private State state;
    private Scanner sc;
    private Random rand;
    private Deck decks;
    private int bet = 0;

    public Game(){
        money = new Money(1000);
        player = Player.getInstance();
        dealer = Dealer.getInstance();
        sc = new Scanner(System.in);
        decks = new Deck(1);
        rand = new Random();
        state = new IdleState(this);
    }


    public void play(){
        System.out.println("======= Welcome to  Blackjack game!! =======");
        state.bet();
    }

    /**
     * dealer deal cards to player and himself.
     */
    public void dealOut(){
        Card card;
        for (int i = 0;i<3;i++){
            if (i<2){
                card = decks.getCard(rand.nextInt(decks.getDecks().size()));
                player.draw(card);
                decks.remove(card);
            }else{
                card = decks.getCard(rand.nextInt(decks.getDecks().size()));
                dealer.draw(card);
                decks.remove(card);
            }
        }
        if (player.getTotal() == 21)state.end();
    }

    /**
     * dealer deal cards.
     */
    public void dealIn(){
        int i = 0;
        while (i <= 10){
            Card card = decks.getCard(rand.nextInt(decks.getDecks().size()));
            if (dealer.canDraw()){
                dealer.draw(card);
                decks.remove(card);
                i++;
            }else break;
        }
    }

    public boolean bet(){
        showMoney();
        System.out.println("[ How much you want to bet, sir? ]");

        while (true){
            System.out.print("Enter your bet > ");
            bet = sc.nextInt();
            if (bet == 0){
                System.out.println("[ Sorry sir, if you want to play, please bet... ]");
            }else{
                if(money.getBalance()>=Math.abs(bet)){
                    money.setBalance(Math.abs(bet));
                    break;
                }
                else {
                    System.out.println("[ Sorry sir, You don't have enough money. ]");
                }
            }
        }
        showMoney();
        System.out.println("\n[ Let's begin!! ]");
        return true;
    }

    public void showCards(){
        System.out.println("[ Dealer hands ]\n");
        for (Card c : dealer.getHands()){
            System.out.print(c+" ");
        }
        System.out.printf("(%d)\n",dealer.getTotal());


        System.out.println("\n[ Player hands ]\n");
        for (Card c : player.getHands()){
            System.out.print(c+" ");
        }
        System.out.printf("(%d)\n",player.getTotal());

    }

    public void option(){
        System.out.println("\n[ What you want to do next? ]");
        System.out.println("[H] Hit");
        System.out.println("[D] Double");
        System.out.println("[S] Stand");
        while(true){
            System.out.print("> ");
            String cmd = sc.next();

            if (cmd.equalsIgnoreCase("H")) {
                state.hit();
                break;
            } else if(cmd.equalsIgnoreCase("D")){
                state.doubleHit();
                break;
            } else if(cmd.equalsIgnoreCase("S")){
                state.stand();
                break;
            } else {
                System.out.println("[ Wrong option sir! ]");
            }
        }

    }

    public boolean hit(){
        Card card = decks.getCard(rand.nextInt(decks.getDecks().size()));
        player.draw(card);
        decks.remove(card);
        System.out.println("[ You make a hit. ]");
        showCards();
        if (player.isBusted())return false;
        return true;
    }

    public void stand(){
        System.out.println("[ Let's see your luck... ]");
        dealIn();
        showCards();
    }

    public void doubleHit(){
        if (money.getBalance()>=bet){
            System.out.println("[ You play for double!! Let's see... ]");
            money.setBalance(bet);
            bet += bet;
            Card card = decks.getCard(rand.nextInt(decks.getDecks().size()));
            player.draw(card);
            decks.remove(card);
            dealIn();
            showCards();
        }else{
            System.out.println("[ Sorry sir, You don't have enough money. ]");
            option();
        }
    }

    public void result(){
        if (player.isBusted()){
            System.out.println("\n[ You busted(more than 21 point)! ]");
            lose();
            }
        else if (player.getTotal() > dealer.getTotal() && !dealer.isBusted())win();
        else if (dealer.getTotal() > player.getTotal() && !dealer.isBusted())lose();
        else if (player.getTotal() == dealer.getTotal())tie();
        else if (player.getTotal() == 21)win();
        else win();

        state.restart();
    }

    public void lose(){
        System.out.println("[ Sorry, try again next round! ]");
    }

    public void win(){
        System.out.println("[ Congratulation! You have luck. ]");
        money.setBalance(-bet * 2);
    }

    public void tie(){
        System.out.println("[ Tie game!! Let's play again. ]");
        money.setBalance(-bet);
    }

    public void restart(){
        bet = 0;
        player.clearHands();
        dealer.clearHands();
        decks = new Deck(1);
        state.bet();
    }

    public void showMoney(){
        System.out.printf("You have money in your wallet: %d\n",money.getBalance());
    }

    public void setState(State state) {
        this.state = state;
    }

    public static Game getInstance() {
        if (instance == null){
            instance = new Game();
        }
        return instance;
    }
}
