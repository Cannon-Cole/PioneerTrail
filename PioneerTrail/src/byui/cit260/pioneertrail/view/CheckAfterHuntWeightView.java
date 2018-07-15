/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.LocationControl;
import byui.cit260.pioneertrail.exceptions.LocationControlException;

/**
 *
 * @author aimeejorgensen
 */
public class CheckAfterHuntWeightView extends View {

    public CheckAfterHuntWeightView(String Message) {
        super("\nYou must maintain your food supply.  You have \" + foodAmount");
    }

//    estimateResources(food,weightLeft):  The current weight of food resources 
//gatherResources(visited,animalWeight):  The weight of animal in hunt
//reduceFoodSupply

    
    @Override
    public boolean doAction(String[] inputs) {
        try {
            LocationControl.checkAfterHuntWeight(0, 0, 0);
        } catch (LocationControlException ex) {
            
            System.out.println(ex.getMessage());
            
        }
        return false;
    }
}
