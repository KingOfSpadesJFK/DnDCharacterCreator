/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Hunter, Zach Holloway
 */
public class DnDCharacterCreator {

    private static Menu menu;

    public static void main(String[] args)
    {
        // sets up a scanner to take user inputw
        Scanner input = new Scanner(System.in);
        CharacterBuild testBuild = new CharacterBuild();

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

    /**
     * @param args the command line arguments
     */
    private static void runMenu() {
        // TODO code application logic here
        menu = new Menu();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu.setVisible(true);
            }
        });
    }
    
}
