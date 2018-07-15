/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.InventoryControl;
import byui.cit260.pioneertrail.control.LocationControl;
import byui.cit260.pioneertrail.exceptions.LocationControlException;
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

        int overcame;
        try {
            overcame = locationControl.overComeObstacle(inputInt, 5, true);
        } catch (LocationControlException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
            return false;
        }

        PlayerModel player = PioneerTrail.getPlayer();

        ArrayList<GameModel> game = player.getGames();

        ArrayList<InventoryModel> inventory = game.get(0).getInventory();

        inventory.get(0).setQuantity(5);

        if (overcame == 1) {
            inventoryControl.removeFoodForOvercomeObstacle(inventory, inputInt, true);
            return true;

        }
        else {
            inventoryControl.removeFoodForOvercomeObstacle(inventory, inputInt, false);
            return false;
        }
    }
}