package com.test.test07;

public class Dollar extends Money {
//    private int amount;
    Dollar(int amount) {
        this.amount = amount;
    }
    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }
    /*protected int amount;
    Dollar()
    */


}
