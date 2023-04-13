package game;

import player.Computer;
import player.User;

import java.util.Scanner;

public class Play extends Game implements Logic{

    public Play(User player1, User player2){
        super(player1, player2);
    }

    public Play(User player1, Computer computer){
        super(player1, computer);
    }

    public void startTwoPlayers(User player1, User player2){
        Scanner gameScanner = new Scanner(System.in);
        System.out.println("Ok, time to enter your choice...rock (R), paper (P), or scissors(S)???");
        while(!gameScanner.hasNext("[RPS]")){
            System.out.println("Please enter a R, P, or S");
            gameScanner.next();
        }
        String player1choice = gameScanner.next();
        System.out.println("Ok you chose " + player1choice);
        player1.choosePiece(player1choice);
    }

    public void startComputer(User player1, Computer computer){
        Scanner gameScanner = new Scanner(System.in);
        System.out.println("Ok...rock (R), paper (P), or scissors(S)???");
        while(!gameScanner.hasNext("[RPS]")){
            System.out.println("Please enter a R, P, or S");
            gameScanner.next();
        }
        String player1choice = gameScanner.next();
        System.out.println("Ok you chose " + player1choice);
        player1.choosePiece(player1choice);
    }
}
