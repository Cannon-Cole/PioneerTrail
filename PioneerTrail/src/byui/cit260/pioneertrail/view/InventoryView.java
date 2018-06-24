/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class InventoryView extends View {

    public InventoryView() {

        super("\nInventory"
            + "\n  Total Weight: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getWeight()
            + "\n  Food: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getFoodAmount()
            + "\n  Medicine: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getMedicineAmount()
            + "\n  Spare Wheels: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getSpareWheels()
            + "\n  Axe Durability: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getAxeDurability()
            + "\n  Hammer Durability: " + PioneerTrail.getPlayer().getGames().get(0).getInventory().getHammerDurability()
            + "\n E: Exit");
    }

    @Override
    public boolean doAction(String[] inputs) {

        return false;
    }
    
}
