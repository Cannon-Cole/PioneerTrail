/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.InventoryControl;
import byui.cit260.pioneertrail.exceptions.InventoryControlException;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.enums.InventoryWeightPerItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;
import java.io.FileWriter;

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
        String message = "Inventory";

        //goes through each inventory object in the arraylist
        int index = 0;
        for (InventoryModel inventory : mainInventory) {

            //appends the name and quantity
            message += "\n " + inventory.getName() + ": " + inventory.getQuantity();
            message += " that weighs: " + String.format("%.2f", inventory.getQuantity() * InventoryWeightPerItem.values()[index].getWeight());

            index++;
        }

        double totalWeight = 0;

        try {
            totalWeight = InventoryControl.getTotalWeight(mainInventory);
            message += "\nTotal Weight: " + String.format("%.2f", totalWeight);
        } catch (InventoryControlException ex) {
            ErrorView.display(this.getClass().getName(), "Can't calculate total weight. " + ex.getMessage());
        }

        message += "\n(E to Exit)";
        //appends total weight to the list
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

    public void getFilePath() {

        PrintWriter console = PioneerTrail.getOutFile();
        PrintWriter keyboard = PioneerTrail.getOutFile();
        String filePath = "";

        this.console.println("Please enter the file path for the inventory report");

        try {
            filePath = this.keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

        this.printReport(filePath);

    }

    public void printReport(String filePath) {

        ArrayList<InventoryModel> mainInventory = PioneerTrail.getCurrentGame().getInventory();

        try {
            FileWriter inventoryLog = new FileWriter(filePath);
            PrintWriter keyboard = PioneerTrail.getOutFile();

            String message = String.format("%-17s %-10s %-10s %n %n", "Inventory", "Quantity", "Weight");

            //goes through each inventory object in the arraylist
            int index = 0;
            for (InventoryModel inventory : mainInventory) {

                //appends the name and quantity
                message += String.format("%-22s", inventory.getName());
                message += String.format("%-8s", inventory.getQuantity());
                message += String.format("%.2f %n", inventory.getQuantity() * InventoryWeightPerItem.values()[index].getWeight());

                index++;
            }

            inventoryLog.write(message);
            inventoryLog.flush();
            inventoryLog.close();

            this.console.println("Inventory report print success");

        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            this.console.println("Inventory report print failure");

        }
    }

    @Override
    public boolean doAction(String[] inputs) {

        return false;
    }

}
