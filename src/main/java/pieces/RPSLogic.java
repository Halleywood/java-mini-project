package pieces;

import java.util.HashMap;

public abstract class RPSLogic {

    public HashMap<String, Integer> setTheScoreTable(String input){
        HashMap<String, Integer> scoreTable = new HashMap<>();
        if(input.equals("R")){
            scoreTable.put("S", 0);
            scoreTable.put("P", 2);
        }
        else if(input.equals("S")){
            scoreTable.put("R", 2);
            scoreTable.put("P", 0);
        }
        else{
            scoreTable.put("S", 2);
            scoreTable.put("R", 0);
        }
        return scoreTable;
    }
}
