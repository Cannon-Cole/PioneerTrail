/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.awt.Point;

/**
 *
 * @author Aimee, Cole, Derek
 */
public enum ActorModel {

    Father("Brigham", new Point(1, 1), true),
    Mother("Sarah", new Point(1, 1), true),
    Child1("Hyrum", new Point(1, 1), true),
    Child2("Anna", new Point(1, 1), true),
    Child3("Martin", new Point(1, 1), true);

    private String name;
    private Point coordinates;
    private boolean alive;

    ActorModel(String name, Point coordinates, boolean alive) {

        this.name = name;
        this.coordinates = coordinates;
        this.alive = alive;

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