/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.io.Serializable;

/**
 *
 * @author Aimee, Cole, Derek
 */
public class Game implements Serializable{
   private int numberOfPioneers;
   private int timeOfYear;
   private int mortalityRate;
   private Player player;
   
    public Game() {
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
        final Game other = (Game) obj;
        if (this.numberOfPioneers != other.numberOfPioneers) {
            return false;
        }
        if (this.timeOfYear != other.timeOfYear) {
            return false;
        }
        return true;
    }

   public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
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
}
