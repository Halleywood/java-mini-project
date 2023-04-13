package player;
import pieces.Piece;
import java.util.Optional;

public class Player {
    //Made Player class to hold all attributes/getters/setters so User and Computer had better readability.
    private String name;
    private int score;
    private Optional<Piece> piece = Optional.empty();

    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Optional <Piece> getPiece() {
        return piece;
    }

    public void setPiece(Optional <Piece> piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", piece=" + piece +
                '}';
    }
    // any other methods???
}
