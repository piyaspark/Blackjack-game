package Blackjack;

public class ExpertBotStrategy implements BotStrategy{
    private Player player = Player.getInstance();

    public boolean canDraw(int total) {
        if (total < player.getTotal())return true;
        return false;
    }
}
