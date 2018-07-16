/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.model.ActorModel;
import byui.cit260.pioneertrail.model.GameModel;
import java.io.FileWriter;
import java.io.IOException;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Derek, Aimee
 */
public class FamilyStatusView extends View {

    public FamilyStatusView() {

        displayMessage = getFamilyReportString();
        displayMessage += "r\n  P: Print Actor Report";
        displayMessage += "\r\n Q: Quit Menu";
    }

    public String getFamilyReportString() {
        String familyReport = ("\r\n****Family Actors****");
        GameModel game = PioneerTrail.getCurrentGame();
        ActorModel[] actorFamily = game.getFamily();
        familyReport += "\r\n" + String.format("%12s%5s%8s%7s%22s", "Name", "Hlth", "Strgth", "Alive", "Description");
        familyReport += "\r\n" + String.format("%12s%5s%8s%7s%22s", "----", "----", "------", "-----", "-----------");
        for (ActorModel actor : actorFamily) {
            familyReport += "\r\n" + String.format("%12s%5d%8d%7s%22s",
                actor.getName(), actor.getHealth(), actor.getStrength(),
                actor.isAlive() ? "True" : "False", actor.getDescription());
        }

        return familyReport;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String input = inputs[0].toUpperCase();
        if (input.equals("P")) {
            String fileName = getInput("Enter a file name:");

            try {
                FileWriter report = new FileWriter(fileName);
                report.write(getFamilyReportString());
                report.flush();
                report.close();

                console.println("You Successfully Created Your Report.");
            } catch (IOException ex) {
                //Logger.getLogger(FamilyStatusView.class.getName()).log(Level.SEVERE, null, ex);
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }

        }

        return false;

    }

}