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
public class MethodsClass {

    public static int askUserForSticks() {

        Scanner take = new Scanner(System.in);
        int toTake = take.nextInt();
        return toTake;
    }

    public static int takeCheck(int t) {

        if (t > 2) {
            return 2;
        } else if (t
                < 1) {
            return 1;
        }
        return t;
    }

    public static boolean evaluateEnd(int s) {
        return s <= 0;
    }

    public static int cpuEvaluateMove(int a
    ) {
        int toTake;
        if ((a - 2) % 3 == 0 || a - 2 == 0) {
            toTake = 1;
        } else {
            toTake = 2;
        }

        return toTake;
    }
    
}
