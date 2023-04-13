package main;

import game.Play;
import player.Computer;
import player.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //calls startGame function and feeds method an instance of a Scanner to get user input
        Scanner gameScanner = new Scanner(System.in);
        startNewGame(gameScanner);
    }

    //gets user input, input is validated so if nothing is entered will default to Player 1...same for if user chooses to play with second
    //player, if nothing entered will default to "player 2"
    //once user has decided to play with friend, this method instantiates both User objects and calls Play(User, User) constructor
    //then has access to "startTwoPlayers" method in Play object.

    //If user selects to play computer in ELSE statement, this method instantiates a Computer object and a Play(User, Computer) constructor method.
    //then has access to "startComputer" method in Play object.
    public static void startNewGame(Scanner gameScanner){
        System.out.println("Welcome, please enter your name: ");
        String name = gameScanner.nextLine();
        if(name.length() < 1) name = "Player 1";
        User player1 = new User(name);
        System.out.println("Hi "+ player1.getName()+ ", would you like to play against a friend OR the computer? PRESS 1 to add another player or PRESS 2 to play against the computer");
        String choice = gameScanner.nextLine();
        if (choice.equals("1")) {
            System.out.println("Ok...player two, enter your name:");
            String name2 = gameScanner.nextLine();
            if(name2.length() < 1 ) name2 = "Player 2";
            User player2 = new User(name2);
            Play newGame = new Play(player1, player2);
            newGame.startTwoPlayers(player1, player2);
        } else {
            System.out.println("Alright, you chose to play the computer. Here we go!");
            Computer computer = new Computer("Computer");
            Play newGame = new Play(player1, computer);
            newGame.startComputer(player1, computer);
        }
    }
}
