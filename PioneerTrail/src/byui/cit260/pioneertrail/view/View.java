/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message){
    this.displayMessage = message;
}

    @Override
    public String getInputs() {

        return getInput(this.displayMessage);
    }
    
    @Override
    public void display() {

        boolean endOfView = false;

        do {

            String[] inputs = new String[1];
            
            inputs[0] = this.getInputs();

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
    
    @Override
    public String getInput(String promptMessage)
    {
        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        
        boolean valid = false;

        while (valid == false) {

            System.out.println(promptMessage);

            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must specify a value");
                continue;
            }

            valid = true;
        }

        return inputs[0];
    }

}