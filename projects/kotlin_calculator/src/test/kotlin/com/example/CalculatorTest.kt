package com.example

import org.junit.Test
import org.junit.Assert.*

class CalculatorTest {

    @Test
    fun testAdd() {
        val calculator = Calculator()
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }
}