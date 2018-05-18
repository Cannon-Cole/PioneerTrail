/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.awt.Point;

/**
 *
 * @author aimeejorgensen
 */
public enum Actor {
    
Father("Brigham", "healthy", false, true, 100, new Point(1,1)), 
Mother("Sarah", "healthy", false, true, 75, new Point(1,1)), 
Child1("Hyrum", "healthy", false, true, 100, new Point(1,1)), 
Child2("Anna", "healthy", false, true, 75, new Point(1,1)),
Child3("Martin", "healthy", false, true, 50, new Point(1,1)); 
        




    private String name;
    private String ailmentType;
    private boolean afflicted;
    private boolean alive;
    private double maxWeight;
    private Point coordinates;

 Actor(String name, String ailmentType, boolean afflicted, boolean alive, double maxWeight, Point coordinates) {
   
    this.name = name;
    this.ailmentType = ailmentType;
    this.afflicted = afflicted;
    this.alive = alive;
    this.maxWeight = maxWeight;
    this.coordinates = coordinates;

}

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", ailmentType=" + ailmentType + ", afflicted=" + afflicted + ", alive=" + alive + ", maxWeight=" + maxWeight + ", coordinates=" + coordinates + '}';
    }

    public String getName() {
        return name;
    }

    public String getAilmentType() {
        return ailmentType;
    }

    public boolean isAfflicted() {
        return afflicted;
    }

    public boolean isAlive() {
        return alive;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    


}
