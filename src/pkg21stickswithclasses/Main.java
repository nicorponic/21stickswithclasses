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

        SticksHolder sticks = new SticksHolder();

        System.out.println("Go 1st? y/n?");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();

        while (sticks.getSticks() > 0) {
            if (first.equalsIgnoreCase("y")) {
                System.out.println("There are " + sticks.getSticks() + " sticks");
                System.out.println("How many do you want to take? 1 or 2?");

                int take = Utils.takeSticksFromUser();

                sticks.reduceSticks(take);

                if (sticks.getSticks() <=0) {
                    System.out.println("You Lost!");
                } else {
                    take = Utils.cpuEvaluateMove(sticks.getSticks());
                    sticks.reduceSticks(take);

                    

                    if (sticks.getSticks() <=0) {
                        System.out.println("You win ! ! !");
                    }
                }
            } else {
                int toTake = Utils.cpuEvaluateMove(sticks.getSticks());
                sticks.reduceSticks(toTake);

                if (sticks.getSticks() <=0) {
                    System.out.println("You Win ! ! !");
                } else {
                    System.out.println("there are " + sticks.getSticks() + " sticks");
                    System.out.println("How many do you want to take? 1 or 2?");

                    int take = Utils.takeSticksFromUser();

                    sticks.reduceSticks(sticks.getSticks(), take);

                    if (sticks.getSticks() <=0) {
                        System.out.println("You lost!");
                    }
                }
            }

        }

    }

}
