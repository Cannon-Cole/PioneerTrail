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

        }
        while (endOfView = false);
    
   }

    private String[] getInputs() {
        
        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {

            System.out.println("  N: Start new game" +
                    "\n  L: Load existing game" +
                    "\n  H: Get help on how to play the game" +
                    "\n  E: Exit");
            
            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            switch(inputs[0].toUpperCase()) {
            case "N":
                System.out.println("input is N - New Game");
                break;
            case "L":
                System.out.println("input is L - Load Game");
                break;
            case "H":
                System.out.println("input is H - Get Help");
                break;
            case "E":
                System.out.println("input is E - Exit");
                break;
            default:
                System.out.println("Invalid input");
                continue;
            }
            
            valid = true;
        }
        
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("*** MainMenuView - doAction() called ***");
        return true;
    }
   
   
}
