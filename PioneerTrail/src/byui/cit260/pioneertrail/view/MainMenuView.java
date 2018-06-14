/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import pioneertrail.PioneerTrail;
import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.view.RepairWagonView;

import java.util.Scanner;

/**
 *
 * @author aimeejorgensen
 */
public class MainMenuView {

    public void displayMainMenuView() {

        boolean endOfView = false;

        do {

            String[] inputs = this.getInputs();

            if (inputs == null) {
                return;
            }
            else if ("E".equals(inputs[0].toUpperCase())) {
                return;
            }

            endOfView = doAction(inputs);

        }
        while (endOfView == false);

    }

    private String[] getInputs() {

        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;

        while (valid == false) {

            System.out.println("\nMAIN MENU"
                + "\n  N: Start new game"
                + "\n  R: Restart game"
                + "\n  H: Get help on how to play the game"
                + "\n  C: Test Cole's overcomeObstacleView"
                + "\n  D: Test Derek's repairWagonView"
                + "\n  E: Exit");

            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must specify a value");
                continue;
            }

            valid = true;
        }

        return inputs;
    }

    private boolean doAction(String[] inputs) {

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
                overComeObstacleView overCome = new overComeObstacleView();
                overCome.display(inventory);
                return true;
            case "D":
                //can't get proper tests to work, test cases can't accept input it seems
                GameControl gameControlDTest = new GameControl();
                GameModel gameDTest = new GameModel();
                InventoryModel inventoryDTest = new InventoryModel();
                RepairWagonView repairWagonViewDTest = new RepairWagonView();
                gameDTest.setWagonHealth(10);
                gameDTest.setWagonStrength(10);
                inventoryDTest.setHasHammer(false);
                inventoryDTest.setHammerDurability(0);
                inventoryDTest.setSpareWheels(0);
                repairWagonViewDTest.repairWagonView(gameControlDTest, gameDTest, inventoryDTest);
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
        
        gameMainView.displayMainMenuView();
    }

    private void restartGame() {
        //Start existing game? The method's called "restart" game
        //why not just call it "load"
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        /*startExistingGameView.displayStartExistingGameView();*/
    }

    private void getHelp() {
        GettingHelpView helpViewMenu = new GettingHelpView();
        helpViewMenu.displayHelpMenu();
    }
}
