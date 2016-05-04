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
		// De xreiazetai, idi exei 21 sticks ekei mesa
        sticks.setSticks(21);

        System.out.println("Go 1st? y/n?");
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();

        while (sticks.getSticks() > 0) {
			// Yparxei mia wraia methodos, pou legetai equalsIgnoreCase. Mporeis na allakseis thn parapanw grammi se:
			// if (first.equalsIgnoreCase("y")) {
            if (first.equals("y") || first.equals("Y")) {
                System.out.println("There are " + sticks.getSticks() + " sticks");
                System.out.println("How many do you want to take? 1 or 2?");

				// Tis esvisa aytes, gia na xirisimopoihseis mia mono methodo
                // int take = Utils.askUserForSticks();
                // int toTake = Utils.takeCheck(take);

				// Des to Utils gia na deis ti kanei ayth h methodos
				int toTake = Utils.takeSticksFromUser();
                sticks.reduceSticks(sticks.getSticks(), toTake);

                if (Utils.evaluateEnd(sticks.getSticks())) {
                    System.out.println("You Lost!");
                } else {
                    take = Utils.cpuEvaluateMove(sticks.getSticks());
                    sticks.reduceSticks(sticks.getSticks(), take);

					// Pleon to kaloume ayto mesa apo thn methodo
                    // System.out.println("CPU takes " + take + " sticks.");

                    if (Utils.evaluateEnd(sticks.getSticks())) {
                        System.out.println("You win ! ! !");
                    }
                }
            } else {
                int toTake = Utils.cpuEvaluateMove(sticks.getSticks());
                sticks.reduceSticks(sticks.getSticks(), toTake);

				// Pleon to kaloume ayto mesa apo thn methodo
                // System.out.println("CPU takes " + take + " sticks.");

                if (Utils.evaluateEnd(sticks.getSticks())) {
                    System.out.println("You Win ! ! !");
                } else {
                    System.out.println("there are " + sticks.getSticks() + " sticks");
                    System.out.println("How many do you want to take? 1 or 2?");
					
					// Tis esvisa aytes, gia na xirisimopoihseis mia mono methodo
                    // int take = Utils.askUserForSticks();
                    // toTake = Utils.takeCheck(take);
					
					toTake = Utils.takeSticksFromUser();
                    sticks.reduceSticks(sticks.getSticks(), toTake);

                    if (Utils.evaluateEnd(sticks.getSticks())) {
                        System.out.println("You lost!");
                    }
                }
            }

        }

    }

}
