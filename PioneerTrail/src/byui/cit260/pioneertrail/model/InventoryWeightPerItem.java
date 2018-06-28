/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

/**
 *
 * @author Cole
 */
public enum InventoryWeightPerItem {
     Food(.3), 
     Medicine(1), 
     Spare(30),
     Hammer(3),
     Axe(10); 
     
     double weight;

    private InventoryWeightPerItem(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    
    
}
