/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.enums.InventoryWeightPerItem;
import java.util.ArrayList;
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
    
    @Test
    public void testRepairWagon() throws Exception {
        
        GameControl gameControl = new GameControl();
        GameModel game = new GameModel();
        ArrayList<InventoryModel> inventory = InventoryControl.createInventory();
        
        game.setWagonHealth(15);
        game.setWagonStrength(10);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setQuantity(1);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setDurability(12);
        inventory.get(InventoryWeightPerItem.SpareWheels.ordinal()).setQuantity(0);
        int action = 2;
        int expResult = 2;
        int result = gameControl.repairWagonApply(game, inventory, action);
        System.out.println("repairWagon - valid (1): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(22);
        game.setWagonStrength(10);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setQuantity(1);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setDurability(10);
        inventory.get(InventoryWeightPerItem.SpareWheels.ordinal()).setQuantity(0);
        action = 2;
        expResult = -1;
        result = gameControl.repairWagonApply(game, inventory, action);
        System.out.println("repairWagon - invalid (2): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
    
        game.setWagonHealth(15);
        game.setWagonStrength(50);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setQuantity(1);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setDurability(10);
        inventory.get(InventoryWeightPerItem.SpareWheels.ordinal()).setQuantity(0);
        action = 2;
        expResult = -2;
        result = gameControl.repairWagonApply(game, inventory, action);
        System.out.println("repairWagon - invalid (3): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(15);
        game.setWagonStrength(12);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setQuantity(1);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setDurability(0);
        inventory.get(InventoryWeightPerItem.SpareWheels.ordinal()).setQuantity(0);
        action = 2;
        expResult = -3;
        result = gameControl.repairWagonApply(game, inventory, action);
        System.out.println("repairWagon - invalid (4): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(5);
        game.setWagonStrength(0);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setQuantity(0);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setDurability(0);
        inventory.get(InventoryWeightPerItem.SpareWheels.ordinal()).setQuantity(1);
        action = 1;
        expResult = 1;
        result = gameControl.repairWagonApply(game, inventory, action);
        System.out.println("repairWagon - boundary (5): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(10);
        game.setWagonStrength(19);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setQuantity(1);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setDurability(1);
        inventory.get(InventoryWeightPerItem.SpareWheels.ordinal()).setQuantity(0);
        action = 2;
        expResult = 3;
        result = gameControl.repairWagonApply(game, inventory, action);
        System.out.println("repairWagon - boundary (6): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(0);
        game.setWagonStrength(10);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setQuantity(0);
        inventory.get(InventoryWeightPerItem.Hammer.ordinal()).setDurability(0);
        inventory.get(InventoryWeightPerItem.SpareWheels.ordinal()).setQuantity(0);
        action = 4;
        expResult = 4;
        result = gameControl.repairWagonApply(game, inventory, action);
        System.out.println("repairWagon - boundary (7): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
    }
    
}
