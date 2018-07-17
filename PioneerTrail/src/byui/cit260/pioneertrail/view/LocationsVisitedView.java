/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import pioneertrail.PioneerTrail;
import byui.cit260.pioneertrail.model.LocationModel;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Derek
 */
public class LocationsVisitedView extends View {
    
    protected String reportSave = "";
    //need to have it up here because adding parameters to superclass functions is a pain
    
    public LocationsVisitedView() {
        
        this.console.println(generateReport());        
        displayMessage =
                "\nSave this report to disk?" +
                "\n  S: Save" +
                "\n  E: Exit";
    }

    private String generateReport() {
        
        String reportWrite =
                " Location Name            Location Description" +
                "\n------------------------ -------------------------------------------------------";
        String current = "";
        
        LocationModel[][] locations = PioneerTrail.getCurrentGame().getMap().getLocations();
        
        // loops read map from left-to-right instead of by row
        for (int column = 0; column < locations[0].length; column++) {
            for (LocationModel[] location : locations) {
                if (location[column].isVisited()) {
                    // add > before name if current location
                    if ((location[column].getCurrentRow() == PioneerTrail.getCurrentGame().getMap().getCurrentRow())
                    && location[column].getCurrentColumn() == PioneerTrail.getCurrentGame().getMap().getCurrentColumn()) {
                        current = ">";
                    } else {
                        current = " ";
                    }
                    reportWrite += String.format("%n%1s%-24s %-54s", current, location[column].getScene().getName(), location[column].getScene().getDescription());
                }
            }
        }
        reportSave = PioneerTrail.getPlayer().getName() + "'s Visited Locations:\n\n" + reportWrite;
        return "\n" + reportWrite;
    }
    
    private void getPath() {
        
        String savePath = "";
        
        this.console.println(
                "\nWhich folder do you want to save this information into?" +
                "\nLeave blank to save to game's main folder" +
                "\nFilename will be VisitedLocationsReport.txt");
        
        try {
            savePath = this.keyboard.readLine();            
        } catch (IOException ioex) {
            ErrorView.display(this.getClass().getName(), ioex.getMessage());
        }
        
        if ("".equals(savePath)) {
            this.saveReport(savePath + "VisitedLocationsReport.txt");
        } else {
            this.saveReport(savePath + "/VisitedLocationsReport.txt");
        }
    }
    
    private void saveReport(String savePath) {

        try {
            FileWriter outFile = new FileWriter(savePath);
            
            outFile.write(reportSave);
            outFile.flush();
            outFile.close();

            this.console.println("File " + savePath + " saved successfully.");

        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            this.console.println("Error saving " + savePath);
        }
    }

    @Override
    public boolean doAction(String[] inputs) {
        
        switch (inputs[0].toUpperCase()) {
            case "S":
                getPath();
                //dependent on individual location data
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"Invalid Input");
                break;
        }
        return false;
    }
}
