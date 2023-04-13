package game;

import player.Computer;
import player.User;

public interface Logic {
    //After startGame() in main method initializes two users and instantiates Play. Uses scanner to get user input where it calls "choosePiece() in either user or computer class.
    //instantiates a Piece object of type "userInput" which is either an R, P, or S
    //then calls determineWinner2Players function below
    void startTwoPlayers(User player1, User player2);
    //After startGame() in main method initializes one user and instantiates Play. Uses scanner to get user input, and calls on choosePice method in user to
    //instantiate a Piece object. Then calls computerChoice() in Computer class that randomly generates a choice.
    //then calls determineWinner function below
    void startComputer(User player1, Computer computer);
    //this method takes those inputs to determine user Piece type, then uses that String type as key in Piece scoreTable hashmap to determine its value compared to other input type.
    void determineWinner2Players(User player1, User player2);
    //same method but takes in  User and a Computer object
    void determineWinner(User player1, Computer computer);
    //Since there are two places to update user score, made seperate function. This takes in winning User and updates the scoreBoard
    //in Play object as well as updates individual User score.
    //Then asks user if they want to play again.
    void updateScore(User player);
}
