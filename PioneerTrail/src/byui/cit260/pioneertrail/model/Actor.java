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
     
Father("Brigham", new Point(1,1)), 
Mother("Sarah", new Point(1,1)), 
Child1("Hyrum", new Point(1,1)), 
Child2("Anna", new Point(1,1)),
Child3("Martin", new Point(1,1)); 

    private String name;
    private Point coordinates;

 Actor(String name, Point coordinates) {
   
    this.name = name;
    this.coordinates = coordinates;

}

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", coordinates=" + coordinates + '}';
    }

    public String getName() {
        return name;
    }

    public Point getCoordinates() {
        return coordinates;
    }

}