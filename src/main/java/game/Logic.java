package game;

public interface Logic {
    //two players game logic
    static void twoUsers(){
        //need to grab input from scanner to make both pieces here
        //determine winner function here
    }
   static void oneUserOneComputer(){
        //grab input from user
       //grab random choice from computer
       //determine winner function here
   }
   static void determineWinner(){
        //is fed the inputs from above methods, determines winner.
       //returns winner
   }
   static void updateScores(){
        //gets winner, updates player scores and game scoreboard accordingly.
       //calls main menu set up again?
   }
}
