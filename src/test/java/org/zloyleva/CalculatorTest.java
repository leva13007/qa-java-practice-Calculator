package org.zloyleva;

import org.junit.Assert;
import org.junit.Test;

/**
 * CalculatorTest for testing Calculator class
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        Assert.assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(-1, calculator.subtract(2,3));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    public void testDivide(){
        Assert.assertEquals(0.5, calculator.divide(2,4), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideZero(){
        calculator.divide(2,0);
    }
}
