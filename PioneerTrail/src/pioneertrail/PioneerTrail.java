/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import byui.cit260.pioneertrail.model.Actor;
import byui.cit260.pioneertrail.model.Game;
import byui.cit260.pioneertrail.model.Map;
import byui.cit260.pioneertrail.model.Player;
import byui.cit260.pioneertrail.model.Location;

/**
 *
 * @author 2bigshot
 */
public class PioneerTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        teamTest();

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
        System.out.println(Actor.Child3.toString());
        
        //Testing for Map class
        mapOne.setCurrentRow(1);
        mapOne.setCurrentColumn(1);
        System.out.println(mapOne.toString());
        
        //Testing for Location class
        locationOne.setCurrentRow(1);
        locationOne.setCurrentColumn(1);
        locationOne.setVisted(true);
        System.out.println(locationOne.toString());
}
    
}
