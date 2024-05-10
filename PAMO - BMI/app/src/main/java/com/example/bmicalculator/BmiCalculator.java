package com.example.bmicalculator;

public class BmiCalculator {
    public static String CalculateBMI(String height, String weight){
        double w = Double.parseDouble(weight);
        double h = Double.parseDouble(height) / 100;
        double bmi = w / (h * h);
        return String.format("%.1f", bmi);
    }
}
