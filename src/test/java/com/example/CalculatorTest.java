/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example;


import org.junit.jupiter.api.*;
import org.junit.runner.manipulation.Alphanumeric;

@Tag("development")
@Tag("stable")
public class CalculatorTest {

    // we define a variable ( or an object) of the type Calculator
    private Calculator myCalculator;

    // before we start, we must initialize our Calculator
    @BeforeEach
    public void init() {
        // this is how we 'create' a new Calculator
        myCalculator = new Calculator();
    }

    @Test
    @DisplayName("My 1st JUnit 5 test! 😎 - Calculator - Addition Test")
    public void additionTest() {
        Assertions.assertEquals(5, myCalculator.add(5, 0));
    }

    @Test
    @DisplayName("My 4. JUnit 5 test! 😎 - Calculator - Addition Test")
    public void additionNegativeTest() {
        Assertions.assertNotEquals(7, myCalculator.add(5, 0));
    }

    @Test
    @DisplayName("My 2nd JUnit 5 test! 😎 - Calculator - Subtraction Test")
    public void subPositiveTest() {
        Assertions.assertEquals(5, myCalculator.subtract(9, 4));
    }

    @Test
    @DisplayName("My 3rd JUnit 5 test! 😎 - Calculator - Subtraction Test")
    public void subNegativeTest() {
        Assertions.assertNotEquals(10, myCalculator.subtract(9,8));
    }

    @Test
    @DisplayName("My 5. JUnit 5 test! 😎 - Calculator - Subtraction Test")
    public void divPositiveTest() {
        Assertions.assertNotNull(myCalculator);
        Assertions.assertEquals(2, myCalculator.subtract(4, 2));
        Assertions.assertNotEquals(1, myCalculator.divide(4, 1));
    }

    @Test
    @DisplayName("My 6. JUnit 5 test! 😎 - Calculator - Subtraction Test")
    public void divNegativeTest() {
        Assertions.assertNotEquals(3, myCalculator.divide(4,2));
    }

    @Test
    @DisplayName("My 7. JUnit 5 test! 😎 - Calculator - Subtraction Test")
    public void multiplicationPositiveTest() {
        Assertions.assertEquals(16, myCalculator.multiply(4, 4));
    }

    @Test
    @DisplayName("My 8. JUnit 5 test! 😎 - Calculator - Subtraction Test")
    public void multiplicationNegativeTest() {
        Assertions.assertNotEquals(9, myCalculator.multiply(4,2));
    }

}
