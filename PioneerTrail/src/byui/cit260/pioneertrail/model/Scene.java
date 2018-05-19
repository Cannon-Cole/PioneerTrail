/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Cole
 */
public class Scene {
    
    private String description;
    private String symbol;
    private String name;
    private int illness;
    private double mortalityRate;
    private String[] itemsAvailable = {"ammo","wheels","food"};
    private boolean difficultTerrain;
    private boolean broken;
    private double[] resourceAmount = {10.5};
    private String resources[] = {"food","herbs"};
    private String message;
    private double prices;
    private boolean visited;
    
    private ArrayList<Location> locations = new ArrayList<Location>();
    private Inventory inventory;
    private Actor actor;

    public Scene() {
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", symbol=" + symbol + ", name=" + name + ", illness=" + illness + ", mortalityRate=" + mortalityRate + ", itemsAvailable=" + itemsAvailable + ", difficultTerrain=" + difficultTerrain + ", broken=" + broken + ", resourceAmount=" + resourceAmount + ", resources=" + resources + ", message=" + message + ", prices=" + prices + ", visited=" + visited + ", locations=" + locations + ", inventory=" + inventory + ", actor=" + actor + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.symbol);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.illness;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.mortalityRate) ^ (Double.doubleToLongBits(this.mortalityRate) >>> 32));
        hash = 97 * hash + Arrays.deepHashCode(this.itemsAvailable);
        hash = 97 * hash + (this.difficultTerrain ? 1 : 0);
        hash = 97 * hash + (this.broken ? 1 : 0);
        hash = 97 * hash + Arrays.hashCode(this.resourceAmount);
        hash = 97 * hash + Arrays.deepHashCode(this.resources);
        hash = 97 * hash + Objects.hashCode(this.message);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.prices) ^ (Double.doubleToLongBits(this.prices) >>> 32));
        hash = 97 * hash + (this.visited ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.locations);
        hash = 97 * hash + Objects.hashCode(this.inventory);
        hash = 97 * hash + Objects.hashCode(this.actor);
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
        final Scene other = (Scene) obj;
        if (this.illness != other.illness) {
            return false;
        }
        if (Double.doubleToLongBits(this.mortalityRate) != Double.doubleToLongBits(other.mortalityRate)) {
            return false;
        }
        if (this.difficultTerrain != other.difficultTerrain) {
            return false;
        }
        if (this.broken != other.broken) {
            return false;
        }
        if (Double.doubleToLongBits(this.prices) != Double.doubleToLongBits(other.prices)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        if (!Arrays.deepEquals(this.itemsAvailable, other.itemsAvailable)) {
            return false;
        }
        if (!Arrays.equals(this.resourceAmount, other.resourceAmount)) {
            return false;
        }
        if (!Arrays.deepEquals(this.resources, other.resources)) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (this.actor != other.actor) {
            return false;
        }
        return true;
    }
            
            
            

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIllness() {
        return illness;
    }

    public void setIllness(int illness) {
        this.illness = illness;
    }

    public double getMortalityRate() {
        return mortalityRate;
    }

    public void setMortalityRate(double mortalityRate) {
        this.mortalityRate = mortalityRate;
    }

    public String[] getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(String[] itemsAvailable) {
        this.itemsAvailable = itemsAvailable;
    }

    public boolean isDifficultTerrain() {
        return difficultTerrain;
    }

    public void setDifficultTerrain(boolean difficultTerrain) {
        this.difficultTerrain = difficultTerrain;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public double[] getResourceAmount() {
        return resourceAmount;
    }

    public void setResourceAmount(double[] resourceAmount) {
        this.resourceAmount = resourceAmount;
    }

    public String[] getResources() {
        return resources;
    }

    public void setResources(String[] resources) {
        this.resources = resources;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    
            
}
