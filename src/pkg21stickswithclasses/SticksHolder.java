/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21stickswithclasses;

/**
 *
 * @author N1CO
 * Endiaferousa, kai arketa aplh klassi. Exei sygerimeno skop, kai swsto onoma. Mou aresei!
 * Omws genika, apo th stigmh pou oi metodoi edw that xrisimopoihthoun apo alles klasses, kalytera na tis kaneis 'public'.
 * Thelw genika na sou ginei synitheio na kaneis is metavlites private, kai tis metodous eite private eite public.
 */
public class SticksHolder {

    private int sticks = 21;

	// Ayth h methodos de xreiazetai, afou ksekinas me 21 sticks (des apo panw). An thes na ksanametriseis, fiakse ena kainourio SticsHolder!
    void setSticks(int amount) {
        sticks = amount;
    }

    void reduceSticks(int sticksBefore, int taken) {
        sticks = sticksBefore - taken;
    }

	// Stin apo panw methodo de xreiazontai ta 'sticksBefore'. Afou ta exeis idi! Kanti replace me aytin:
    void reduceSticks(int taken) {
        sticks -= taken;
		// to 'sticks -= taken;' einai to idio me 'sticks = sticks - taken;'
	}
	// Episis, prosekse oti den diegrapsa thn dikia sou methodo, kai paroti exoun to idio onoma, akoma doulevoun. Ki ayto epeidi exoun 
	// diaforetikes parametrous. Ayto legetai 'method overloading' sthn java.
	
    int getSticks() {
        return sticks;
    }

}
