/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

import pioneertrail.PioneerTrail;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.InventoryModel;
import byui.cit260.pioneertrail.model.LocationModel;
import byui.cit260.pioneertrail.model.MapModel;
import byui.cit260.pioneertrail.model.SceneModel;
import byui.cit260.pioneertrail.enums.SceneType;
import byui.cit260.pioneertrail.view.MoveActorView;
import byui.cit260.pioneertrail.exceptions.MapControlException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author aimeejorgensen
 */
public class MapControl {

    public void displayMap() {
        String leftIndicator;
        String rightIndicator;
        GameModel game = PioneerTrail.getCurrentGame(); // retreive the game
        MapModel map = game.getMap(); // retreive the map from game
        LocationModel[][] locations = map.getLocations(); // retreive the locations from map
        PrintWriter output = PioneerTrail.getOutFile();
        
        // Build the heading of the map
        output.println("\n                     ===[ THE PIONEER TRAIL ]===");
        output.print("  -");
        
        for (int column = 0; column < locations[0].length; column++) {
            // print col numbers to side of map
            if (column < 10) {
                output.print("  " + column + " -");
            } else {
                output.print(" " + column + " -");
            }
        }
        
        // Now build the map.  For each row, show the column information
        output.println();
        
        for (int row = 0; row < locations.length; row++) {
            output.print(row + " "); // print row numbers to side of map
            
            for (int column = 0; column < locations[row].length; column++) {
                // set default indicators as blanks
                leftIndicator = " ";
                rightIndicator = " ";
                
                boolean isThere = false; //boolean until it's handled elsewhere
                if ((locations[row][column].getCurrentRow() == map.getCurrentRow())
                && locations[row][column].getCurrentColumn() == map.getCurrentColumn()) {
                    // Set arrow indicators to show this is the current location.
                    leftIndicator = ">";
                    rightIndicator = "<";
                    isThere = true;
                }
                
                output.print("|"); // start map with a |
                
                if (locations[row][column].getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    output.print(leftIndicator + "??" + rightIndicator);
                } else {
                    if (locations[row][column].isVisited() || (column == 12) || isThere) {
                        // only show symbol if visited, or is the goal
                        output.print(leftIndicator
                            + locations[row][column].getScene().getSymbol()
                            + rightIndicator);
                    } else {
                        // else, hide location abbreviations
                        output.print(" -- ");
                    }
                }
            }
            
            output.println("|");
        }
    }


    public static MapModel createMap(int noOfRows, int noOfColumns, ArrayList<InventoryModel> inventory) {
        
        System.out.println("*** MapControl - createMap() called ***");
        
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
        locations[0][0].setVisited(true); //starting point
        map.setLocations(locations);
        
        SceneModel[] scenes = createScenes();
        
        assignItemsToScenes(inventory, scenes);
        
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    public static SceneModel[] createScenes() {
        
        SceneModel[] scenes = new SceneModel[26];
        
        for (int i = 0; i < scenes.length; i++) {
            scenes[i] = new SceneModel();
        }
        
        //names
        scenes[SceneType.Nauvoo.ordinal()].setName("Nauvoo");
        scenes[SceneType.SugarCreek.ordinal()].setName("Sugar Creek");
        scenes[SceneType.RichardsonsPoint.ordinal()].setName("Richardson's Point");
        scenes[SceneType.CharitonRiverCrossing.ordinal()].setName("Chariton River Crossing");
        scenes[SceneType.LocustCreek.ordinal()].setName("Locust Creek");
        scenes[SceneType.GardenGrove.ordinal()].setName("Garden Grove");
        scenes[SceneType.NishnabotnaRiver.ordinal()].setName("Nishnabotna River");
        scenes[SceneType.GrandEncampment.ordinal()].setName("Grand Encampment");
        scenes[SceneType.CouncilBluffs.ordinal()].setName("Council Bluffs");
        scenes[SceneType.WinterQuarters.ordinal()].setName("Winter Quarters");
        scenes[SceneType.ElkhornRiverCrossing.ordinal()].setName("Elkhorn River Crossing");
        scenes[SceneType.PlatteRiver.ordinal()].setName("Platte River");
        scenes[SceneType.FortKearny.ordinal()].setName("Fort Kearny");
        scenes[SceneType.ConfluencePoint.ordinal()].setName("Confluence Point");
        scenes[SceneType.AshHollow.ordinal()].setName("Ash Hollow");
        scenes[SceneType.ChimneyRock.ordinal()].setName("Chimney Rock");
        scenes[SceneType.ScottsBluff.ordinal()].setName("Scotts Bluff");
        scenes[SceneType.FortLaramie.ordinal()].setName("Fort Laramie");
        scenes[SceneType.SweetwaterRiver.ordinal()].setName("Sweetwater River");
        scenes[SceneType.IndependenceRock.ordinal()].setName("Independence Rock");
        scenes[SceneType.FortBridger.ordinal()].setName("Fort Bridger");
        scenes[SceneType.EchoCanyon.ordinal()].setName("Echo Canyon");
        scenes[SceneType.GoldenPassRoad.ordinal()].setName("Golden Pass Road");
        scenes[SceneType.EmigrationCanyon.ordinal()].setName("Emigration Canyon");
        scenes[SceneType.Zion1.ordinal()].setName("Zion");
        scenes[SceneType.Zion2.ordinal()].setName("Zion");
        
        //symbols
        scenes[SceneType.Nauvoo.ordinal()].setSymbol("NV");
        scenes[SceneType.SugarCreek.ordinal()].setSymbol("SC");
        scenes[SceneType.RichardsonsPoint.ordinal()].setSymbol("RP");
        scenes[SceneType.CharitonRiverCrossing.ordinal()].setSymbol("CR");
        scenes[SceneType.LocustCreek.ordinal()].setSymbol("LC");
        scenes[SceneType.GardenGrove.ordinal()].setSymbol("GG");
        scenes[SceneType.NishnabotnaRiver.ordinal()].setSymbol("NR");
        scenes[SceneType.GrandEncampment.ordinal()].setSymbol("GE");
        scenes[SceneType.CouncilBluffs.ordinal()].setSymbol("CB");
        scenes[SceneType.WinterQuarters.ordinal()].setSymbol("WQ");
        scenes[SceneType.ElkhornRiverCrossing.ordinal()].setSymbol("ER");
        scenes[SceneType.PlatteRiver.ordinal()].setSymbol("PR");
        scenes[SceneType.FortKearny.ordinal()].setSymbol("FK");
        scenes[SceneType.ConfluencePoint.ordinal()].setSymbol("CP");
        scenes[SceneType.AshHollow.ordinal()].setSymbol("AH");
        scenes[SceneType.ChimneyRock.ordinal()].setSymbol("CR");
        scenes[SceneType.ScottsBluff.ordinal()].setSymbol("SB");
        scenes[SceneType.FortLaramie.ordinal()].setSymbol("FL");
        scenes[SceneType.SweetwaterRiver.ordinal()].setSymbol("SR");
        scenes[SceneType.IndependenceRock.ordinal()].setSymbol("IR");
        scenes[SceneType.FortBridger.ordinal()].setSymbol("FB");
        scenes[SceneType.EchoCanyon.ordinal()].setSymbol("EC");
        scenes[SceneType.GoldenPassRoad.ordinal()].setSymbol("GP");
        scenes[SceneType.EmigrationCanyon.ordinal()].setSymbol("EC");
        scenes[SceneType.Zion1.ordinal()].setSymbol("Z!");
        scenes[SceneType.Zion2.ordinal()].setSymbol("Z!");
        
        //descriptions
        scenes[SceneType.Nauvoo.ordinal()].setDescription("You have arrived at Nauvoo");
        scenes[SceneType.SugarCreek.ordinal()].setDescription("You have arrived at Creek");
        scenes[SceneType.RichardsonsPoint.ordinal()].setDescription("You have arrived at Richardsons Point");
        scenes[SceneType.CharitonRiverCrossing.ordinal()].setDescription("You have arrived at Chariton River Crossing");
        scenes[SceneType.LocustCreek.ordinal()].setDescription("You have arrived at Locust Creek");
        scenes[SceneType.GardenGrove.ordinal()].setDescription("You have arrived at Garden Grove");
        scenes[SceneType.NishnabotnaRiver.ordinal()].setDescription("You have arrived at Nishnabotna River");
        scenes[SceneType.GrandEncampment.ordinal()].setDescription("You have arrived at Grand Encampment");
        scenes[SceneType.CouncilBluffs.ordinal()].setDescription("You have arrived at Council Bluffs");
        scenes[SceneType.WinterQuarters.ordinal()].setDescription("You have arrived at Winter Quarters");
        scenes[SceneType.ElkhornRiverCrossing.ordinal()].setDescription("You have arrived at Elkhorn River Crossing");
        scenes[SceneType.PlatteRiver.ordinal()].setDescription("You have arrived at Platte River");
        scenes[SceneType.FortKearny.ordinal()].setDescription("You have arrived at Fort Kearny");
        scenes[SceneType.ConfluencePoint.ordinal()].setDescription("You have arrived at Confluence Point");
        scenes[SceneType.AshHollow.ordinal()].setDescription("You have arrived at Ash Hollow");
        scenes[SceneType.ChimneyRock.ordinal()].setDescription("You have arrived at Chimney Rock");
        scenes[SceneType.ScottsBluff.ordinal()].setDescription("You have arrived at Scotts Bluff");
        scenes[SceneType.FortLaramie.ordinal()].setDescription("You have arrived at Fort Laramie");
        scenes[SceneType.SweetwaterRiver.ordinal()].setDescription("You have arrived at Sweetwater River");
        scenes[SceneType.IndependenceRock.ordinal()].setDescription("You have arrived at Independence Rock");
        scenes[SceneType.FortBridger.ordinal()].setDescription("You have arrived at Fort Bridger");
        scenes[SceneType.EchoCanyon.ordinal()].setDescription("You have arrived at Echo Canyon");
        scenes[SceneType.GoldenPassRoad.ordinal()].setDescription("You have arrived at Golden Pass Road");
        scenes[SceneType.EmigrationCanyon.ordinal()].setDescription("You have arrived at Emigration Canyon");
        scenes[SceneType.Zion1.ordinal()].setDescription("You have arrived at Zion");
        scenes[SceneType.Zion2.ordinal()].setDescription("You have arrived at Zion");

        return scenes;
    }
    
    private static void assignItemsToScenes(ArrayList<InventoryModel> inventory, SceneModel[] scenes) {
        
        ArrayList<InventoryModel> itemsInScene = InventoryControl.createInventory();
        SceneModel resourceScene1 = scenes[SceneType.Nauvoo.ordinal()];
        itemsInScene.add(new InventoryModel("Food", 100));
        itemsInScene.add(new InventoryModel("Medicine", 10));
        resourceScene1.setInventory(itemsInScene);
        
    }
    
    private static void assignScenesToLocations(MapModel map, SceneModel[] scenes) {
        LocationModel[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.Nauvoo.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.SugarCreek.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.RichardsonsPoint.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.CharitonRiverCrossing.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.LocustCreek.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.GardenGrove.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.NishnabotnaRiver.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.GrandEncampment.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.CouncilBluffs.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.WinterQuarters.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.ElkhornRiverCrossing.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.PlatteRiver.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.FortKearny.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.ConfluencePoint.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.AshHollow.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.ChimneyRock.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.ScottsBluff.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.FortLaramie.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.SweetwaterRiver.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.IndependenceRock.ordinal()]);
        locations[0][10].setScene(scenes[SceneType.FortBridger.ordinal()]);
        locations[1][10].setScene(scenes[SceneType.EchoCanyon.ordinal()]);
        locations[0][11].setScene(scenes[SceneType.GoldenPassRoad.ordinal()]);
        locations[1][11].setScene(scenes[SceneType.EmigrationCanyon.ordinal()]);
        locations[0][12].setScene(scenes[SceneType.Zion1.ordinal()]);
        locations[1][12].setScene(scenes[SceneType.Zion2.ordinal()]);
        
    }
    
    public static int moveActorWrapper(int currentRow, int currentColumn) throws MapControlException{
    
        MoveActorView view = new MoveActorView();
        view.display();
        
        
        return 0;
    }
    
    public static LocationModel moveActor(int newRow, int newColumn) throws MapControlException {
        /*
        if (actor == null )
            throw new MapControlException("actor can't be null");
        */
        // todo: pass down a FamilyModel?
        
        GameModel game = PioneerTrail.getCurrentGame();
        MapModel map = game.getMap();
        LocationModel location = map.getCurrentLocation();
        
        if (newRow < 0 || newRow > map.getNumRows() - 1 || newColumn < 0 || newColumn > map.getNumColumns() - 1)
            throw new MapControlException("\nNew location out of range - check the map");
        
        int currentRow = map.getCurrentRow();
        int currentColumn = map.getCurrentColumn();
        LocationModel[][] locationArray = map.getLocations();
        LocationModel oldLocation = locationArray[currentRow][currentColumn];
        
        LocationModel newLocation = locationArray[newRow][newColumn];
        newLocation.setVisited(true);
        map.setCurrentRow(newRow);
        map.setCurrentColumn(newColumn);
        map.setCurrentLocation(newLocation);
        
        return newLocation;
    }
    
}