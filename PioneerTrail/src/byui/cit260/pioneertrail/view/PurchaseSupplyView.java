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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;
import java.io.FileWriter;
/**
 *
 * @author aimeejorgensen
 */
public class PurchaseSupplyView extends View {

    private double totalFoodWeight;

    public PurchaseSupplyView() {
        
        ArrayList<InventoryModel> foodInventory;
        foodInventory = PioneerTrail.getCurrentGame().getInventory();
        
        String message = "****GENERAL STORE****";
        
        int index = 0;
        for (InventoryModel foodArray : foodInventory) {

            //appends the name and quantity
            message += "\n " + foodArray.getName() + ": " + foodArray.getQuantity();
            message += " that weighs: " + String.format("%.2f", foodArray.getQuantity() * InventoryWeightPerItem.values()[index].getWeight());

            index++;
        }
        double totalFoodWeight = 0;
        
        try {
            totalFoodWeight = InventoryControl.getTotalFoodWeight(foodInventory);
            message += "\nTotal Food Weight: " + String.format("%.2f", totalFoodWeight);
            
        } catch (InventoryControlException ex) {
            ErrorView.display(this.getClass().getName(), "Error Calculating Total Weight. " + ex.getMessage());
        }

        message += "\n(E to Exit)";
        //appends total weight to the list
        this.displayMessage = message;
        
    }
        public void getFilePath() {
            
        PrintWriter console = PioneerTrail.getOutFile();
        BufferedReader keyboard = PioneerTrail.getInFile();
        String filePath = "";
        
        this.console.println("Enter file path.");
        
        
        try {
            filePath = this.keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }

        if ("".equals(filePath)) {
            this.printReport(filePath + "Total Food Report.txt");
        }

        else {
            this.printReport(filePath + "Total Food Report.txt");
        }

    }
        

public void printReport(String filePath) {

        ArrayList<InventoryModel> mainInventory = PioneerTrail.getCurrentGame().getInventory();

        FileWriter inventoryLog = null;
        try {
            inventoryLog = new FileWriter(filePath);
        } catch (IOException ex) {
            this.console.println("Could not create inventory report character stream character stream");
        }

        try {

            PrintWriter keyboard = PioneerTrail.getOutFile();

            String message = String.format("%27s %n %n", "Inventory Report");
            message += String.format("%-17s %-10s %-10s %n %n", "Inventory", "Quantity", "Weight");

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

            this.console.println("Inventory report print success");

        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            this.console.println("Inventory report print failure");
        } finally {
            try {
                inventoryLog.close();
            } catch (IOException ex) {
                this.console.println("Could not close inventory report character stream");
            }
        }
    }

    @Override
    public boolean doAction(String[] inputs) {
        
        //gets inventory from
        ArrayList<InventoryModel> foodArray = PioneerTrail.getCurrentGame().getInventory();

        switch (inputs[0].toUpperCase()) {
            case "B":
                this.console.println("Bacon/Dried Meat");
                break;
            case "H":
                this.console.println("Salted Ham");
                break;
            case "F":
                this.console.println("Barrel of Flour");
                break;
            case "S":
                this.console.println("Barrel of Sugar");
                break;
            case "L":
                this.console.println("Lard");
                break;
            case "M":
                this.console.println("Barrel of Molasses");
                break;
            case "Q":
                return true;
            case "E":
                this.console.println("Exit");
                break;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid input");
        }

        return false;
    }
}