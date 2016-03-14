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

    public static int takeCheck(int sticks) {

        if (sticks > 2) {
            return 2;
        } else if (sticks
                < 1) {
            return 1;
        }
        return sticks;
    }

    public static boolean evaluateEnd(int sticks) {
        return sticks <= 0;
    }

    public static int cpuEvaluateMove(int sticks
    ) {
        int toTake;
        if ((sticks - 2) % 3 == 0 || sticks - 2 == 0) {
            toTake = 1;
        } else {
            toTake = 2;
        }

        return toTake;
    }
    
}
