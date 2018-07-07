/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.ActorControl;
import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.control.InventoryControl;
import byui.cit260.pioneertrail.control.LocationControl;
import byui.cit260.pioneertrail.control.MapControl;
import byui.cit260.pioneertrail.model.ActorModel;

import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import exceptions.ActorControlException;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class GameMainView extends View {

    public GameMainView() {
        super("\nGame Menu"
            + "\n  V: View map"
            + "\n  I: View list inventory"
            + "\n  P: Purchase new supplies"
            + "\n  L: Explore a location"
            + "\n  M: Move to new location"
            + "\n  R: Estimate the resources needed"
            + "\n  B: Repair Wagon"
            + "\n  T: Utilize tools"
            + "\n  D: Deal with illness"
            + "\n  H: Hunt for Resources"
            + "\n  F: Family Status"
            + "\n  S: Save game"
            + "\n  ?: Help"
            + "\n  Q: Quit");
    }

    @Override
    public boolean doAction(String[] inputs) {

        MapControl mapControl = new MapControl();
        InventoryControl inventoryControl = new InventoryControl();
        GameControl gameControl = new GameControl();
        LocationControl locationControl = new LocationControl();
        ActorControl actorControl = new ActorControl();

        InventoryModel inventoryModel = new InventoryModel();
        GameModel gameModel = new GameModel();

        HelpMenuView helpMenuView = new HelpMenuView();
        RepairWagonView repairWagonView = new RepairWagonView();
        IllnessHealView illnessHealView = new IllnessHealView();
        InventoryView inventoryView = new InventoryView();
        UtilizeToolsView utilizeToolsView = new UtilizeToolsView();

        switch (inputs[0].toUpperCase()) {
            case "V":
                mapControl.displayMap();
                break;
            case "I":
                inventoryView.display();
                break;
            case "P":
                gameControl.purchaseSupplies();
                break;
            case "L":
                locationControl.exploreLocation();
                break;
            case "M":
                actorControl.moveActor();
                break;
            case "R":
                inventoryControl.estimateResources();
                break;
            case "B":
                //repurpose to repairWagonCheck
                //throwawayInt = repairWagonView.displayRepairWagonView(gameControl, gameModel, inventoryModel);
                break;
            case "T":
                utilizeToolsView.display();
                break;
            case "D":
                double healTempFoodAmount = 150;
                double healTempMortalityRate = 90;
                double healTempMedicineAmount = 1;
                break;
            case "H":
                locationControl.huntForResources();
                break;
            case "F":
                ActorModel[] family = PioneerTrail.getCurrentGame().getFamily();
                try {
                    ActorControl.familyStatusWrapper(family);
                } catch (ActorControlException ie) {
                    System.out.println(ie.getMessage());
                    return false;
                }
                return true;
            case "S":
                gameControl.saveGame();
                break;
            case "?":
                helpMenuView.display();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid input");
        }

        return false;
    }

}
