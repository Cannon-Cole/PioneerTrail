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
 * @author Aimee
 */
public class LocationModel implements Serializable {

    private int currentRow;
    private int currentColumn;
    private boolean visited;
    private SceneModel scene;

    public LocationModel() {
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

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public SceneModel getScene() {
        return scene;
    }

    public void setScene(SceneModel scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.currentRow;
        hash = 67 * hash + this.currentColumn;
        hash = 67 * hash + (this.visited ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.scene);
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
        final LocationModel other = (LocationModel) obj;
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", visited=" + visited + ", scene=" + scene + '}';
    }

}