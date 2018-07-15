/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.ActorModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.enums.InventoryEnum;
import byui.cit260.pioneertrail.exceptions.GameControlException;
import byui.cit260.pioneertrail.model.MapModel;
import byui.cit260.pioneertrail.model.PlayerModel;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Aimee, Derek
 */
public class GameControl {

    public static int[] repairWagonCheck(GameModel game, ArrayList<InventoryModel> inventory) throws GameControlException {
        /*
        DL Todo: Method needs to be restructured, currently neither check or repair are used
        
        GameMainView
            repairWagonView
                repairWagonCheck[Control], read model, build string
            back to rwView
                repairWagonApply[Control], write to model, build string
            back to rwView again
        drop back to game menu
        */
        
        int wagonHealth = game.getWagonHealth();
        int wagonStrength = game.getWagonStrength();
        boolean hasHammer;
        int hammerDurability = inventory.get(InventoryEnum.Hammer.ordinal()).getQuantity();
        int spareWheels = inventory.get(InventoryEnum.SpareWheels.ordinal()).getQuantity();

        if (inventory.get(3).getQuantity() > 0) {
            hasHammer = true;
        }
        else {
            hasHammer = false;
        }

        int returnArray[] = new int[4];

        /* array indexes
        0 - 0/1 is wheel available
        1 - 0/1 is hammer available
        2 - 0-3 general status of hammer durability
        3 - errors, if found
        */
        //returnArray[3] = 0;

        if (wagonHealth < 0 || wagonHealth > 20) {
            //returnArray[3] = 1; //health invalid
            throw new GameControlException("Health amount is invalid (repairWagonCheck)");
        }
        if (wagonStrength < 0 || wagonStrength > 20) {
            //returnArray[3] = 2; //strength invalid
            throw new GameControlException("Wagon strength amount is invalid (repairWagonCheck)");
        }
        if ((hasHammer == true) && (hammerDurability < 1 || hammerDurability > 20)) {
            //returnArray[3] = 3; //hammer invalid
            throw new GameControlException("Hammer durability is invalid (repairWagonCheck)");
        }
        /*
        if (returnArray[3] != 0) {
            return returnArray;
        }
        */

        //end of error checking
        
        if (spareWheels > 0) {
            returnArray[0] = 1;
        }

        if (hasHammer == true) {
            returnArray[1] = 1;
        }

        if (hammerDurability > 15) {
            returnArray[2] = 3;
        }
        else if (hammerDurability > 10) {
            returnArray[2] = 2;
        }
        else if (hammerDurability > 5) {
            returnArray[2] = 1;
        }
        else {
            returnArray[2] = 0;
        }

        return returnArray;
    }

    public static int repairWagonApply(GameModel game, ArrayList<InventoryModel> inventory, int action) throws GameControlException {

        int wagonHealth = game.getWagonHealth();
        int wagonStrength = game.getWagonStrength();
        boolean hasHammer;
        int hammerDurability = inventory.get(InventoryEnum.Hammer.ordinal()).getDurability();
        int hammerQuantity = inventory.get(InventoryEnum.Hammer.ordinal()).getQuantity();
        int spareWheels = inventory.get(InventoryEnum.SpareWheels.ordinal()).getQuantity();
        
        if (hammerQuantity > 0) {
            hasHammer = true;
        }
        else {
            hasHammer = false;
        }

        int returnVal = 0;

        if (wagonHealth < 0 || wagonHealth > 20) {
            //return -1; //health invalid
            throw new GameControlException("Health amount is invalid (repairWagonApply)");
        }
        if (wagonStrength < 0 || wagonStrength > 20) {
            //return -2; //strength invalid
            throw new GameControlException("Wagon strength amount is invalid (repairWagonApply)");
        }
        if ((hasHammer == true) && (hammerDurability < 1 || hammerDurability > 20)) {
            //return -3; //hammer invalid
            throw new GameControlException("Hammer durability amount is invalid (repairWagonApply)");
        }
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
        }
        else if (action == 2) {
            wagonHealth = wagonHealth + 5;
            wagonStrength = (hammerDurability / 4) + (wagonHealth / 4) + wagonStrength;
            //bonus if hammer is newer, bonus if wagon is healthy
            //sum of bonuses tops off at ten (bonus from a fresh wheel)
            
            hammerDurability--;
            if (hammerDurability > 0) {
                returnVal = 2; //hammer used
            }
            else {
                hammerQuantity--;
                
                if (hammerQuantity > 0)
                    hammerDurability = 20;
                    //has spare hammer
                
                returnVal = 3; //hammer broken
            }
        }
        else if (action == 4) {
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
        inventory.get(InventoryEnum.Hammer.ordinal()).setQuantity(hammerQuantity);
        inventory.get(InventoryEnum.Hammer.ordinal()).setDurability(hammerDurability);
        inventory.get(InventoryEnum.SpareWheels.ordinal()).setQuantity(spareWheels);

        //if returnVal is still zero here, something was missed
        return returnVal;
    }

    public PlayerModel savePlayer(String name) throws GameControlException {

        if (name == null || name.length() < 1) {
            throw new GameControlException("Player does not exist (savePlayer)");
        }
        else {
            PlayerModel player = new PlayerModel();

            player.setName(name);

            //Cole changed to this from return new playermodel
            return player;
        }

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

    public static void utilizeAxe() {
        System.out.println("*** utilizeAxe() called ***");
    }

    public static void utilizeHammer() {
        //repurpose repairwagonapply
        System.out.println("*** utilizeHammer() called ***");
    }

    public static int createNewGame(PlayerModel player) throws GameControlException {
        
        if (player == null) {
            //return -1;
            throw new GameControlException("Player does not exist (createNewGame)");
        }
        
        GameModel game = new GameModel();

        //sets player in main
        game.setPlayer(player);

        //sets game in main
        PioneerTrail.setCurrentGame(game);

        ActorModel[] family = ActorControl.createActors();
        game.setFamily(family);
        
        //gets arraylist
        ArrayList<InventoryModel> inventory = InventoryControl.createInventory();
        //saves list to game
        game.setInventory(inventory);

        //creates map that looks like this
        //*************
        //*************
        MapModel map = MapControl.createMap(2, 13, inventory);

        //checks if map exists
        if (map == null) {
            throw new GameControlException("Map does not exist (createNewGame)");
        }
        //sets map to game
        game.setMap(map);

        //function succesful
        return 1;
    }
  
}
