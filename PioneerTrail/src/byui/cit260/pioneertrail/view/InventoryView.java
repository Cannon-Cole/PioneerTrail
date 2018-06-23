/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;
import byui.cit260.pioneertrail.model.InventoryModel;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Cole
 */
public class InventoryView extends View {

    @Override
    public String[] getInputs() {
     
        //InventoryModel inventory = PioneerTrail.getPlayer().getGames().get(0).getInventory();

        InventoryModel inventory = new InventoryModel();
        
        //temporary set up for test
        inventory.setWeight(243);
        inventory.setFoodAmount(120);
        inventory.setMedicineAmount(10);
        inventory.setSpareWheels(15);
        inventory.setHasAxe(true);
        inventory.setAxeDurability(10);
        inventory.setHasHammer(true);
        inventory.setHammerDurability(10);

        String[] inputs = new String[1];

        String choice = this.getInput("\nInventory"
            + "\n  Total Weight: " + inventory.getWeight()
            + "\n  Food: " + inventory.getFoodAmount()
            + "\n  Medicine: " + inventory.getMedicineAmount()
            + "\n  Spare Wheels: " + inventory.getSpareWheels()
            + "\n  Axe Durability: " + inventory.getAxeDurability()
            + "\n  Hammer Durability: " + inventory.getHammerDurability());

        inputs[0] = choice;

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        return false;
    }

}