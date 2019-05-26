package Blackjack;


public class NewbieBotStrategy implements BotStrategy{

    public boolean canDraw(int total) {
        if (total == 21)return false;
        else if (total < 21)return true;
        return false;
    }

}
