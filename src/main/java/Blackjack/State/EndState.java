package Blackjack.State;

import Blackjack.Game;

public class EndState extends State{
    public EndState(Game game) {
        super(game);
    }

    @Override
    public void restart(){
        game.setState(new IdleState(game));
        game.restart();
    }
}
