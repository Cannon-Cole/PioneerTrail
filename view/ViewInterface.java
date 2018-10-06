/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;



/**
 *
 * @author Cole
 */
public interface ViewInterface {

public void display();
public String getInputs();
public String getInput(String promptMessage);
public boolean doAction(String[] inputs);
    
}
