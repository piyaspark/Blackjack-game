package Blackjack;

public class IdleState extends State {
    public IdleState(Game game) {
        super(game);
    }

    @Override
    public void bet() {
        if (game.bet()){
            game.dealOut();
            game.showCards();
            game.setState(new CheckState(game));
            game.option();
        }

    }
}
