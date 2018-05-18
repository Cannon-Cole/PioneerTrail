/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import byui.cit260.pioneertrail.model.Actor;
import byui.cit260.pioneertrail.model.Game;
import byui.cit260.pioneertrail.model.Player;

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
       
        
       Player playerOne = new Player();
       Game gameOne = new Game();
        
       playerOne.setName("Jim John");
       playerOne.setHealth(1);
       playerOne.setAilmentType("Broken Bone");
       playerOne.setMaxWeight(300);
       System.out.println(playerOne.toString());
       
       gameOne.setNumberOfPioneers(5);
       gameOne.setTimeOfYear(6);
       System.out.println(gameOne.toString());
       
       System.out.println(Actor.Father.toString());
       System.out.println(Actor.Mother.toString());
       System.out.println(Actor.Child1.toString());
       System.out.println(Actor.Child2.toString());
       System.out.println(Actor.Child3.toString());

}
    
}
