package player;

import com.sun.tools.javac.util.StringUtils;
import pieces.Piece;
import java.util.Optional;

public class User extends Player{

        public User(String name){
                super(name);
        }
        public void choosePiece(String input){
                Piece newPiece = new Piece(input);
                Optional <Piece> newOP = Optional.of(newPiece);
                this.setPiece(newOP);
        }
}

