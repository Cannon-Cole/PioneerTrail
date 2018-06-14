/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.InventoryModel;

/**
 *
 * @author Cole
 */
public class InventoryControl {

    public int getFoodAmountForOverComeObstacleDisplay(InventoryModel inventory) {

        return inventory.getFoodAmount();

    }

    public void removeFoodForOverComeObstacle(InventoryModel inventory, int foodEntered, boolean removeAll) {

        if (removeAll) {
            inventory.setFoodAmount((int) (inventory.getFoodAmount() - (foodEntered * 0.65)));
        }
        else {
            inventory.setFoodAmount(inventory.getFoodAmount() - foodEntered);
        }
    }

    public int getFoodAmountForView(InventoryModel inventory) {

        return inventory.getFoodAmount();
    }
    
    public void displayInventory() {
        System.out.println("*** displayInventory() called ***");
    }
    
    public void estimateResources() {
        System.out.println("*** estimateResources() called ***");
    }
}