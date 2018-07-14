/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import byui.cit260.pioneertrail.view.StartProgramView;
import byui.cit260.pioneertrail.model.GameModel;
import byui.cit260.pioneertrail.model.PlayerModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Aimee, Cole, Derek
 */
public class PioneerTrail {

    private static GameModel currentGame = null;
    private static PlayerModel player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static void main(String[] args) {

        try {

            PioneerTrail.inFile = new BufferedReader(new InputStreamReader(System.in));
            PioneerTrail.outFile = new PrintWriter(System.out, true);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            PioneerTrail.setPlayer(player); //save the player
            return;

        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString()
                + "\nCause: " + e.getCause()
                + "\nmessage: " + e.getMessage());
        } finally {
            try {
                if (PioneerTrail.inFile != null) {
                    inFile.close();

                }

                if (PioneerTrail.outFile != null) {
                    outFile.close();
                }

            } catch (IOException ex) {
                System.out.println("input or output stream couldn't close");
            }
        }

    }

    public static GameModel getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(GameModel currentGame) {
        PioneerTrail.currentGame = currentGame;
    }

    public static PlayerModel getPlayer() {
        return player;
    }

    public static void setPlayer(PlayerModel player) {
        PioneerTrail.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PioneerTrail.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PioneerTrail.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PioneerTrail.logFile = logFile;
    }

}
