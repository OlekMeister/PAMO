package com.example.bmicalculator;

public class BMICalculator {

    public static float calculateBMI(float weight, float height) {
        float heightInMeters = height / 100; // Convert height from CM to meters
        return weight / (heightInMeters * heightInMeters);
    }
}
