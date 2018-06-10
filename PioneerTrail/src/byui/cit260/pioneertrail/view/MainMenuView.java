/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author aimeejorgensen
 */
public class MainMenuView {
    
    public void displayMainMenuView(){
    
        boolean endOfView = false;
    
        do {
            
            String[] inputs = this.getInputs();

            if (inputs == null) {
                return;
            } else if ("E".equals(inputs[0].toUpperCase())) {
                return;
            }

            endOfView = doAction(inputs);
            
        } while (endOfView == false);
    
   }

    private String[] getInputs() {
        
        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {

            System.out.println("\nMAIN MENU" +
                    "\n  N: Start new game" +
                    "\n  L: Load existing game" +
                    "\n  R: Restart existing game" +
                    "\n  H: Get help on how to play the game" +
                    "\n  E: Exit");
            
            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            valid = true;
        }
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        switch(inputs[0].toUpperCase()) {
        case "N":
            startNewGame();
            break;
        case "L":
            loadGame();
            break;
        case "R":
            restartGame();
            break;
        case "H":
            getHelp();
            break;
        case "E":
        case "Q":
            return true;
        default:
            System.out.println("Invalid input");
        }
        
        return false;
    }
    
    private void startNewGame() {
        System.out.println("New Game");
    }
    
    private void loadGame() {
        System.out.println("Load Game");
    }
    
    private void restartGame() {
        System.out.println("Restart Game");
    }
    
    private void getHelp() {
        System.out.println("Get Help");
    }
}
