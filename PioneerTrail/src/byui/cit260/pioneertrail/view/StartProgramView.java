/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.view;

import byui.cit260.pioneertrail.control.GameControl;
import pioneertrail.PioneerTrail;

/**
 *
 * @author aimeejorgensen
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\"******************************************************************************************************************\n"
            + "* This is the game of Pioneer Trail.\n"
            + "* In this game you will make a trek west to flee from religious persecution.\n"
            + "* You have heard of a place called Zion in the mountains that offers the freedom you desire.\n"
            + "* Your family is composed of both parents and three children.\n"
            + "* Before starting your journey of 1,500 miles you must buy items necessary for the trip.\n"
            + "* Plan carefully so that you will have neough.\n"
            + "* There will be adversity such as deaths, illness, snake bites, broken wagons, adverse weather.\n"
            + "* If you see an animal you can hunt it if you have weapons.\n"
            + "* You can repair your wagon if you have the tools when you stop\n"
            + "* To win you must reach Zion with at least two family members.\n"
            + "******************************************************************************************************************\n"
            + "\nPlease enter your name: ");
    }

    @Override
    public boolean doAction(String[] inputs) {
        GameControl gameControl = new GameControl();

        String playersName = inputs[0];

        PioneerTrail.setPlayer(gameControl.savePlayer(playersName));

        if (PioneerTrail.getPlayer() == null) {
            System.out.println("Could not create the player. " + playersName + "Enter a different name.");
            return false;
        }

        System.out.println("==================================================================\n"
            + "Welcome to the game " + PioneerTrail.getPlayer().getName()
            + "\nWe hope you have a lot of fun!\n"
            + "==================================================================");

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return false;
    }

}