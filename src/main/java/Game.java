import java.util.*;
import  java.lang.*;

class Game {
    private static Set<String> validSet = new HashSet<String>();

    //constructor: create valid input set
    public Game(){
        validSet.add("rock");
        validSet.add("paper");
        validSet.add("scissors");
    }

    //input validation
    public void inputValidation(String choice){
        if(!validSet.contains(choice))
            throw new IllegalArgumentException("Bad choice!");
        else
            return;
    }

    //check winner
    public String winner(String player1, String player2) {
        String result = "";
        //draw
        if(player1.equals(player2)) {
            result = "Draw!";
        }else{
            //one of the player wins
            switch(player1){
                case "rock":
                    if(player2.equals("scissors"))
                        result = "Player 1 win!";
                    else if(player2.equals("paper"))
                        result = "Player 2 win!";
                    break;
                case "paper":
                    if(player2.equals("rock"))
                        result = "Player 1 win!";
                    else if(player2.equals("scissors"))
                        result = "Player 2 win!";
                    break;
                case "scissors":
                    if(player2.equals("paper"))
                        result = "Player 1 win!";
                    else if(player2.equals("rock"))
                        result = "Player 2 win!";
                    break;
            }
        }
        return result;
    }

}