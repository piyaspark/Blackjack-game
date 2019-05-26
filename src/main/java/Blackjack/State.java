package Blackjack;

import Blackjack.Game;

public abstract class State {
    protected Game game;

    public State(Game game){
        this.game = game;
    }

    public void bet(){}
    public void hit(){}
    public void stand(){}
    public void doubleHit(){}
    public void end(){}
    public void restart(){}
}
