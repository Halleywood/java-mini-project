package player;
import pieces.Piece;

import java.util.Optional;
import java.util.Random;

public class Computer extends Player implements ComputerLogic{

    public Computer(String name){
        super(name);
    }

    //random number chosen for an index of 0-2 for types array. Initializes new Piece object of that random type
    //under Computer's Piece attribute.
    public void choosePiece(){
        String[] types = {"R", "P", "S"};
        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(0, 2);

        Piece newPiece = new Piece(types[randomNumber]);
        Optional<Piece> newOP = Optional.of(newPiece);
        this.setPiece(newOP);
    }

}
