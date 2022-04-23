/**
 * @author Zach Holloway
 */

package main;

import java.util.*;
import java.util.Random;

public class CharacterBuild {
    public enum Race {
        HALFLING,
        GNOME
    };

    private Random rand = new Random();
    private int[] statArray = new int[6];

    private String name;
   
    public int[] rollDice(){
        //sets up a temp array to hold dice rolls to be sorted
        int[] tempArray = new int[4];
        int diceRole;

        /*rolls the dice and puts numbers into the array
          then the array is sorted and calculates the totals
          putting those values into statArray*/
        for (int i = 0; i<statArray.length; i++) {
            for(int j=0; j<tempArray.length; j++){
                diceRole = 1+rand.nextInt(6);
                tempArray[j] = diceRole;
            }
            Arrays.sort(tempArray);
            statArray[i] = tempArray[1] + tempArray[2] + tempArray[3];
        }
        return statArray;
    }

    public void pointBuy(){
        //
        System.out.println("MEME");
    }
    
    public int[] statSelect(String pickOrRand){
        //Distributing stats to the six abilities
        switch(pickOrRand){
            case "Randomly", "randomly", "Random", "random", "R", "r" -> {
                //Will randomly distribute the stats
                System.out.println("Stats corolate to that of a character sheet\n"+
                                    "(STR, DEX, CON, INT, WIS, CHA)");
                for(int i = 0; i<statArray.length; i++){
                    int swapper = rand.nextInt(statArray.length);
                    int tempHold = statArray[swapper];
                    statArray[swapper] = statArray[i];
                    statArray[i] = tempHold;
                }
                System.out.println("Heres your random distibution\n"+
                                    Arrays.toString(statArray));
            }
            case "Selected", "selected", "Select", "select", "S", "s" -> {
                //
            }
        }
        return statArray;
    }

    public void modValue(){
        //
        /*switch(){
        case "" ->{
        //
        }
        }*/
    }
}
