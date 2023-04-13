package pieces;

import java.util.HashMap;

public abstract class RPSLogic {

    public HashMap<String, Integer> setTheScoreTable(String input){
        HashMap<String, Integer> scoreTable = new HashMap<>();
        if(input.equals("R")){
            scoreTable.put("S", -1);
            scoreTable.put("P", 2);
            scoreTable.put("R", 0);
        }
        else if(input.equals("S")){
            scoreTable.put("R", 2);
            scoreTable.put("P", -1);
            scoreTable.put("S", 0);
        }
        else{
            scoreTable.put("S", 2);
            scoreTable.put("R", -1);
            scoreTable.put("P", 0);
        }
        return scoreTable;
    }
}
