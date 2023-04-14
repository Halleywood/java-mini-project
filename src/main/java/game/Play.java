package game;

import main.Main;
import main.Menu;
import pieces.Piece;
import player.Computer;
import player.User;

import java.util.Scanner;

public class Play extends Game implements Logic {

    private Boolean keepPlaying = true;

    public Play(User player1, User player2) {
        super(player1, player2);
    }

    public Play(User player1, Computer computer) {
        super(player1, computer);
    }

    static Scanner gameScanner = new Scanner(System.in);
    static Menu newMenu = new Menu();

    //see Logic
    public void startTwoPlayers(User player1, User player2) {
        System.out.println("Ok, " + player1.getName() + ", it's your turn...rock (R), paper (P), or scissors (S)?");
        while (!gameScanner.hasNext("[RPS]")) {
            System.out.println("Please enter a R, P, or S");
            gameScanner.next();
        }
        String player1choice = gameScanner.next();

        System.out.println("Ok, " + player2.getName() + ", it's your turn...rock (R), paper (P), or scissors (S)?");
        while (!gameScanner.hasNext("[RPS]")) {
            System.out.println("Please enter a R, P, or S");
            gameScanner.next();
        }
        String player2choice = gameScanner.next();
        player1.choosePiece(player1choice);
        player2.choosePiece(player2choice);
        System.out.println("💥💥💥" + player1.getName()+ " you played "+ player1choice + " and " + player2.getName() + " you played " + player2choice + "💥💥💥");
        determineWinner2Players(player1, player2);
    }

    //see Logic
    public void startComputer(User player1, Computer computer) {
        Scanner gameScanner = new Scanner(System.in);
        System.out.println("Ok " + player1.getName() + " it's your turn,...rock (R), paper (P), or scissors(S)?");
        while (!gameScanner.hasNext("[RPS]")) {
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

    //see Logic
    public void determineWinner(User player1, Computer computer) {
        String player1Type = player1.getPiece().map(Piece::getType).orElse("");
        String computerType = computer.getPiece().map(Piece::getType).orElse("");

        Integer player1Score = player1.getPiece().get().getScoreTable().get(computerType);
        Integer computerScore = computer.getPiece().get().getScoreTable().get(player1Type);

        if (player1Score < computerScore) {
            newMenu.printCelebration(player1.getName());
            updateScore(player1);
        } else if (player1Score.equals(computerScore)) {
            System.out.println("its a draw!?");
        } else {
            Menu.printComputer();
            if (this.getScoreBoard().containsKey(computer.getName())) {
                this.getScoreBoard().put(computer.getName(), this.getScoreBoard().get(computer.getName()) + 1);
            } else {
                this.getScoreBoard().put(computer.getName(), 1);
            }
        }
        System.out.println("Would you like to play again?");
        while(!gameScanner.hasNext("[YN]")){
            System.out.println("Please enter a Y or N");
            gameScanner.next();
        }
        String answer = gameScanner.next();
        if(answer.equals("Y")){
            keepPlayingComputer(player1, computer);
        }
        else{
            this.keepPlaying = false;
            Menu.endMenu();

        }
    }
    //see Logic
    public void determineWinner2Players(User player1, User player2){
        String player1T = player1.getPiece().map(Piece::getType).orElse("");
        String player2Type = player2.getPiece().map(Piece::getType).orElse("");

        Integer player1Score = player1.getPiece().get().getScoreTable().get(player2Type);
        Integer player2Score = player2.getPiece().get().getScoreTable().get(player1T);

        if(player1Score < player2Score){
            newMenu.printCelebration(player1.getName());
            updateScore(player1);
        }
        else if( player1Score.equals(player2Score)){
            System.out.println("its a draw!?");
        }
        else{
            newMenu.printCelebration(player1.getName());
            updateScore(player2);
        }
        System.out.println("Would you like to play again?");
        while(!gameScanner.hasNext("[YN]")){
            System.out.println("Please enter a Y or N");
            gameScanner.next();
        }
        String answer = gameScanner.next();
        if(answer.equals("Y")){
            keepPlayingTwoPlayers(player1, player2);
        }
        else{
            this.keepPlaying = false;
            Menu.endMenu();

        }
    }
    //if User enters yes in determineWinner method, calls this which will continuously call itself while this.keepPlaying
    //is true. If in determineWinner method, user enters NO, sets this.keepPlaying to false and keepPlaying method will break
    //out of while loop.
    public void keepPlayingTwoPlayers(User player1, User player2){
        while(this.keepPlaying){
            Menu.scoreBoard();
            System.out.println("       "+ this.getScoreBoard());
        if(player1.getScore() % 2 == 1){
            System.out.println("Alright " + player1.getName() + ", it's your turn to go first");
            startTwoPlayers(player1, player2);
        }
        else{
            System.out.println("Alright " + player2.getName() + ", it's your turn to go first");
            startTwoPlayers(player2, player1);
        }
        }
    }

    public void keepPlayingComputer(User player1, Computer computer){
        while(this.keepPlaying){
            Menu.scoreBoard();
            System.out.println("       "+ this.getScoreBoard());
            startComputer(player1, computer);
        }
    }
//see Logic
    public void updateScore(User player){
        if(this.getScoreBoard().containsKey(player.getName())){
            this.getScoreBoard().put(player.getName(), this.getScoreBoard().get(player.getName())+1);
        }
        else{
            this.getScoreBoard().put(player.getName(), 1);
        }
        player.setScore(player.getScore()+1);
    }
}
