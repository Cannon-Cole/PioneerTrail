/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import byui.cit260.pioneertrail.model.ActorModel;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.model.PlayerModel;
import byui.cit260.pioneertrail.model.SceneModel;
import byui.cit260.pioneertrail.model.MapModel;
import byui.cit260.pioneertrail.model.LocationModel;

/**
 *
 * @author Aimee, Cole, Derek
 */
public class PioneerTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        teamTest();
        System.out.println("Cole's Tests =======================================");
        coleTest();
        derekTest();
        aimeeTest();
    }
    
    static void coleTest(){
        SceneModel sceneTest = new SceneModel();
        InventoryModel coleInventory = new InventoryModel();
        
        String[] items = {"ammo","wheels","food"};
        double[] resourceAmount = {10.5, 3.4, 1};
        String[] resources = {"food","herbs"};
        
        sceneTest.setDescription("Description Test");
        sceneTest.setSymbol("!@#$%^&*");
        sceneTest.setName("Wonderful Place");
        sceneTest.setIllness(1);
        sceneTest.setMortalityRate(.3);
        sceneTest.setDifficultTerrain(false);
        sceneTest.setBroken(false);
        sceneTest.setMessage("This is a test message");
        sceneTest.setPrices(5.55);
        sceneTest.setVisited(false);
        sceneTest.setItemsAvailable(items);
        sceneTest.setResourceAmount(resourceAmount);
        sceneTest.setItemsAvailable(resources);
        sceneTest.setInventory(coleInventory);
  
        System.out.println(sceneTest.toString());          
    }
    
    static void derekTest() {
        InventoryModel inventoryTest = new InventoryModel();
        inventoryTest.setName("Wood");
        inventoryTest.setType("Resource");
        inventoryTest.setWeight(12.5);
        inventoryTest.setPrice(5.00);
        inventoryTest.setQuantity(10);
        
        System.out.println("Derek's Tests ==================================");
        System.out.println(inventoryTest.toString());
    }

    static void teamTest(){
       
        //create instances
        PlayerModel playerOne = new PlayerModel();
        GameModel gameOne = new GameModel();
        
        
        
        //Testing for PlayerModel class
        playerOne.setName("William Jackson");
        playerOne.setHealth(1);
        playerOne.setAilmentType("Broken Bone");
        playerOne.setMaxWeight(300);
        System.out.println(playerOne.toString());
         
        //Testing for GameModel class
        gameOne.setNumberOfPioneers(5);
        gameOne.setTimeOfYear(6);
        System.out.println(gameOne.toString());
       
        //Testing for ActorModel Enum
        System.out.println(ActorModel.Father.toString());
        System.out.println(ActorModel.Mother.toString());
        System.out.println(ActorModel.Child1.toString());
        System.out.println(ActorModel.Child2.toString());
        
         
        
    }
        //Testing for LocationModel class
    static void aimeeTest(){
     LocationModel locationOne = new LocationModel();
        locationOne.setCurrentRow(5);
        locationOne.setCurrentColumn(6);
        locationOne.setVisited(true);
        System.out.println(locationOne.toString());
        
         //Testing for MapModel class
        MapModel mapOne = new MapModel();
        mapOne.setCurrentRow(1);
        mapOne.setCurrentColumn(1);
        mapOne.setTotalRows(5);
        mapOne.setTotalColumns(5);
        System.out.println(mapOne.toString());   
    }
    
}

