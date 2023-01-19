package com.test.test08;

 abstract class Money {

    protected int amount;
    Money(){}

    abstract Money times(int multiplier);

    Money(int amount){
        this.amount = amount;
    }

//    Money times(int multiplier){
//        return new Money(amount*multiplier);
//    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    static Money dollar(int amount){
        return new Dollar(amount);
    }
    static Money franc(int amount){ return new Franc(amount);};
}
