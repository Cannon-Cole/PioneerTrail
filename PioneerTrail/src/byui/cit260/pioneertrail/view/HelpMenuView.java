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
public class HelpMenuView {
    
    public void displayHelpMenuView() {
        System.out.println("*** HELP MENU ***");
    
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
            displayGoalGame();
            break;
            
        case "M":
            System.out.println("Placeholder for how to move");
            displayHowToMove();
            break;
            
        case "H":
            System.out.println("Placeholder for how to hunt");
            displayHowToHunt();
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

            System.out.println("\n =====HELP MENU=====" +
                    "\n  G: The Goal of the Game" 
//                 
                    +
                    "\n  M: How to Move"
               
                    +
                    "\n  H: How to Hunt" 
                    
                    +  
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

    private void displayGoalGame() {
        System.out.println("The goal of the game is for your wagon party to make"
                + "\n it across the plains to Zion, with 2 or more family members");
    }

    private void displayHowToMove() {
        System.out.println("Move your player by entering the coordinates of on"
                    + "\n the map at each turn, for example, 0,1 would indicate row one"
                    + "\n square 2, which would move your player to square 2");
         
    }

    private void displayHowToHunt() {
        System.out.println("If you wish to hunt for food, enter A for arrow,"
                + "\n G for gun, or + T for trap");
    }
                
}
