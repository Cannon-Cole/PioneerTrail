/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.InventoryControl;
import byui.cit260.pioneertrail.control.LocationControl;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.model.PlayerModel;
import java.util.ArrayList;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class OvercomeObstacleView extends View {

//    delete this view
//    public void display(InventoryModel inventory) {
//
//        InventoryControl inventoryControl = new InventoryControl();
//
//        int inputs = this.getInputs(inventory);
//
//        boolean overCame = doAction(inputs, inventory);
//
//        if (overCame) {
//            System.out.println("Your family has crossed the rough terrain unscathed. You have " + inventoryControl.getFoodAmountForView(inventory) + " food left.");
//        }
//        else {
//            System.out.println("One of your family members has died. You have " + inventoryControl.getFoodAmountForView(inventory) + " food left.");
//        }
//    }
    @Override
    public String[] getInputs () {
        Scanner reader = new Scanner(System.in);

        String[] inputs = new String[1];

        String choice = this.getInput("\nIt takes more food to overcome rough terrain. You have \" + foodAmount + \" food. How much will you ration for this obstacle?");

        inputs[0] = choice;


        return inputs;

//        InventoryControl inventoryControl = new InventoryControl();
//
//        int foodAmount = inventoryControl.getFoodAmountForOverComeObstacleDisplay(inventory);
//
//        int foodEntered = -1;
//
//        boolean valid = false;
//
//        while (valid == false) {
//
//            System.out.println("\n Rough terrain encountered. It takes more food to overcome rough terrain. You have " + foodAmount + " food. How much will you ration for this obstacle?");
//
//            inputs[0] = reader.nextLine().trim();
//
//            if (inputs[0].length() < 1) {
//                System.out.println("You must specify a value");
//                continue;
//            }
//
//            else if (Integer.parseInt(inputs[0]) > foodAmount || Integer.parseInt(inputs[0]) < 0) {
//                System.out.println("You must enter a value between 0 and " + foodAmount);
//                continue;
//            }
//
//            foodEntered = Integer.parseInt(inputs[0]);
//
//            valid = true;
//        }

    }

    @Override
    public boolean doAction(String[] inputs) {

        int inputInt = Integer.parseInt(inputs[0]);
        
        InventoryControl inventoryControl = new InventoryControl();
        LocationControl locationControl = new LocationControl();

        int overcame = locationControl.overComeObstacle(inputInt, 5, true);

        PlayerModel player = PioneerTrail.getPlayer();
        
        ArrayList<GameModel> game = player.getGames();
            
        InventoryModel inventory = game.get(0).getInventory();
        
        inventory.setFoodAmount(100);
        
        if (overcame == 1) {
            inventoryControl.removeFoodForOverComeObstacle(inventory, inputInt, true);
            return true;

        }
        else {
            inventoryControl.removeFoodForOverComeObstacle(inventory, inputInt, false);
            return false;
        }
    }
}
