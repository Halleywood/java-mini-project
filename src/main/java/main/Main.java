package main;

import game.Play;
import player.Computer;
import player.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gameScanner = new Scanner(System.in);
        startNewGame(gameScanner);
    }

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

    public static void keepPlayingTwoPlayers(User player1, User player2, Scanner gameScanner){
        if(player1.getScore() % 2 == 1){
            System.out.println("Alright " + player1.getName() + " , it's your turn to go first");
        }
        System.out.println("Alright " + player2.getName() + " , it's your turn to go first");

    }
}
