package com.test.test07;

public class Money {

    protected int amount;
    Money(){

    }
    Money(int amount){
        this.amount = amount;
    }

    Money times(int multiplier){
        return new Money(amount*multiplier);
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
