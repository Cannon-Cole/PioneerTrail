/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author aimeejorgensen
 */
public class MapModel implements Serializable {

    private int currentRow;
    private int currentColumn;
    private int totalRows;
    private int totalColumns;
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

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.currentRow;
        hash = 97 * hash + this.currentColumn;
        hash = 97 * hash + this.totalRows;
        hash = 97 * hash + this.totalColumns;
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
        if (this.totalRows != other.totalRows) {
            return false;
        }
        if (this.totalColumns != other.totalColumns) {
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
        return "Map{" + "currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", totalRows=" + totalRows + ", totalColumns=" + totalColumns + ", location=" + location + ", currentLocation=" + currentLocation + '}';
    }

}