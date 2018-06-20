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
public class View {
  
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

    private boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

