package com.example.bmicalculator;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class BmiCalculatorTest {
    @Test
    public void bmicalculatortest(){
        //given
        String height = "190";
        String weight = "92";
        String expectedBMI = "25,5";

        //when
        String bmi = BmiCalculator.CalculateBMI(height, weight);
        //then
        Assert.assertEquals(expectedBMI, bmi);
    }

}