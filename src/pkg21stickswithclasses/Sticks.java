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
public class Sticks {

    private int sticks = 21;

    void setSticks(int a) {
        sticks = a;
    }

    void setSticks(int a, int b) {
        sticks = a - b;
    }

    int getSticks() {
        return sticks;
    }

}
