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
import byui.cit260.pioneertrail.exceptions.ActorControlException;
import byui.cit260.pioneertrail.exceptions.MapControlException;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class GameMainView extends View {

    public GameMainView() {
        super("\nGame Menu"
            + "\n  M: View map"
            + "\n  I: View list inventory"
            + "\n  O: View list inventory"
            + "\n  P: Purchase new supplies"
            + "\n  L: Explore a Location"
            + "\n  A: Family Report"    
            + "\n  N: Move to New location"
            + "\n  R: Estimate the Resources needed"
            + "\n  B: Repair Wagon"
            + "\n  T: Utilize Tools"
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
        UtilizeToolsView utilizeToolsView = new UtilizeToolsView();
        GameModel currentGame = PioneerTrail.getCurrentGame();

        switch (inputs[0].toUpperCase()) {
            case "M":
                mapControl.displayMap();
                break;
            case "I":
                InventoryView inventoryView = new InventoryView();
                inventoryView.display();
                break;
            case "O":
                InventoryView inventoryView2 = new InventoryView(1);
                inventoryView2.display();
                break;
            case "P":
                gameControl.purchaseSupplies();
                break;
            case "L":
                locationControl.exploreLocation();
                break;
            case "A":
                FamilyStatusView familyReportView = new FamilyStatusView();
                familyReportView.display();
            case "N":
                try {
                    mapControl.moveActorWrapper(currentGame.getMap().getCurrentRow(), currentGame.getMap().getCurrentColumn());
                } catch (MapControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
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
                ActorModel[] family = currentGame.getFamily();
                try {
                    ActorControl.familyStatusWrapper(family);
                } catch (ActorControlException ie) {
                    ErrorView.display(this.getClass().getName(),ie.getMessage());
                    return false;
                }   
                case "S":
                gameControl.saveGame();
                break;
            case "?":
                helpMenuView.display();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid input");
        }

        return false;
    }

}
