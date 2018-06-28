/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Aimee, Cole, Derek
 */
public class GameModel implements Serializable {

    private int numberOfPioneers;
    private int timeOfYear;
    private int mortalityRate;
    private int wagonHealth;
    private int wagonStrength;
    private PlayerModel player;
    private MapModel map;
    private ArrayList<InventoryModel> inventory = new ArrayList<InventoryModel>();

    public GameModel() {
      
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.numberOfPioneers;
        hash = 59 * hash + this.timeOfYear;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "numberOfPioneers=" + numberOfPioneers + ", timeOfYear=" + timeOfYear + '}';
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
        final GameModel other = (GameModel) obj;
        if (this.numberOfPioneers != other.numberOfPioneers) {
            return false;
        }
        if (this.timeOfYear != other.timeOfYear) {
            return false;
        }
        return true;
    }

    public PlayerModel getPlayer() {
        return player;
    }

    public void setPlayer(PlayerModel player) {
        this.player = player;
    }

    public int getNumberOfPioneers() {
        return numberOfPioneers;
    }

    public void setNumberOfPioneers(int numberOfPioneers) {
        this.numberOfPioneers = numberOfPioneers;
    }

    public int getTimeOfYear() {
        return timeOfYear;
    }

    public void setTimeOfYear(int timeOfYear) {
        this.timeOfYear = timeOfYear;
    }

    public int getMortalityRate() {
        return mortalityRate;
    }

    public void setMortalityRate(int mortalityRate) {
        this.mortalityRate = mortalityRate;
    }

    public int getWagonHealth() {
        return wagonHealth;
    }

    public void setWagonHealth(int wagonHealth) {
        this.wagonHealth = wagonHealth;
    }

    public int getWagonStrength() {
        return wagonStrength;
    }

    public void setWagonStrength(int wagonStrength) {
        this.wagonStrength = wagonStrength;
    }

    public ArrayList<InventoryModel> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<InventoryModel> inventory) {
        this.inventory = inventory;
    }
    
    public void addInventory(InventoryModel inventory) {
        this.inventory.add(inventory);
    }

    public MapModel getMap() {
        return map;
    }

    public void setMap(MapModel map) {
        this.map = map;
    }
    
    

}
