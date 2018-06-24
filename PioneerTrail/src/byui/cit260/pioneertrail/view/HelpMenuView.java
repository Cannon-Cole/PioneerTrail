/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

/**
 *
 * @author Aimee
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("What do you need help with?"
            + "\n  G: Goal of the game"
            + "\n  M: How to move"
            + "\n  H: How to hunt"
            + "\n  E: Exit");
    }

    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        String choice = this.getInput("What do you need help with?"
            + "\n  G: Goal of the game"
            + "\n  M: How to move"
            + "\n  H: How to hunt"
            + "\n  E: Exit");

        inputs[0] = choice;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

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