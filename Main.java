/**
 * @author Zach Holloway
 */

import java.util.*;
import java.util.Scanner;

public class Main {
    //Program is to help make dnd character outlines quickly

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sets up a scanner to take user inputw
        Scanner input = new Scanner(System.in);
        CharaterBuild testBuild = new CharaterBuild();

        System.out.println("""
                           Preparing to create Character
                           Do you wish to roll for stats, or use Point Buy?
                           (Type 'R' for Roll, 'P' for Point Buy, or 'Q' to Quit)""");
        String part1 = input.nextLine();
        switch(part1){
            case "R", "r" -> {
                System.out.println("Getting ready to roll!");
                testBuild.rollDice();
                System.out.println("""
                                   How would you like to distribute these points?
                                   (Randomly(R) or Selected(S)?)""");
                String pickOrRand = input.nextLine();
                testBuild.statSelect(pickOrRand);
            }
            case "P", "p" -> {
                System.out.println("Getting the points ready!");
                testBuild.pointBuy();
            }
            case "Q", "q" -> {
                System.out.println("Exiting...");
                System.exit(0);
            }
        }

    }
    
}
