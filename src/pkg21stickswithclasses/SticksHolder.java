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
public class SticksHolder {

    private int sticks = 21;

    void setSticks(int amount) {
        sticks = amount;
    }

    void reduceSticks(int sticksBefore, int taken) {
        sticks = sticksBefore - taken;
    }

    int getSticks() {
        return sticks;
    }

}
