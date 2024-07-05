
package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
        assertEquals(5, calculator.add(2, 3));
        assertEquals(100, calculator.add(50, 50));
    }
}