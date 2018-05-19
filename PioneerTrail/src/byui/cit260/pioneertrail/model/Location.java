/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.io.Serializable;

/**
 *
 * @author aimeejorgensen
 */
public class Location implements Serializable{
  
    private int currentRow;
    private int currentColumn;
    private boolean visited; 
    
    public Location() {
    } 
    
    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int rowOne) {
        this.currentRow = rowOne;
    }
    
    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int rowOne) {
        this.currentColumn = rowOne;
    }
    
    public boolean getVisited() {
        return visited;
    }

    public void setVisted(boolean visted) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Location{Current Row " + currentRow + "Current Column " + currentColumn + "Visited" + visited + "}"; 
    
    }
}

