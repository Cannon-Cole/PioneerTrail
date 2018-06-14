/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.PlayerModel;

/**
 *
 * @author aimeejorgensen
 */
public class GameControl {

    public static int repairWagon(GameModel game, InventoryModel inventory) {

        int wagonHealth = game.getWagonHealth();
        int wagonStrength = game.getWagonStrength();
        boolean hasHammer = inventory.getHasHammer();
        int hammerDurability = inventory.getHammerDurability();
        int spareWheels = inventory.getSpareWheels();
        
        if (wagonHealth < 0 || wagonHealth > 20) {
            return -1; //health invalid
        }

        if (wagonStrength < 0 || wagonStrength > 20) {
            return -2; //strength invalid
        }

        if ((hasHammer == true) && (hammerDurability < 1 || hammerDurability > 20)) {
                return -3; //hammer invalid
        }

        //end of error checking
        
        int returnVal = 0;

        //todo: ask player which procedure to use. replace a wheel, or use the hammer?
        
        if (hasHammer == false) {
            if (spareWheels > 0) {
                wagonHealth = wagonHealth + 5;
                wagonStrength = wagonStrength + 10;
                spareWheels--;
                returnVal = 1; //use spare wheel
            } else {
                wagonHealth = wagonHealth + 5;
                wagonStrength = wagonStrength - 5;
                returnVal = 4; //use random stone
            }
        }
        
        if (hasHammer == true) {
            wagonHealth = wagonHealth + 5;
            wagonStrength = (hammerDurability / 4) + (wagonHealth / 4) + wagonStrength;
            //bonus if hammer is newer, bonus if wagon is healthy
            //sum of bonuses tops off at ten (bonus from a fresh wheel)
            hammerDurability--;
            if (hammerDurability > 0) {
                returnVal = 2; //hammer used
            } else {
                hasHammer = false;
                returnVal = 3; //hammer broken
            }
        }

        if (wagonHealth > 20) {
            wagonHealth = 20;
        }
        
        if (wagonHealth < 0) {
            wagonHealth = 0;
        }
        
        if (wagonStrength > 20) {
            wagonStrength = 20;
        }
        
        if (wagonStrength < 0) {
            wagonStrength = 0;
        }
        
        game.setWagonHealth(wagonHealth);
        game.setWagonStrength(wagonStrength);
        inventory.setHasHammer(hasHammer);
        inventory.setHammerDurability(hammerDurability);
        
        //if returnVal is still zero here, something was missed
        return returnVal;
    }
    
    public PlayerModel savePlayer(String name) {
        System.out.println("***savePlayer() called ***");

        if (name == null || name.length() < 1) {
            return null;
        } else { 
             PlayerModel player = new PlayerModel();

             player.setName(name);

             return new PlayerModel();
        }
    
    }
    
    public static void createNewGame(PlayerModel player) {
        System.out.println("*** GameControl - createNewGame() called ***");
    }
    
    public void saveGame() {
        System.out.println("*** saveGame() called ***");
    }
    
    public void purchaseSupplies() {
        System.out.println("*** purchaseSupplies() called ***");
    }
    
    public void repairWagonTemp() {
        System.out.println("*** repairWagonTemp() called ***");
    }
    
    public void utilizeTools() {
        System.out.println("*** utilizeTools() called ***");
    }
    
    public void dealWithIllness() {
        System.out.println("*** dealWithIllness() called ***");
    }
    
}