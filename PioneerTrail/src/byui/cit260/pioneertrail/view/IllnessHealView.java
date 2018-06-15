/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.ActorControl;

import java.util.Scanner;

/**
 *
 * @author Derek
 */
public class IllnessHealView {
    
private int chosenAction;
    
    public double displayIllnessHealView(ActorControl actorControl, double foodAmount, double mortalityRate, double medicineAmount) {
        
        double returnVal = 0;
        int statusCheck[] = new int[4];
        
        statusCheck = actorControl.illnessHealCheck(foodAmount, mortalityRate, medicineAmount);
        //System.out.println(statusCheck[0] + " " + statusCheck[1] + " " + statusCheck[2]);
        
        /* array indexes:
        0 - 0-3 how much foodAmount (higher is better)
        1 - 0-3 how high mortalityRate (lower is better)
        2 - 0/1 is medicine available
        3 - errors if found
        */
        
        if (statusCheck[3] != 0)
            return -1;
            //todo: error handling
        
        System.out.println("Healing illness:");
        String statusDisplay = new String();
        
        switch (statusCheck[0]) {
        case 3:
            statusDisplay = statusDisplay + "\nYou have plenty of food to spare, so no need to worry about that. (food: 3)";
            break;
        case 2:
            statusDisplay = statusDisplay + "\nYou have enough food at the ready, nutrition probably shouldn't be a problem. (food: 2)";
            break;
        case 1:
            statusDisplay = statusDisplay + "\nYou're running a little low on food. (food: 1)";
            break;
        case 0:
            statusDisplay = statusDisplay + "\nYou hardly have enough food for normal travelling, let alone helping someone heal. This might be a problem. (food: 0)";
            break;
        default:
            break;
        }
        
        //possibly "re-balance" strings based on what the illnesses actually are
        switch (statusCheck[1]) {
        case 2:
            statusDisplay = statusDisplay + "\nThis illness is a big one. You put on a brave face, but inside you're not holding much hope. (mortality: 2)";
            break;
        case 1:
            statusDisplay = statusDisplay + "\nAs far as illnesses go, you've seen worse. It's still a little concerning, though. (mortality: 1)";
            break;
        case 0:
            statusDisplay = statusDisplay + "\nIt doesn't look like this illness is anything to worry too much about. (mortality: 0)";
            break;
        default:
            break;
        }

        if (statusCheck[2] == 1) {
            statusDisplay = statusDisplay + "\nYou have some medicine you can use.";
        }
        
        statusDisplay = statusDisplay + "\n\nContinue? [Y/N]";
        
        chosenAction = 0;
        
        boolean endOfView = false;
        double feedback = 0;
        
        do {

            String[] inputs = this.getInputs(statusDisplay);
            
            if (inputs == null) {
                return -1;
            } else if ("E".equals(inputs[0].toUpperCase())) {
                return -1;
            }
            
            endOfView = doAction(inputs);
            
            if (chosenAction == 2)
                return -1;
            
            feedback = actorControl.illnessHealApply(foodAmount, mortalityRate, medicineAmount);
            returnVal = feedback;
            
            System.out.println("Function output: " + feedback);
            //still needs interpretation
            
        } while (endOfView == false);
        
        return returnVal;
    }
    
    private String[] getInputs(String promptString) {

        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;
        
        while (valid == false) {

            System.out.println(promptString);

            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You need to make a decision");
                continue;
            }

            valid = true;
        }

        return inputs;
    }

    private boolean doAction(String[] inputs) {
        
        String theInput = inputs[0].toUpperCase();
        if (theInput.contentEquals("Y")) {
            chosenAction = 1;
            return true;
        } else if (theInput.contentEquals("N")) {
            chosenAction = 2;
            return true;
        }  else if (theInput.contentEquals("E")) {
            return true;
        } else {
            System.out.println("Invalid input");
        }

        return false;
    }
    
}

