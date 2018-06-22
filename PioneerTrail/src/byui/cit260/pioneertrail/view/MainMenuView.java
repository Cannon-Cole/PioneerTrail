/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import pioneertrail.PioneerTrail;
import byui.cit260.pioneertrail.control.ActorControl;
import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;

/**
 *
 * @author aimeejorgensen
 */
public class MainMenuView extends View{
    

    //functions return values, need to assign to something lest it cause errors
    
//    delete this view
//    public void displayMainMenuView() {
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
//            else if ("E".equals(inputs[0].toUpperCase())) {
//                return;
//            }
//
//            endOfView = doAction(inputs);
//
//        }
//        while (endOfView == false);
//
//    }
@Override
    public String[] getInputs() {

         String[] inputs = new String[1];
        
        String choice = this.getInput("\nMAIN MENU"                 
            + "\n  N: Start new game"                 
            + "\n  R: Restart game"                
            + "\n  H: Get help on how to play the game"             
            + "\n  C: Test Cole's overcomeObstacleView"             
            + "\n  W: Test Derek's repairWagonView"                
            + "\n  I: Test Derek's healIllnessView"                
            + "\n  E: Exit");
        inputs[0] = choice;
        
        this.doAction(inputs);
        
        return inputs;
    }

    public boolean doAction(String[] inputs) {

        switch (inputs[0].toUpperCase()) {
            case "N":
                startNewGame();
                break;
            case "R":
                restartGame();
                break;
            case "H":
                getHelp();
                break;
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
                break;
            case "E":
            case "Q":
                return true;
            default:
                System.out.println("Invalid input");
        }

        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(PioneerTrail.getPlayer());

        GameMainView gameMainView = new GameMainView();
        
        gameMainView.display();
    }

    private void restartGame() {
        //Start existing game? The method's called "restart" game
        //why not just call it "load"
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        /*startExistingGameView.displayStartExistingGameView();*/
    }

    private void getHelp() {
        HelpMenuView helpViewMenu = new HelpMenuView();
        helpViewMenu.display();
    }
}
