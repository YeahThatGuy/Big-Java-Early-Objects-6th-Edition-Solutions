package ch1;

import java.lang.Math.*;
import java.text.DecimalFormat;

public class P13 {

    public static void main(String[] args) {

       int piDigits = 6;

        double cut = Math.PI / Math.pow(10, -piDigits);
        double result = cut * Math.pow(10, -piDigits);
        result = Double.parseDouble(new DecimalFormat("##.######").format(result));
        
        System.out.println("Unformatted PI: " + Math.PI);
        System.out.println("PI rounded to the first 6 decimal places: " + result);
    }
}