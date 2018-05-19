/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import byui.cit260.pioneertrail.model.Actor;
import byui.cit260.pioneertrail.model.Game;
import byui.cit260.pioneertrail.model.Inventory;
import byui.cit260.pioneertrail.model.Player;
import byui.cit260.pioneertrail.model.Scene;
import byui.cit260.pioneertrail.model.Map;
import byui.cit260.pioneertrail.model.Location;

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
    }
    
    static void coleTest(){
        Scene sceneTest = new Scene();
        Inventory coleInventory = new Inventory();
        
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

    static void teamTest(){
       
        //create instances
        Player playerOne = new Player();
        Game gameOne = new Game();
        Location locationOne = new Location();
        Map mapOne = new Map();
        
        
        //Testing for Player class
        playerOne.setName("William Jackson");
        playerOne.setHealth(1);
        playerOne.setAilmentType("Broken Bone");
        playerOne.setMaxWeight(300);
        System.out.println(playerOne.toString());
         
        //Testing for Game class
        gameOne.setNumberOfPioneers(5);
        gameOne.setTimeOfYear(6);
        System.out.println(gameOne.toString());
       
        //Testing for Actor Enum
        System.out.println(Actor.Father.toString());
        System.out.println(Actor.Mother.toString());
        System.out.println(Actor.Child1.toString());
        System.out.println(Actor.Child2.toString());
        
         //Testing for Location class
        locationOne.setCurrentRow(5);
        locationOne.setCurrentColumn(6);
        locationOne.setVisited(true);
        System.out.println(locationOne.toString());
        
         //Testing for Map class
        mapOne.setCurrentRow(1);
        mapOne.setCurrentColumn(1);
        System.out.println(mapOne.toString());
    }
}
