/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.LocationControl;
import byui.cit260.pioneertrail.exceptions.LocationControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author aimeejorgensen
 */
public class CheckAfterHuntWeightView extends View{

    public CheckAfterHuntWeightView(String Message) {
     super("\nYou must maintain your food supply.  You have \" + foodAmount");   
    }
        @Override
    public boolean doAction(String[] inputs) {
        try{
            LocationControl.checkAfterHuntWeight(0, 0, 0);
        catch (LocationControlException ex) {
        }
      return false; 
}
