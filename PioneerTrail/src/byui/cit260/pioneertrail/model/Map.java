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
public class Map implements Serializable{

private int currentRow;
private int currentColumn;
    
public Map() {
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

    @Override
    public String toString() {
        return "Map{" + "Current Row=" + currentRow + ", Current Column=" + currentColumn + '}';
    }
}


