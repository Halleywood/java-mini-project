package player;

import pieces.Piece;
import java.util.Optional;

public class User extends Player {

        public User(String name){
                super(name);
        }
        //user prompted to enter "R" or "P" or "S", takes that input to initialize a Piece object in this user's instance.
        public void choosePiece(String input){
                Piece newPiece = new Piece(input);
                Optional <Piece> newOP = Optional.of(newPiece);
                this.setPiece(newOP);
        }
}

