/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.model.InventoryEnum;
import java.util.ArrayList;
import java.util.Set;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Derek
 */
public class GameControlTest {
    
    public GameControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
//    @Test
//    public void testRepairWagon() {
//        
//        GameControl gameControl = new GameControl();
//        GameModel game = new GameModel();
//        ArrayList<InventoryModel> inventory = InventoryControl.createInventory();
//        
//        game.setWagonHealth(15);
//        game.setWagonStrength(10);
//        inventory.setHasHammer(true);
//        inventory.setHammerDurability(12);
//        inventory.setSpareWheels(0);
//        
//        //NOTE FROM COLE to fix the errors do it something like this
//        //Something will have to be done about hasHammer in repairwagon if that is still a thing
//        if(inventory.get(InventoryEnum.HammerDurability.ordinal()).getQuantity() > 0){
//            //add something here maybe
//        }
//        
//        inventory.get(InventoryEnum.HammerDurability.ordinal()).setQuantity(12);
//        inventory.get(InventoryEnum.SpareWheels.ordinal()).setQuantity(0);
//        
//        int action = 2;
//        int expResult = 2;
//        int result = gameControl.repairWagonApply(game, inventory, action);
//        System.out.println("repairWagon - valid (1): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        game.setWagonHealth(22);
//        game.setWagonStrength(10);
//        inventory.setHasHammer(true);
//        inventory.setHammerDurability(10);
//        inventory.setSpareWheels(0);
//        action = 2;
//        expResult = -1;
//        result = gameControl.repairWagonApply(game, inventory, action);
//        System.out.println("repairWagon - invalid (2): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//    
//        game.setWagonHealth(15);
//        game.setWagonStrength(50);
//        inventory.setHasHammer(true);
//        inventory.setHammerDurability(10);
//        inventory.setSpareWheels(0);
//        action = 2;
//        expResult = -2;
//        result = gameControl.repairWagonApply(game, inventory, action);
//        System.out.println("repairWagon - invalid (3): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        game.setWagonHealth(15);
//        game.setWagonStrength(12);
//        inventory.setHasHammer(true);
//        inventory.setHammerDurability(0);
//        inventory.setSpareWheels(0);
//        action = 2;
//        expResult = -3;
//        result = gameControl.repairWagonApply(game, inventory, action);
//        System.out.println("repairWagon - invalid (4): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        game.setWagonHealth(5);
//        game.setWagonStrength(0);
//        inventory.setHasHammer(false);
//        inventory.setHammerDurability(0);
//        inventory.setSpareWheels(1);
//        action = 1;
//        expResult = 1;
//        result = gameControl.repairWagonApply(game, inventory, action);
//        System.out.println("repairWagon - boundary (5): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        game.setWagonHealth(10);
//        game.setWagonStrength(19);
//        inventory.setHasHammer(true);
//        inventory.setHammerDurability(1);
//        inventory.setSpareWheels(0);
//        action = 2;
//        expResult = 3;
//        result = gameControl.repairWagonApply(game, inventory, action);
//        System.out.println("repairWagon - boundary (6): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//        
//        game.setWagonHealth(0);
//        game.setWagonStrength(10);
//        inventory.setHasHammer(false);
//        inventory.setHammerDurability(0);
//        inventory.setSpareWheels(0);
//        action = 4;
//        expResult = 4;
//        result = gameControl.repairWagonApply(game, inventory, action);
//        System.out.println("repairWagon - boundary (7): " + result + ", " + expResult);
//        assertEquals(expResult, result, 0);
//    }
    
}
