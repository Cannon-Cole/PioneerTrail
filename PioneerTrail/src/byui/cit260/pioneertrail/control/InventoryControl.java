/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.exceptions.InventoryControlException;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.enums.InventoryWeightPerItem;
import byui.cit260.pioneertrail.model.GameModel;
import java.io.PrintWriter;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class InventoryControl {

    public void removeFoodForOvercomeObstacle(ArrayList<InventoryModel> inventory, int foodEntered, boolean removeAll) {

        if (removeAll) {
            inventory.get(InventoryWeightPerItem.Food.ordinal()).setQuantity((int) (inventory.get(InventoryWeightPerItem.Food.ordinal()).getQuantity() - (foodEntered * 0.65)));
            
            if(inventory.get(InventoryWeightPerItem.Food.ordinal()).getQuantity() < 0)
            {
                inventory.get(InventoryWeightPerItem.Food.ordinal()).setQuantity(0);
            }
        }
        else {
            inventory.get(0).setQuantity(inventory.get(0).getQuantity() - foodEntered);
            
            if(inventory.get(InventoryWeightPerItem.Food.ordinal()).getQuantity() < 0)
            {
                inventory.get(InventoryWeightPerItem.Food.ordinal()).setQuantity(0);
            }
        }
    }

    public void estimateResources() {
        PrintWriter output = PioneerTrail.getOutFile();
    }

    public static ArrayList<InventoryModel> createInventory() {
        PrintWriter output = PioneerTrail.getOutFile();
        
        //new arraylist of inventory
        ArrayList<InventoryModel> inventory = new ArrayList<InventoryModel>();

        inventory.add(new InventoryModel("Food", 0));
        inventory.add(new InventoryModel("Medicine", 0));
        inventory.add(new InventoryModel("Spare Wheels", 0));
        inventory.add(new InventoryModel("Hammer Durability", 0));
        inventory.add(new InventoryModel("Axe Durability", 0));
   
        ArrayList<InventoryModel> foodArray= new ArrayList <InventoryModel>();
        foodArray.add(new InventoryModel("Beef", 0));
        foodArray.add(new InventoryModel("Chicken", 0));
        foodArray.add(new InventoryModel("Flour", 0));
        foodArray.add(new InventoryModel("Eggs", 0));
        foodArray.add(new InventoryModel("Lard", 0));      

        return foodArray;
        
//        return inventory;
    }

    public static void fillInventoryTEMP(ArrayList<InventoryModel> inventory) {
        //fills inventory with items
        inventory.get(InventoryWeightPerItem.Food.ordinal()).setQuantity(400);
        inventory.get(InventoryWeightPerItem.Medicine.ordinal()).setQuantity(10);
        inventory.get(InventoryWeightPerItem.SpareWheels.ordinal()).setQuantity(3);
        inventory.get(InventoryWeightPerItem.Axe.ordinal()).setQuantity(1);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setQuantity(1);
    }

    public static double getTotalWeight(ArrayList<InventoryModel> inventory) throws InventoryControlException {

        double totalWeight = 0.0;
        int index = 0;
        for (InventoryModel inventoryLoop : inventory) {
            totalWeight += inventoryLoop.getQuantity() * InventoryWeightPerItem.values()[index].getWeight();
            index++;
        }
        
        if(totalWeight > GameModel.getMaxWeight())
        {
             throw new InventoryControlException("Total weight can't be over " + GameModel.getMaxWeight());
        }
        
        if(totalWeight < 0)
        {
            throw new InventoryControlException("Total weight can't be less than 0");
        }

        return totalWeight;
    }
    
     public static void fillInventoryFood(ArrayList<InventoryModel> foodArray) {
        //fills inventory with items
        foodArray.get(InventoryWeightPerItem.BaconDriedBeef.ordinal()).setQuantity(300);
        foodArray.get(InventoryWeightPerItem.Flour.ordinal()).setQuantity(200);
        foodArray.get(InventoryWeightPerItem.Sugar.ordinal()).setQuantity(150);
        foodArray.get(InventoryWeightPerItem.Lard.ordinal()).setQuantity(200);
        foodArray.get(InventoryWeightPerItem.Molasses.ordinal()).setQuantity(50);
    }
    
    public static double getTotalFoodWeight(ArrayList<InventoryModel> food) throws InventoryControlException {

        double totalFoodWeight = 0.0;
        int index = 0;
        for (InventoryModel inventoryLoop : food) {
            totalFoodWeight += inventoryLoop.getQuantity() * InventoryWeightPerItem.values()[index].getWeight();
            index++;
        }
        
        if(totalFoodWeight > GameModel.getMaxWeight())
        {
             throw new InventoryControlException("Total weight can't be over " + GameModel.getMaxWeight());
        }
        
        if(totalFoodWeight < 0)
        {
            throw new InventoryControlException("Total weight can't be less than 0");
        }

        return totalFoodWeight;
    }

}
