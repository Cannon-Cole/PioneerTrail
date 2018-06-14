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
 * @author Derek
 */
public class InventoryModel implements Serializable {

    private String name;
    private String type;
    private double weight;
    private double price;
    private int quantity;
    private int foodAmount;
    private double medicineAmount;
    private boolean hasHammer;
    private int hammerDurability;
    private boolean hasAxe;
    private int axeDurability;
    private int spareWheels;

    public InventoryModel() {
    }

    @Override
    public String toString() {
        return "Inventory{" + "name=" + name + ", type=" + type + ", weight=" + weight + ", price=" + price + ", quantity=" + quantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 97 * hash + this.quantity;
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
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public double getMedicineAmount() {
        return medicineAmount;
    }

    public void setMedicineAmount(double medicineAmount) {
        this.medicineAmount = medicineAmount;
    }

    public boolean getHasHammer() {
        return hasHammer;
    }

    public void setHasHammer(boolean hasHammer) {
        this.hasHammer = hasHammer;
    }

    public int getHammerDurability() {
        return hammerDurability;
    }

    public void setHammerDurability(int hammerDurability) {
        this.hammerDurability = hammerDurability;
    }

    public boolean getHasAxe() {
        return hasAxe;
    }

    public void setHasAxe(boolean hasAxe) {
        this.hasAxe = hasAxe;
    }

    public int getAxeDurability() {
        return axeDurability;
    }

    public void setAxeDurability(int axeDurability) {
        this.axeDurability = axeDurability;
    }

    public int getSpareWheels() {
        return spareWheels;
    }

    public void setSpareWheels(int spareWheels) {
        this.spareWheels = spareWheels;
    }
    
}