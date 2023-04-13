package game;

import player.Computer;
import player.User;

public interface Logic {
    //two players game logic
    void startTwoPlayers(User player1, User player2);
    void startComputer(User player1, Computer computer);
    void determineWinner(User player1, Computer computer);
    void determineWinner2Players(User player1, User player2);
   static void updateScores(){
        //gets winner, updates player scores and game scoreboard accordingly.
       //calls main menu set up again?
   }
}
