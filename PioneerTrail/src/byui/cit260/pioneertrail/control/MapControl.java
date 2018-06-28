/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.model.LocationModel;
import byui.cit260.pioneertrail.model.MapModel;
import java.util.ArrayList;

/**
 *
 * @author aimeejorgensen
 */
public class MapControl {

    public void displayMap() {
        System.out.println("*** displayMap() called ***");
    }

    private static MapModel createMap(int noOfRows, int noOfColumns, ArrayList<InventoryModel> inventory) {

        if (noOfRows < 0 || noOfColumns < 0) {
            return null;
        }

        if (inventory == null || inventory.size() < 1) {
            return null;
        }

        MapModel map = new MapModel();
        map.setNumRows(noOfRows);
        map.setNumColumns(noOfColumns);

        LocationModel locations[][] = LocationControl.createLocations(noOfRows, noOfColumns);

        return map;
    }
}