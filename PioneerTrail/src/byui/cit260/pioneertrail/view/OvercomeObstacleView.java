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
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class OvercomeObstacleView extends View {

    public OvercomeObstacleView() {

        super("\nIt takes more food to overcome rough terrain. You have \" + foodAmount + \" food. How much will you ration for this obstacle?");

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