/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import pioneertrail.PioneerTrail;
import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.control.InventoryControl;
import byui.cit260.pioneertrail.exceptions.GameControlException;
import byui.cit260.pioneertrail.model.InventoryModel;
import java.util.ArrayList;

/**
 *
 * @author aimeejorgensen
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\nMAIN MENU"
            + "\n  N: Start new game"
            + "\n  L: Load existing game"
            + "\n  H: Get help on how to play the game"
            + "\n  E: Exit");
    }

    @Override
    public boolean doAction(String[] inputs) {

        switch (inputs[0].toUpperCase()) {
            case "N":
                startNewGame();
                break;
            case "L":
                loadGame();
                break;
            case "H":
                getHelp();
                break;/*
            case "C":
                InventoryModel inventory = new InventoryModel();
                //View only speaks to model for the test. It will be removed in actual version
                inventory.setFoodAmount(500);
                OvercomeObstacleView overCome = new OvercomeObstacleView();
                //overCome.display(inventory);
                return true;
            case "W":
                //can't get proper tests to work, test cases can't accept input it seems
                GameControl gameControlDTest = new GameControl();
                GameModel gameDTest = new GameModel();
                InventoryModel inventoryDTest = new InventoryModel();
                RepairWagonView repairWagonViewDTest = new RepairWagonView();
                gameDTest.setWagonHealth(10);
                gameDTest.setWagonStrength(10);
                inventoryDTest.setHasHammer(false);
                inventoryDTest.setHammerDurability(0);
                inventoryDTest.setSpareWheels(1);
                //int throwawayInt = repairWagonViewDTest.displayRepairWagonView(gameControlDTest, gameDTest, inventoryDTest);
                break;
            case "I":
                //temp values
                //restructure old code to take object instead of values?
                ActorControl actorControlDTest = new ActorControl();
                IllnessHealView illnessHealViewDTest = new IllnessHealView();
                double healTempFoodAmount = 100;
                double healTempMortalityRate = 85;
                double healTempMedicineAmount = 1;
                //double throwawayDouble = illnessHealViewDTest.displayIllnessHealView(actorControlDTest, healTempFoodAmount, healTempMortalityRate, healTempMedicineAmount);
                break;*/
            case "E":
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid input");
        }

        return false;
    }

    private void startNewGame() {
        int holder;
        try {
            holder = GameControl.createNewGame(PioneerTrail.getPlayer());
        } catch (GameControlException gce) {
            ErrorView.display(this.getClass().getName(),gce.getMessage());
            return;
        }
        
        if (holder == -1){
            ErrorView.display(this.getClass().getName(),"***createNewGame Failed***");
        }

        GameMainView gameMainView = new GameMainView();

        ArrayList<InventoryModel> mainInventory = PioneerTrail.getCurrentGame().getInventory();

        InventoryControl.fillInventoryTEMP(mainInventory);
        
        gameMainView.display();
    }

    private void loadGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    }

    private void getHelp() {
        HelpMenuView helpViewMenu = new HelpMenuView();
        helpViewMenu.display();
    }
}