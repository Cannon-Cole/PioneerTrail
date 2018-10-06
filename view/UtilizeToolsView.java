/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.GameControl;

/**
 *
 * @author Derek
 */
public class UtilizeToolsView extends View {
    
    public UtilizeToolsView () {
        super("Which tool do you want to use? " +
              "\n  A: Axe (Gather wood) " +
              "\n  H: Hammer (repair wagon) " +
              "\n  E: Exit");
    }

    @Override
    public boolean doAction(String[] inputs) {
        
        switch (inputs[0].toUpperCase()) {
            case "A":
                GameControl.utilizeAxe();
                //dependent on individual location data
                return true;
            case "H":
                GameControl.utilizeHammer();
                //repurpose repairWagonApply
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid Input");
                break;
        }
     
        return false;
        
    }
    
}
