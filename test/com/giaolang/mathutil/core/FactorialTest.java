/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class FactorialTest {
    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        long expected=120;
        long actual= MathUtil.getFactorial(5);
        assertEquals(expected, actual);
        
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(6, MathUtil.getFactorial(3));
        
    }
    @Test (expected = IllegalArgumentException.class)
    public void checkFactorialGvenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(22);
        MathUtil.getFactorial(23);
    }
    

    
}
