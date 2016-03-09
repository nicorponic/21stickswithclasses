/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21stickswithclasses;

/**
 *
 * @author N1CO
 */
import java.util.Scanner;

/**
 *
 * @author N1CO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Sticks ob = new Sticks();
        ob.setSticks(21);

        System.out.println("Go 1st? y/n?");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();

        while (ob.getSticks() > 0) {
            if (first.equals("y") || first.equals("Y")) {
                System.out.println("There are " + ob.getSticks() + " sticks");
                System.out.println("How many do you want to take? 1 or 2?");

                int take = MethodsClass.askUserForSticks();
                int toTake = MethodsClass.takeCheck(take);
                ob.setSticks(ob.getSticks(), toTake);

                if (MethodsClass.evaluateEnd(ob.getSticks())) {
                    System.out.println("You Lost!");
                } else {
                    take = MethodsClass.cpuEvaluateMove(ob.getSticks());
                    ob.setSticks(ob.getSticks(), take);

                    System.out.println("CPU takes " + take + " sticks.");

                    if (MethodsClass.evaluateEnd(ob.getSticks())) {
                        System.out.println("You win ! ! !");
                    }
                }
            } else {
                int toTake = MethodsClass.cpuEvaluateMove(ob.getSticks());
                ob.setSticks(ob.getSticks(), toTake);

                System.out.println("CPU takes " + toTake + " sticks");

                if (MethodsClass.evaluateEnd(ob.getSticks())) {
                    System.out.println("You Win ! ! !");
                } else {
                    System.out.println("there are " + ob.getSticks() + " sticks");
                    System.out.println("How many do you want to take? 1 or 2?");

                    int take = MethodsClass.askUserForSticks();
                    toTake = MethodsClass.takeCheck(take);
                    ob.setSticks(ob.getSticks(), toTake);

                    if (MethodsClass.evaluateEnd(ob.getSticks())) {
                        System.out.println("You lost!");
                    }
                }
            }

        }

    }

}
