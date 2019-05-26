package Blackjack;

public class CheckState extends State{
    public CheckState(Game game) {
        super(game);
    }

    @Override
    public void hit(){
        if (game.hit()){
            game.option();
        }else{
            game.setState(new EndState(game));
            game.result();
        }

    }

    @Override
    public void doubleHit(){
        game.doubleHit();
        game.setState(new EndState(game));
        game.result();
    }

    @Override
    public void stand(){
        game.stand();
        game.setState(new EndState(game));
        game.result();
    }
}
