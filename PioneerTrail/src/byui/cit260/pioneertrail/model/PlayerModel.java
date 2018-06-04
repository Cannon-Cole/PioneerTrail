/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Aimee, Cole, Derek
 */
public class PlayerModel implements Serializable {

    private String name;
    private int health;
    private String ailmentType;
    private boolean afflicted;
    private boolean alive;
    private double maxWeight;
    private ArrayList<GameModel> games = new ArrayList<GameModel>();

    public PlayerModel() {
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", health=" + health + ", ailmentType=" + ailmentType + ", afflicted=" + afflicted + ", alive=" + alive + ", maxWeight=" + maxWeight + ", games=" + games + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.health;
        hash = 59 * hash + Objects.hashCode(this.ailmentType);
        hash = 59 * hash + (this.afflicted ? 1 : 0);
        hash = 59 * hash + (this.alive ? 1 : 0);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxWeight) ^ (Double.doubleToLongBits(this.maxWeight) >>> 32));
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
        final PlayerModel other = (PlayerModel) obj;
        if (this.health != other.health) {
            return false;
        }
        if (this.afflicted != other.afflicted) {
            return false;
        }
        if (this.alive != other.alive) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxWeight) != Double.doubleToLongBits(other.maxWeight)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ailmentType, other.ailmentType)) {
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getAilmentType() {
        return ailmentType;
    }

    public void setAilmentType(String ailmentType) {
        this.ailmentType = ailmentType;
    }

    public boolean isAfflicted() {
        return afflicted;
    }

    public void setAfflicted(boolean afflicted) {
        this.afflicted = afflicted;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public ArrayList<GameModel> getGames() {
        return games;
    }
}