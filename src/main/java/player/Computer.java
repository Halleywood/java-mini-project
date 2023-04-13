package player;
import pieces.Piece;

import java.util.Optional;
import java.util.Random;

public class Computer extends Player implements ComputerLogic{

    public Computer(){}
    public Computer(String name){
        super(name);
    }

    public void choosePiece(){
        String[] types = {"R", "P", "S"};
        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(0, 2);

        Piece newPiece = new Piece(types[randomNumber]);
        Optional<Piece> newOP = Optional.of(newPiece);
        this.setPiece(newOP);
    }

}
