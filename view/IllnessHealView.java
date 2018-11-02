/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

/**
 *
 * @author Derek
 */
public class IllnessHealView extends View {

    public IllnessHealView() {
        super("\nYou need to make a decision.");
    }

    @Override
    public boolean doAction(String[] inputs) {

        int chosenAction;

        String theInput = inputs[0].toUpperCase();
        switch (theInput) {
            case "Y":
                chosenAction = 1;
                return true;
            case "N":
                chosenAction = 2;
                return true;
            case "E":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid input");
                break;
        }

        return false;
    }

}