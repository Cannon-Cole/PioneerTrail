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

import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;


/**
 *
 * @author Derek
 */
public class GameMainView extends View {
    private String style;

    int throwawayInt = 0;
    double throwawayDouble = 0;
    //functions return values, need to assign to something lest it cause errors
    
//    delete this view
    GameMainView() {
        super();
        
    }
//
//        boolean endOfView = false;
//
//        do {
//
//            String[] inputs = this.getInputs();
//
//            if (inputs == null) {
//                return;
//            }
//            else if ("Q".equals(inputs[0].toUpperCase())) {
//                return;
//            }
//
//            endOfView = doAction(inputs);
//
//        }
//        while (endOfView == false);
//
//    }

//    private String[] getInputs (String 1, ) {

//        Scanner reader = new Scanner(System.in);
//        String[] inputs = new String[1];
//        boolean valid = false;
//
//        while (valid == false) {
//
//            System.out.println("\nGame Menu"
//                + "\n  V: View map"
//                + "\n  I: View list inventory"
//                + "\n  P: Purchase new supplies"
//                + "\n  L: Explore a location"
//                + "\n  M: Move to new location"
//                + "\n  E: Estimate the resources needed"
//                + "\n  B: Repair Wagon"
//                + "\n  C: Utilize tools"
//                + "\n  D: Deal with illness"
//                + "\n  H: Hunt for Resources"
//                + "\n  S: Save game"
//                + "\n  ?: Help"
//                + "\n  Q: Quit");
//
//            inputs[0] = reader.nextLine().trim();
//
//            if (inputs[0].length() < 1) {
//                System.out.println("You must specify a value");
//                continue;
//            }
//
////            valid = true;
//        }
//
//        return inputs;
//    }

//    private boolean doAction(String[] inputs) {
//
//        MapControl mapControl = new MapControl();
//        InventoryControl inventoryControl = new InventoryControl();
//        GameControl gameControl = new GameControl();
//        LocationControl locationControl = new LocationControl();
//        ActorControl actorControl = new ActorControl();
//        
//        InventoryModel inventoryModel = new InventoryModel();
//        GameModel gameModel = new GameModel();
//        
//        HelpMenuView helpMenuView = new HelpMenuView();
//        RepairWagonView repairWagonView = new RepairWagonView();
//        IllnessHealView illnessHealView = new IllnessHealView();
//        
//        switch (inputs[0].toUpperCase()) {
//            case "V":
//                mapControl.displayMap();
//                break;
//            case "I":
//                inventoryControl.displayInventory();
//                break;
//            case "P":
//                gameControl.purchaseSupplies();
//                break;
//            case "L":
//                locationControl.exploreLocation();
//                break;
//            case "M":
//                actorControl.moveActor();
//                break;
//            case "E":
//                inventoryControl.estimateResources();
//                break;
//            case "B":
//                throwawayInt = repairWagonView.displayRepairWagonView(gameControl, gameModel, inventoryModel);
//                break;
//            case "C":
//                gameControl.utilizeTools();
//                break;
//            case "D":
//                //temp values
//                //restructure old code to take object instead of values?
//                double healTempFoodAmount = 150;
//                double healTempMortalityRate = 90;
//                double healTempMedicineAmount = 1;
//                throwawayDouble = illnessHealView.displayIllnessHealView(actorControl, healTempFoodAmount, healTempMortalityRate, healTempMedicineAmount);
//                break;
//            case "H":
//                locationControl.huntForResources();
//                break;
//            case "S":
//                gameControl.saveGame();
//                break;
//            case "?":
//                helpMenuView.displayHelpMenuView();
//                break;
//            case "Q":
//                return true;
//            default:
//                System.out.println("Invalid input");
//        }
//
//        return false;
//    }

}
