/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Hunter
 */
public class DnDCharacterCreator {

    private static Menu menu;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu = new Menu();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu.setVisible(true);
            }
        });
    }
    
}
