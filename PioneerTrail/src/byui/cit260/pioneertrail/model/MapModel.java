/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.util.Objects;

/**
 *
 * @author aimeejorgensen
 */
public class MapModel implements Serializable {

    private int currentRow;
    private int currentColumn;
    private int numRows;
    private int numColumns;
    private LocationModel location;  //this will eventually be an array
    private LocationModel currentLocation;

    public MapModel() {
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

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numcolumns) {
        this.numColumns = numcolumns;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public LocationModel getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(LocationModel currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    public static MapModel createMap(int noOfRows, int noOfColumns){
        System.out.println("***MapModel createMap() called***");
        MapModel map = new MapModel();
        
        map.numRows = noOfRows;
        map.numColumns = noOfColumns;
        
        return map;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.currentRow;
        hash = 97 * hash + this.currentColumn;
        hash = 97 * hash + this.numRows;
        hash = 97 * hash + this.numColumns;
        hash = 97 * hash + Objects.hashCode(this.location);
        hash = 97 * hash + Objects.hashCode(this.currentLocation);
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
        final MapModel other = (MapModel) obj;
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (this.numRows != other.numRows) {
            return false;
        }
        if (this.numColumns != other.numColumns) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", numRows=" + numRows + ", numcolumns=" + numColumns + ", location=" + location + ", currentLocation=" + currentLocation + '}';
    }

}