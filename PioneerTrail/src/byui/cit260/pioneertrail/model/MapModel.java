/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.util.Arrays;
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
    private LocationModel locations[][];
    private LocationModel currentLocation;

    public MapModel() {
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int row) {
        this.currentRow = row;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int column) {
        this.currentColumn = column;
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

    public LocationModel[][] getLocations() {
        return locations;
    }

    public void setLocations(LocationModel[][] locations) {
        this.locations = locations;
    }

    public LocationModel getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(LocationModel currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    /* Keeping this around in case it actually is used somewhere
       Other createMap() function is in control layer
    
    public static MapModel createMap(int noOfRows, int noOfColumns){
        System.out.println("***MapModel createMap() called***");
        MapModel map = new MapModel();
        
        map.numRows = noOfRows;
        map.numColumns = noOfColumns;
        
        return map;
    }
    */

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.currentRow;
        hash = 19 * hash + this.currentColumn;
        hash = 19 * hash + this.numRows;
        hash = 19 * hash + this.numColumns;
        hash = 19 * hash + Arrays.deepHashCode(this.locations);
        hash = 19 * hash + Objects.hashCode(this.currentLocation);
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
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MapModel{" + "currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", numRows=" + numRows + ", numColumns=" + numColumns + ", locations=" + locations + ", currentLocation=" + currentLocation + '}';
    }

}