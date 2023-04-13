package game;

import pieces.Piece;
import player.Computer;
import player.User;

import java.util.Collection;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        System.out.println("Ok,"+ player2.getName() + " time to enter your choice...rock (R), paper (P), or scissors(S)???");
        while(!gameScanner.hasNext("[RPS]")){
            System.out.println("Please enter a R, P, or S");
            gameScanner.next();
        }
        String player2choice = gameScanner.next();

        System.out.println( player1.getName() + " chose " + player1choice);
        player1.choosePiece(player1choice);
        System.out.println(player2.getName() + " chose " + player2choice);
        player2.choosePiece(player2choice);
        determineWinner2Players(player1, player2);
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
        computer.choosePiece();
        System.out.println("The computer chose " + computer.getPiece().get().getType());
        determineWinner(player1, computer);
    }

    public void determineWinner(User player1, Computer computer){
        String player1Type = player1.getPiece().map(Piece::getType).orElse("");
        String computerType = computer.getPiece().map(Piece::getType).orElse("");

        Integer player1Score = player1.getPiece().get().getScoreTable().get(computerType);
        Integer computerScore = computer.getPiece().get().getScoreTable().get(player1Type);

        if(player1Score < computerScore){
            System.out.println(player1.getName()+ "wins!");
            //update score
        }
        else if( player1Score.equals(computerScore)){
            System.out.println("its a draw!?");
        }
        else{
            System.out.println("the computer wins =(");
            //update score
        }
        System.out.println("Would you like to play again?");

    }

    public void determineWinner2Players(User player1, User player2){
        String player1T = player1.getPiece().map(Piece::getType).orElse("");
        String player2Type = player2.getPiece().map(Piece::getType).orElse("");

        Integer player1Score = player1.getPiece().get().getScoreTable().get(player2Type);
        Integer player2Score = player2.getPiece().get().getScoreTable().get(player1T);

        if(player1Score < player2Score){
            System.out.println(player1.getName()+ " wins!");
            //update score
        }
        else if( player1Score.equals(player2Score)){
            System.out.println("its a draw!?");
        }
        else{
            System.out.println(player2.getName() + " wins!");
            //update score
        }
        System.out.println("Would you like to play again?");

    }
}
