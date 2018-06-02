/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneertrail.control;

/**
 *
 * @author aimeejorgensen
 */
public class ActorControl {
   
    public static double illnessHeal(food, mortality, medicine) {
    /*    
        if {(food is <= 0 || > 500)
	RETURN -1 //food invalid

IF (mortality is < 75 OR > 125)
	RETURN -2 //mortality invalid

IF (medicine is < 0)
	RETURN -3 //medicine invalid
IF (medicine is > 0)
	medicineChance = .3

liveOrDie = foodAmount/mortalityRate + medicineChance

IF liveOrDie >= 0.5
	RETURN liveOrDie
ELSE
	RETURN 0 //dies  //int

    */    
    }
 
    
}

if (food is <= 0 || food > 500) { // food is negative?
return -1;
}

if (mortality < 75 || mortality > 125) {
	return -2;
}

if (medicine < 0) {
	return -3 ;
}

if (medicine > 0) {
	medicineChance = .3;
liveOrDie = foodAmount/mortalityRate + medicineChance;
}

if (liveOrDie >= 0.5) {
	return liveOrDie;
}
 
    double foodAmount = assign;
    double mortalityRate = assign;
    double medicineChance = assign;

else {
	return 0;
}
}