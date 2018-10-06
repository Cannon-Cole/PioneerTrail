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
    public boolean doAction(String[] inputs) {

        switch (inputs[0].toUpperCase()) {
            case "G":
                this.console.println("");
                displayGoalGame();
                break;

            case "M":
                this.console.println("");
                displayHowToMove();
                break;

            case "H":
                this.console.println("");
                displayHowToHunt();
                break;

            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid Selection");
        }

        return false;
    }

    private void displayGoalGame() {
        this.console.println("*The goal of the game is for your wagon party to make it across the plains to Zion,"
            + "\n with 2 or more family members.");
    }

    private void displayHowToMove() {
        this.console.println("* Move your player by entering the coordinates on the map at each turn, \n for example, (0,1) would indicate ROW 1, COLUMN 2, which would move your player to square 2.");

    }

    private void displayHowToHunt() {
        this.console.println("* If you wish to hunt for food, you must purchase weapons at the start of the game.");
    }

}