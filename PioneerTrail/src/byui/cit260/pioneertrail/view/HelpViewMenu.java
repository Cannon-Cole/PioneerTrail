/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author Aimee
 */
public class HelpViewMenu {
    
    public void displayHelpMenuView() {
        System.out.println("*** HelpViewMenu - displayHelpMenuView() called ***");
    
        boolean endOfView = false;
    
        do {
            
            String[] inputs = this.getInputs();

            if (inputs == null) {
                return;
                
            } else if ("Q".equals(inputs[0].toUpperCase())) {
                return;
            }

            endOfView = doAction(inputs);
            
        } while (endOfView == false);
    
   }
    
    
    private boolean doAction(String[] inputs) {
        
        switch(inputs[0].toUpperCase()) {
        case "G": 
            System.out.println("Placeholder for the goal of the game");
            break;
        case "M":
            System.out.println("Placeholder for how to move");
            break;
        case "H":
            System.out.println("Placeholder for how to hunt");
            break;
        case "Q":
            return true;
        default:
            System.out.println("Invalid Selection");
        }
        
        return false;
    }
    
     private String[] getInputs() {
        
        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {

            System.out.println("\n Help Menu" +
                    "\n  G: What is the goal of the game?" +
                    "\n  M: How to move" +
                    "\n  H: How to hunt" +
                    "\n  Q: Quit Menu" );
            
            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must specify a value");
                continue;
            }
            
            valid = true;
        }
        
        return inputs;
    }
        
}
