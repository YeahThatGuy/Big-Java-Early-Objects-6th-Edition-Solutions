package ch1;

import java.lang.Math.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of PI digits: ");
        int piDigits = sc.nextInt();

        double cut = Math.PI / Math.pow(10, -piDigits);
        double result = cut * Math.pow(10, -piDigits);
        result = Double.parseDouble(new DecimalFormat("##.######").format(result));
        
        System.out.println(result);
    }
}