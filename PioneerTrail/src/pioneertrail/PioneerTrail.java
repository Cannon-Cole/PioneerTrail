/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import byui.cit260.pioneertrail.view.StartProgramView;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.PlayerModel;

/**
 *
 * @author Aimee, Cole, Derek
 */
public class PioneerTrail {

    private static GameModel currentGame = null;
    private static PlayerModel player = null;
    
    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
         
        PioneerTrail.setPlayer(player); //save the player
        
    }
    
    public static GameModel getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(GameModel currentGame) {
        PioneerTrail.currentGame = currentGame;
    }
    
    public static PlayerModel getPlayer() {
        return player;
    }
    
    public static void setPlayer(PlayerModel player) {
        PioneerTrail.player = player;
    }
}
