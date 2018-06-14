/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author Aimee
 */
public class HelpMenuView {

    public void displayHelpMenuView() {
        System.out.println("====================================================");

        boolean endOfView = false;

        do {

            String[] inputs = this.getInputs();

            if (inputs == null) {
                return;

            }
            else if ("Q".equals(inputs[0].toUpperCase())) {
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

            System.out.println("\n ******** HELP MENU ********"
                + "\n  G: The Goal of the Game"
//                 
                + "\n  M: How to Move"

                + "\n  H: How to Hunt"

                + "\n  E: Exit Help Menu");

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
            case "G":
                System.out.println("");
                displayGoalGame();
                break;

            case "M":
                System.out.println("");
                displayHowToMove();
                break;

            case "H":
                System.out.println("");
                displayHowToHunt();
                break;

            case "E":
                return true;
            default:
                System.out.println("Invalid Selection");
        }

        return false;
    }

    private void displayGoalGame() {
        System.out.println("*The goal of the game is for your wagon party to make it across the plains to Zion,"
            + "\n with 2 or more family members.");
    }

    private void displayHowToMove() {
        System.out.println("* Move your player by entering the coordinates on the map at each turn, \n for example, (0,1) would indicate ROW 1, COLUMN 2, which would move your player to square 2.");

    }

    private void displayHowToHunt() {
        System.out.println("* If you wish to hunt for food, enter \"A\" for shoot arrow,"
            + "\n\"G\" for shoot gun, or \"T\" for use a trap.");
    }

}