/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.InventoryEnum;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.model.InventoryWeightPerItem;
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

    public static ArrayList<InventoryModel> createInventory() {
        System.out.println("***InventoryControl createInventory() called***");
        //new arraylist of inventory
        ArrayList<InventoryModel> inventory = new ArrayList<InventoryModel>();

        inventory.add(new InventoryModel("Food", 0));
        inventory.add(new InventoryModel("Medicine", 0));
        inventory.add(new InventoryModel("Spare Wheels", 0));
        inventory.add(new InventoryModel("Hammer Durability", 0));
        inventory.add(new InventoryModel("Axe Durability", 0));

        return inventory;
    }

    public static void fillInventoryTEMP(ArrayList<InventoryModel> inventory) {
        System.out.println("***InventoryControl fillInventoryTEMP() called***");
        //fills inventory with items
        inventory.get(InventoryEnum.Food.ordinal()).setQuantity(0);
        inventory.get(InventoryEnum.Medicine.ordinal()).setQuantity(0);
        inventory.get(InventoryEnum.SpareWheels.ordinal()).setQuantity(0);
        inventory.get(InventoryEnum.Axe.ordinal()).setQuantity(50);
        inventory.get(InventoryEnum.Hammer.ordinal()).setQuantity(0);
    }

    public static double getTotalWeight(ArrayList<InventoryModel> inventory) {

        double totalWeight = 0.0;
        int index = 0;
        for (InventoryModel inventoryLoop : inventory) {
            //TO INSTRUCTOR I feel like there is a better way to do this but I am not entirely sure what.
            //Is there a way to get a value using a name? That way I could get the name from my inventory
            //and use it to get the weight for that item.
            totalWeight += inventoryLoop.getQuantity() * InventoryWeightPerItem.values()[index].getWeight();
            index++;
        }
        
        if(totalWeight > 500)
        {
            return -1;
        }
        
        if(totalWeight < 0)
        {
            return -2;
        }

        return totalWeight;
    }

}
