package com.test.test10;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {


    //    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHf", Money.franc(1).currency());
    }

    @Test
    public void multiplication(){
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10,"USD"),five.times(2));
        assertEquals(new Dollar(15,"USD"),five.times(3));
    }
    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(new Dollar(5,"USD").equals(new Dollar(5,"USD")));
        assertFalse(new Dollar(5,"USD").equals(new Dollar(6,"USD")));
        assertTrue(new Franc(5,"CHf").equals(new Franc(5,"CHf")));
        assertFalse(new Franc(5,"CHf").equals(new Franc(6,"CHf")));
        assertFalse(new Franc(5,"CHf").equals(Money.dollar(5)));
    }
    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));
    }

}