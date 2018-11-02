/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.exceptions.GameControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derek
 */

public class StartExistingGameView extends View {
    
    @Override
    public String getInputs() {
        String message = "Enter filename:\n";
        String input = getInput(message);
        return input;
    }
    
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        
        try {
            GameControl.loadGame(filePath);
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), "I/O Error in doAction(): " + ex.getMessage());
            return false;
        } catch (ClassNotFoundException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),"I/O Error: " + ex.getMessage());
            return false;
        }
        
        this.console.println("Game was loaded from " + filePath);
        GameMainView gameMainView = new GameMainView();
        gameMainView.display();
        
        return true;
    }
    
}
