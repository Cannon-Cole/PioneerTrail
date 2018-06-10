/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import byui.cit260.pioneertrail.view.StartProgramView;
import byui.cit260.pioneertrail.model.GameModel;

/**
 *
 * @author Aimee, Cole, Derek
 */
public class PioneerTrail {

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        GameModel.setPlayer(player); //save the player

    }
}
