/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Cole, Derek
 */
public class InventoryModel implements Serializable {

    private String name;
    private int quantity;
    private int durability;

//    private String name;
//    private String type;
//    private double weight;
//    private double price;
//    private int quantity;
      private int foodAmount;
//    private double medicineAmount;
//    private boolean hasHammer;
//    private int hammerDurability;
//    private boolean hasAxe;
//    private int axeDurability;
//    private int spareWheels;
    
    public InventoryModel() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.quantity;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryModel other = (InventoryModel) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryModel{" + "name=" + name + ", quantity=" + quantity + '}';
    }

    public InventoryModel(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
    
    
}
