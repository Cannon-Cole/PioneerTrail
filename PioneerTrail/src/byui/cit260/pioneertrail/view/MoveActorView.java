/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.MapControl;
import byui.cit260.pioneertrail.model.LocationModel;
import exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derek
 */
public class MoveActorView extends View {
    
    
    @Override
    public String getInputs() {
        
        String inputRow = new String();
        String inputCol = new String();
        
        inputRow = getInput("Enter new location row (0-1) (E to exit):");
        
        if ("E".equals(inputRow.toUpperCase()))
            return "E";
        
        inputCol = getInput("Enter new location column (0-12) (E to exit):");
        //todo: implement limits on moving one column at a time
        if ("E".equals(inputCol.toUpperCase()))
            return "E";
        
        String inputs = inputRow + "," + inputCol;
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) throws NumberFormatException{
        
        int newRow;
        int newColumn;
        String[] theInputs = inputs[0].split(",");
        
        try {
            newRow = Integer.parseInt(theInputs[0]);
            newColumn = Integer.parseInt(theInputs[1]);
            
        } catch (NumberFormatException nx) {
            System.out.println(nx.getMessage().replaceFirst("For input string:.*","\nYou need to enter an integer"));
            return false;
        }
        
        try {
            LocationModel newLocation = MapControl.moveActor(newRow, newColumn);
            System.out.println(newLocation.getScene().getName());
        } catch (MapControlException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
        return true;
        
    }
    
}
