package pieces;

import java.util.HashMap;

public class Piece extends RPSLogic{
    private String type;
    private HashMap<String, Integer> scoreTable;

    public Piece() {}
    public Piece(String type) {
        this.type = type;
        this.scoreTable = setTheScoreTable(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashMap<String, Integer> getScoreTable() {
        return scoreTable;
    }

    public void setScoreTable(HashMap<String, Integer> scoreTable) {

    }

    @Override
    public String toString() {
        return "Piece{" +
                "type='" + type + '\'' +
                ", scoreTable=" + scoreTable +
                '}';
    }

}
