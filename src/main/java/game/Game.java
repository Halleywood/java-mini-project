package game;

import player.Computer;
import player.User;

import java.util.HashMap;

public class Game{
    private User player1;
    private User player2;
    private Computer computer;
    private HashMap<String, Integer> scoreBoard = new HashMap<>();


    public Game(User user1, User user2){
        this.player1 = user1;
        this.player2 = user2;
    }

    public Game(User user1, Computer computer){
        this.player1 = user1;
        this.computer = computer;
    }

    public User getPlayer1() {
        return player1;
    }

    public void setPlayer1(User player1) {
        this.player1 = player1;
    }

    public User getPlayer2() {
        return player2;
    }

    public void setPlayer2(User player2) {
        this.player2 = player2;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public HashMap<String, Integer> getScoreBoard() {
        return scoreBoard;
    }

    public void setScoreBoard(HashMap<String, Integer> scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    @Override
    public String toString() {
        return "Game{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", computer=" + computer +
                ", scoreBoard=" + scoreBoard +
                '}';
    }


}

