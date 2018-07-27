/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import pioneertrail.PioneerTrail;
import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.control.InventoryControl;
import byui.cit260.pioneertrail.exceptions.GameControlException;
import byui.cit260.pioneertrail.model.InventoryModel;
import java.util.ArrayList;
/**
 *
 * @author aimeejorgensen
 */
public class PurchaseSupplyView extends View {

    public PurchaseSupplyView() {
        super("\n*****GENERAL STORE******"
            + "\n  FOOD"
            + "\n       B: Bacon/dried meat 100 lbs"
            + "\n       H: Salted Ham:  300 lbs"
            + "\n       F: Barrel of Flour: 150 lbs"
            + "\n       S: Barrel of Sugar:  150 lbs"
            + "\n       L: Lard:  100 lbs"
            + "\n       E: Salt/Pepper/Molasses/Eggs:  100 lbs"   
            + "\n  E: Exit");
    }
    
    @Override
    public boolean doAction(String[] inputs) {

        switch (inputs[0].toUpperCase()) {
            case "B":
            case "H":
            case "F":
            case "S":
            case "L":
            case "E":
//                totalFood();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid input");
        }

        return false;
    }
}
    
        
//        String displayMessage = getPurchaseSuppliesString();
//        displayMessage += "r\n  Note: The journey will take 24 weeks or 12 turns. "
//                + "Your family will consume 26 lbs of food per person per turn."
//                + "Food may be obtained along the way, but plan wisely."
//                + "1,600 lbs of food is recommended to start your journey."; 
//        displayMessage += "r\n  ****Please enter a supply item and quantity. "
//                + "\r\n"
//                + "For example, to buy 200 lbs of Bacon/dried meat,you would select, Menu Item: 1, Quantity: 2"
//                + "\r\n Limits:  You may only bring 2,000 lbs of total inventory with you on your wagon.";
//        System.out.println();
//        displayMessage += "\r\n s"
////        displayMessage += "\r\n Q: Quit Menu";
//           String PurchaseInventory = ("\r\n****Purchase Supplies for Your Journey****");
//
//    @Override
//    public boolean doAction(String[] inputs) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private String getPurchaseSuppliesString() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    }
//
//    private String getPurchaseSuppliesString() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean doAction(String[] inputs) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//}

//
//“Menu Item _  	Quantity _”					TOTAL  WEIGHT ___lbs *
//
//The user would then see a menu of items to select:
//
//Inventory Menu:						Items Selected:
//1.  Food	1.   Bacon/dried meat 100 lbs			Food:  1600 recommended
//	a.   Salted Ham:  300 lbs
//	b.   Barrel of Flour: 150 lbs
//	c.   Barrel of Sugar:  150 lbs
//	d.   Lard:  100 lbs
//	e.   Salt/Pepper/Molasses/Eggs:  100 lbs
//	
//	
//2.  Medicine	
//      e.   Caster Oil/Medicine:  5 lbs		Medicine: 10 lbs recommended
////	f.   Vinegar: 5 lbs
//
//3.  Tools & Supplies	
//      g. Tents/ropes:  100 lbs		Tools & Supplies: 500 lbs recom.
//	h.  Bedding:  50 lbs
//	i.  Clothing:  50 lbs
//	j.  Misc. Tools: 50 lbs
//      k.  Spare Wheel: 50 lbs
//	l:  Spare Axel:  200 lbs
//
//4.  Weapons		
//      m.  Gun:  10 lbs			Weapons: 20 lbs recommended
//	n.  Ammunition: 10 lbs
//	
//C.   CONTINUE
//E.   EXIT
//
//* 
//Algorithm for method
//
//sumInventoryFill() 
//Find the sum of a list
//
//total (list): number 
//BEGIN 
//total = 0 
//FOR index = 0  TO list.length -1 
//total = total + list[index] 
//ENDFOR 
//RETURN total 
//END
//	
//
//User sees a list of items to purchase and a dollar amount they may spend.  They have the option to buy the following items:
//
//Total Weight: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getWeight()
////            + "\n  Food: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getFoodAmount()
////            + "\n  Medicine: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getMedicineAmount()
////            + "\n  Spare Wheels: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getSpareWheels()
////            + "\n  Axe Durability: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getAxeDurability()
////            + "\n  Hammer Durability:
//PioneerTrail.getPlayer().getGames().get(0).getInventory().getToolsSupplies()
////	  +”\n Tools And Misc Supplies:
//PioneerTrail.getPlayer().getGames().get(0).getInventory().getWeapons()
////            +”\n Weapons and Ammunition:
//
//RECOMMENDED INVENTORY SUPPLIES: 
//
//Food:  FOOD: flour/grains/sugar/salt/pepper (650 lbs.), bacon/dried meat ( 500 lbs.), molasses, vinegar, eggs, (50 lbs.), lard (200 lbs.)
//
//Medicine: 50 lbs.:  Each family should have a box of physicing pills, a quart of castor oil, a quart of the vinegar and a large vial of peppermint essence.” 
//
//Tents/Bedding/Clothing Supplies:  200 
//
//Spare Wheels/Tools:  250
//
//
//FOOD: flour/grains/sugar/salt/pepper (650 lbs.), bacon/dried meat ( 500 lbs.), molasses, vinegar, eggs, (50 lbs.), lard (200 lbs.) BEDDING & TENT SUPPLIES: blankets, ground cloths, pillows, tent, poles, stakes, ropes.  (200 lbs)  TOTAL SUPPLY WEIGHT:  2,000 lbs.
////
//
//    @Override
//    public boolean doAction(String[] inputs) {
//
//        switch (inputs[0].toUpperCase()) {
//            case "N":
//                startNewGame();
//                break;
//            case "L":
//                loadGame();
//                break;
//            case "H":
//                getHelp();
//                break;/*