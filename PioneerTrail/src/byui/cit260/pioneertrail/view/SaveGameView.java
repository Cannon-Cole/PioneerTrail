/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import pioneertrail.PioneerTrail;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.exceptions.GameControlException;

/**
 *
 * @author Derek
 */
public class SaveGameView extends View {
    
    @Override
    public String getInputs() {
        String message = "Enter filename:\n";
        String input = getInput(message);
        return input;
    }
    
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        GameModel game = PioneerTrail.getCurrentGame();
        
        try {
            GameControl.saveGame(game, filePath);
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), "I/O Error in doAction(): " + ex.getMessage());
        }
        
        
        return true;
    }
    
}
