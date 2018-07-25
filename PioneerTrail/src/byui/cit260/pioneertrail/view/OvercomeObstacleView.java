/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.ActorControl;
import byui.cit260.pioneertrail.control.InventoryControl;
import byui.cit260.pioneertrail.control.LocationControl;
import byui.cit260.pioneertrail.enums.InventoryEnum;
import byui.cit260.pioneertrail.exceptions.LocationControlException;
import byui.cit260.pioneertrail.model.InventoryModel;
import java.io.PrintWriter;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class OvercomeObstacleView extends View {

    public OvercomeObstacleView() {
        super("\nIt takes more food to overcome rough terrain. You have \"" + PioneerTrail.getCurrentGame().getInventory().get(InventoryEnum.Food.ordinal()).getQuantity() + "\" food. How much will you ration for this obstacle?");
    }

    @Override
    public boolean doAction(String[] inputs) {

        int inputInt = 0;

        try {
            inputInt = Integer.parseInt(inputs[0]);
        } catch (NumberFormatException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

        boolean hasProperGear = false;

        ArrayList<InventoryModel> inventory = PioneerTrail.getCurrentGame().getInventory();
        LocationControl locationControl = new LocationControl();
        InventoryControl inventoryControl = new InventoryControl();

        if (PioneerTrail.getCurrentGame().getInventory().get(InventoryEnum.SpareWheels.ordinal()).getQuantity() > 0) {
            hasProperGear = true;
        }

        int overcame;
        try {
            overcame = locationControl.overComeObstacle(inputInt, PioneerTrail.getCurrentGame().getNumberOfPioneers(), hasProperGear);
        } catch (LocationControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }

        PrintWriter console = PioneerTrail.getOutFile();

        if (overcame == 1) {
            inventoryControl.removeFoodForOvercomeObstacle(inventory, inputInt, true);
            console.print("Your family has survived the obstacle successfully. You have "
                + PioneerTrail.getCurrentGame().getInventory().get(InventoryEnum.Food.ordinal()).getQuantity()
                + " food left.");
            return true;
        }
        else {
            inventoryControl.removeFoodForOvercomeObstacle(inventory, inputInt, false);
            console.print("Your family failed to overcome the obstacle and so ");

            ActorControl.removeFamilyMemberForOvercomeObstacle();
            
             console.print(" has died.");

            console.print(" \nYou have "
                + PioneerTrail.getCurrentGame().getInventory().get(InventoryEnum.Food.ordinal()).getQuantity()
                + " food left.");
            return true;
        }
    }
}
