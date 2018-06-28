/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.InventoryModel;
import java.util.ArrayList;

/**
 *
 * @author Cole
 */
public class InventoryControl {

    public int getFoodAmountForOvercomeObstacleDisplay(ArrayList<InventoryModel> inventory) {

        return inventory.get(0).getQuantity();
    }

    public void removeFoodForOvercomeObstacle(ArrayList<InventoryModel> inventory, int foodEntered, boolean removeAll) {

        if (removeAll) {
            inventory.get(0).setQuantity((int) (inventory.get(0).getQuantity() - (foodEntered * 0.65)));
        }
        else {
            inventory.get(0).setQuantity(inventory.get(0).getQuantity() - foodEntered);
        }
    }

    public int getFoodAmountForView(ArrayList<InventoryModel> inventory) {

        return inventory.get(0).getQuantity();
    }

    public void estimateResources() {
        System.out.println("*** estimateResources() called ***");
    }
}