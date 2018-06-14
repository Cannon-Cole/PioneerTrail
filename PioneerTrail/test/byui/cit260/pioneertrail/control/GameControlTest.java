/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.view.RepairWagonView;
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

    /* tests broken until I can make them accept feedback
    
    @Test
    public void testRepairWagon() {
        
        GameControl gameControl = new GameControl();
        GameModel game = new GameModel();
        InventoryModel inventory = new InventoryModel();
        RepairWagonView repairWagonView = new RepairWagonView();
        
        game.setWagonHealth(15);
        game.setWagonStrength(10);
        inventory.setHasHammer(true);
        inventory.setHammerDurability(12);
        inventory.setSpareWheels(0);
        int expResult = 2;
        int result = repairWagonView.repairWagonView(gameControl, game, inventory);
        System.out.println("repairWagon - valid (1): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(22);
        game.setWagonStrength(10);
        inventory.setHasHammer(true);
        inventory.setHammerDurability(10);
        inventory.setSpareWheels(0);
        expResult = -1;
        result = repairWagonView.repairWagonView(gameControl, game, inventory);
        System.out.println("repairWagon - invalid (2): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
    
        game.setWagonHealth(15);
        game.setWagonStrength(50);
        inventory.setHasHammer(true);
        inventory.setHammerDurability(10);
        inventory.setSpareWheels(0);
        expResult = -2;
        result = repairWagonView.repairWagonView(gameControl, game, inventory);
        System.out.println("repairWagon - invalid (3): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(15);
        game.setWagonStrength(12);
        inventory.setHasHammer(true);
        inventory.setHammerDurability(0);
        inventory.setSpareWheels(0);
        expResult = -3;
        result = repairWagonView.repairWagonView(gameControl, game, inventory);
        System.out.println("repairWagon - invalid (4): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(5);
        game.setWagonStrength(0);
        inventory.setHasHammer(false);
        inventory.setHammerDurability(0);
        inventory.setSpareWheels(1);
        expResult = 1;
        result = repairWagonView.repairWagonView(gameControl, game, inventory);
        System.out.println("repairWagon - boundary (5): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(10);
        game.setWagonStrength(19);
        inventory.setHasHammer(true);
        inventory.setHammerDurability(1);
        inventory.setSpareWheels(0);
        expResult = 3;
        result = repairWagonView.repairWagonView(gameControl, game, inventory);
        System.out.println("repairWagon - boundary (6): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
        
        game.setWagonHealth(0);
        game.setWagonStrength(10);
        inventory.setHasHammer(false);
        inventory.setHammerDurability(0);
        inventory.setSpareWheels(0);
        expResult = 4;
        result = repairWagonView.repairWagonView(gameControl, game, inventory);
        System.out.println("repairWagon - boundary (7): " + result + ", " + expResult);
        assertEquals(expResult, result, 0);
    }
    
    */
    
}
