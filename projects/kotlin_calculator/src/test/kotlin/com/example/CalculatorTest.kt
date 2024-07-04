package com.example

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun testAdd() {
        val calculator = Calculator()
        assertEquals(5, calculator.add(2, 3))
        assertEquals(0, calculator.add(1, -1))
        assertEquals(-1, calculator.add(1, -2))
        assertEquals(100, calculator.add(50, 50))
    }
}