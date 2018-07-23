/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import pioneertrail.PioneerTrail;

/**
 *
 * @author Derek
 */
public class GameOverView extends View {
    
    public GameOverView (String message) {
        super(message);
    }

    @Override
    public boolean doAction(String[] inputs) {
        return true;
    }
    
}
