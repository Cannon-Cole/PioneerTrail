/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.InventoryControl;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.model.InventoryWeightPerItem;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class InventoryView extends View {

    public InventoryView() {

        //gets inventory from
        ArrayList<InventoryModel> mainInventory = PioneerTrail.getCurrentGame().getInventory();
        
        //test function remove later;
        InventoryControl.fillInventoryTEMP(mainInventory);

        //creates message holder
        String message = new String();

        //adds heading
        message += "Inventory";
        
        //goes through each inventory object in the arraylist
         int index = 0;
        for (InventoryModel inventory : mainInventory) {

            //appends the name and quantity
            message += "\n " + inventory.getName() + ": " + inventory.getQuantity();
            message += " that weighs: " +  String.format("%.2f", inventory.getQuantity() * InventoryWeightPerItem.values()[index].getWeight());
            
            index++;
        }
        //appends total weight to the list
        message += "\nTotal Weight: " + String.format("%.2f", InventoryControl.getTotalWeight(mainInventory));

        this.displayMessage = message;

//        super("\nInventory NOTE: Actual values will be displayed when the implementation gets that far"
//            + "\n  Total Weight: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getWeight()
//            + "\n  Food: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getFoodAmount()
//            + "\n  Medicine: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getMedicineAmount()
//            + "\n  Spare Wheels: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getSpareWheels()
//            + "\n  Axe Durability: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getAxeDurability()
//            + "\n  Hammer Durability: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getHammerDurability()
//            + "\n E: Exit");
    }

    @Override
    public boolean doAction(String[] inputs) {

        return false;
    }

}