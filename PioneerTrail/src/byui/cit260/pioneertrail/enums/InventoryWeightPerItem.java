/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.enums;

/**
 *
 * @author Cole
 */
public enum InventoryWeightPerItem {
     Food(0.3), 
     Medicine(0.7), 
     SpareWheels(30.0),
     Hammer(3.5),
     Axe(10.0); 
     
     double weight;

    private InventoryWeightPerItem(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    
    
}
