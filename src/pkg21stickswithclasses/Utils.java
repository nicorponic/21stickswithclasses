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
 */
public class Utils {

    public static int takeSticksFromUser() {

        Scanner scan = new Scanner(System.in);
        int userTakes = scan.nextInt();
        if (userTakes > 2) {
            System.out.println("You entered too many sticks! Only 2 will be taken.");
            return 2;
        } else if (userTakes < 1) {
            System.out.println("You entered too few sticks! 1 will be taken.");
            return 1;
        }
        return userTakes;
    }

    public static int cpuEvaluateMove(int sticksLeft
    ) {
        int toTake;
        if ((sticksLeft - 2) % 3 == 0 || sticksLeft - 2 == 0) {
            toTake = 1;
        } else {
            toTake = 2;
        }
        System.out.println("CPU takes " + toTake + " sticks.");
        return toTake;
    }

}
