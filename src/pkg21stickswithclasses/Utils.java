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

    public static boolean evaluateEnd(int sticksLeft) {
        return sticksLeft <= 0;
    }

    public static int cpuEvaluateMove(int sticksLeft
    ) {
        int toTake;
        if ((sticksLeft - 2) % 3 == 0 || sticksLeft - 2 == 0) {
            toTake = 1;
        } else {
            toTake = 2;
        }

        return toTake;
    }
    
}
