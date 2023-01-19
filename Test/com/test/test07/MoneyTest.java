package com.test.test07;

import com.test.test07.Dollar;
import com.test.test07.Franc;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertTrue(new Franc(5).equals(new Dollar(5)));
    }
}