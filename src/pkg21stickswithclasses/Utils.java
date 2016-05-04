/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21stickswithclasses;

import java.util.Scanner;

/**
 *
 * @author N1CO
 * Episis swsth klassi. Deixneis oti katalavaineis th diafora static kai non-static methodwn.
 */
public class Utils {

	// Ayth h methodos kai h epomeni mporoun na ginoun mono mia (afou panta tis kaleis th mia meta thn alli). Mporeis na xrisimopoihseis thn dikia mou methodo (takeSticksFromUser)
    public static int askUserForSticks() {

        Scanner take = new Scanner(System.in);
        int toTake = take.nextInt();
        return toTake;
    }

    public static int takeCheck(int userSticks) {

        if (userSticks > 2) {
            return 2;
        } else if (userSticks
                < 1) {
            return 1;
        }
        return userSticks;
    }

	public static int takeSticksFromUser() {
        Scanner take = new Scanner(System.in);
        int userSticks = take.nextInt();
        if (userSticks > 2) {
			System.out.println("You entered too many sticks! Only 2 will be taken.")
            return 2;
        } else if (userSticks < 1) {
			System.out.println("You entered too few sticks! 1 will be taken.")
            return 1;
        }
        return userSticks;
    }
	
	// Entaksei, ayth h methodos paraeinai mikrh as poume. Otan kati einai ousiastika mono ena statement, den yparxei logos na to metatrepseis se methodo.
    public static boolean evaluateEnd(int sticksLeft) {
        return sticksLeft <= 0;
    }

    public static int cpuEvaluateMove(int sticksLeft) {
        int toTake;
        if ((sticksLeft - 2) % 3 == 0 || sticksLeft - 2 == 0) {
            toTake = 1;
        } else {
            toTake = 2;
        }
		// Afou panta to kaleis ayto meta apo ayth th methodo, giati de to vazeis mesa?
		System.out.println("CPU takes " + toTake + " sticks.");
        return toTake;
    }
    
}
