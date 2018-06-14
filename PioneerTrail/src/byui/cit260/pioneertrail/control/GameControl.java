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

    public static int[] repairWagonCheck(GameModel game, InventoryModel inventory) {

        int wagonHealth = game.getWagonHealth();
        int wagonStrength = game.getWagonStrength();
        boolean hasHammer = inventory.getHasHammer();
        int hammerDurability = inventory.getHammerDurability();
        int spareWheels = inventory.getSpareWheels();

        int returnArray[] = new int[4];
        
        /* array indexes
        0 - 0/1 is wheel available
        1 - 0/1 is hammer available
        2 - 0-3 general status of hammer durability
        3 - errors, if found
        */
        
        returnArray[3] = 0;
        
        if (wagonHealth < 0 || wagonHealth > 20) {
            returnArray[3] = 1; //health invalid
        }

        if (wagonStrength < 0 || wagonStrength > 20) {
            returnArray[3] = 2; //strength invalid
        }

        if ((hasHammer == true) && (hammerDurability < 1 || hammerDurability > 20)) {
            returnArray[3] = 3; //hammer invalid
        }
        
        if (returnArray[3] != 0) {
            return returnArray;
        }

        //end of error checking

        if (spareWheels > 0)
            returnArray[0] = 1;
        
        if (hasHammer == true)
            returnArray[1] = 1;

        if (hammerDurability > 15) {
            returnArray[2] = 3;
        } else if (hammerDurability > 10) {
            returnArray[2] = 2;
        } else if (hammerDurability > 5) {
            returnArray[2] = 1;
        } else {
            returnArray[2] = 0;
        }

        return returnArray;
    }
    
    public static int repairWagonApply(GameModel game, InventoryModel inventory, int action) {

        int wagonHealth = game.getWagonHealth();
        int wagonStrength = game.getWagonStrength();
        boolean hasHammer = inventory.getHasHammer();
        int hammerDurability = inventory.getHammerDurability();
        int spareWheels = inventory.getSpareWheels();

        int returnVal = 0;

        /* action options
        0 - do nothing
        1 - use spare wheel
        2 - use hammer
        3 - skipped to match output
        4 - use random stone
        */

        if (action == 1) {
            wagonHealth = wagonHealth + 5;
            wagonStrength = wagonStrength + 10;
            spareWheels--;
            returnVal = 1; //use spare wheel
        } else if (action == 2) {
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
        } else if (action == 4) {
            wagonHealth = wagonHealth + 5;
            wagonStrength = wagonStrength - 5;
            returnVal = 4; //use random stone
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
        inventory.setSpareWheels(spareWheels);

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