package com.example.bmicalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BMICalculatorTest {

    @Test
    public void testBMICalculation() {
        float weight = 92;
        float height = 190;
        float expectedBMI = 25.484766f;

        float calculatedBMI = BMICalculator.calculateBMI(weight, height);

        assertEquals(expectedBMI, calculatedBMI, 0.001f);
    }
}
