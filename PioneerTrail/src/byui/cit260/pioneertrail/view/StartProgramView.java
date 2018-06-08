/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

/**
 *
 * @author aimeejorgensen
 */
public class StartProgramView {

    public StartProgramView() {
//constructor
    }

    //translate statement below into java
//    displayStartProgramView() {
//        endOfView = false
//        DO inputs = getInputs()  //calls the getImput method
//        IF no inputs were entered OR the first input is Q RETURN
//        ENDIF endOfView = doAction(inputs)
//        WHILE endOfView 
//    != true
//  
    public void displayStartProgramView() {

        boolean endOfView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs == null) {
                return;
            }

            else if ("Q".equals(inputs[0])) {
                return;
            }

            endOfView = doAction(inputs);

        }
        while (endOfView = false);
    }

    private String[] getInputs() {
        System.out.println("*** getInputs() caled ***");
        String[] inputs = new String[1];
        inputs[0] = "testInput";

        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println("*** doAction() caled ***");
        System.out.println("inputs = " + inputs[0]);
        return true;
    }

}
