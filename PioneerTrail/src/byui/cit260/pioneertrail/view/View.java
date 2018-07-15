/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = PioneerTrail.getInFile();
    protected final PrintWriter console = PioneerTrail.getOutFile();

    public View() {
    }

    public View(String message) {
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
    public String getInput(String promptMessage) {
        String selection = "";
        boolean valid = false;

        while (valid == false) {

            this.console.println(promptMessage);

            try {
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),"Could not read line.");
            }

            selection = selection.trim();

            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(),"You must specify a value");
                continue;
            }

            valid = true;
        }

        return selection;
    }

}
