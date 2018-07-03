/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

/**
 *
 * @author Derek
 */
public class FamilyStatusView extends View {

    public FamilyStatusView(String message) {
        super(message);
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        
        // advance on any input. all this does wait until the player decides to continue
        return true;
        
    }
    
}
