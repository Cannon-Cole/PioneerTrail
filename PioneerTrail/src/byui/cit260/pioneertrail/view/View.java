/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author aimeejorgensen
 */
public abstract class View implements ViewInterface {

    public View() {
    }

    private String[] getInputs() {

        Scanner reader = new Scanner(System.in);
        String[] inputs = new String[1];
        boolean valid = false;

        while (valid == false) {

            System.out.println("\n view Super Class");

            inputs[0] = reader.nextLine().trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must specify a value");
                continue;
            }

            valid = true;
        }

        return inputs;
    }
    
    @Override
    public void display() {

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

    private boolean doAction(String[] inputs) {
        System.out.println("Display something to the user");
        return false;

    }

}