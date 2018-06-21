/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.GameControl;
import byui.cit260.pioneertrail.model.PlayerModel;
import java.util.Scanner;

/**
 *
 * @author aimeejorgensen
 */
public class StartProgramView {

    public StartProgramView() {
//constructor
    }

//    delete this view
//    public void displayStartProgramView() {
//        System.out.println("******************************************************************************************************************\n"
//            + "* This is the game of Pioneer Trail./n"
//            + "* In this game you will make a trek west to flee from religious persecution.\n"
//            + "* You have heard of a place called Zion in the mountains that offers the freedom you desire.\n"
//            + "* Your family is composed of both parents and three children.\n"
//            + "* Before starting your journey of 1,500 miles you must buy items necessary for the trip.\n"
//            + "* Plan carefully so that you will have neough.\n"
//            + "* There will be adversity such as deaths, illness, snake bites, broken wagons, adverse weather.\n"
//            + "* If you see an animal you can hunt it if you have weapons.\n"
//            + "* You can repair your wagon if you have the tools when you stop\n"
//            + "* To win you must reach Zion with at least two family members.\n"
//            + "******************************************************************************************************************\n");
//
//        boolean endOfView = false;
//
//        do {
//            String[] inputs = this.getInputs();
//
//            if (inputs == null) {
//                return;
//            }
//
//            else if ("E".equals(inputs[0].toUpperCase())) {
//                return;
//            }
//
//            endOfView = doAction(inputs);
//
//        }
//        while (endOfView = false);
//    }

    private String[] getInputs() {
        //Gets input for main menu

        Scanner reader = new Scanner(System.in);

        String[] inputs = new String[1];

        boolean valid = false;
        while (valid == false) {

            System.out.println("Enter your name: (E to exit.)");
            inputs[0] = reader.nextLine();

            inputs[0] = inputs[0].trim();

            if (inputs[0].length() < 1) {
                System.out.println("You must enter a non-blank value");
                continue;
            }

            valid = true;
        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        GameControl gameControl = new GameControl();

        String playersName = inputs[0];
        
        PlayerModel player = gameControl.savePlayer(playersName);

        if (player == null) {
            System.out.println("Could not create the player. " + playersName + "Enter a different name.");
            return false;
        }

        System.out.println("==================================================================\n"
            + "Welcome to the game " + playersName
            + "\nWe hope you have a lot of fun!\n"
            + "==================================================================");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();

        return true;
    }

}