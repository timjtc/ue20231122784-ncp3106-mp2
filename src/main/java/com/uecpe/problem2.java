package com.uecpe;

import java.util.Scanner;

public class problem2 {
    public static void main() {
        
        // Program title
        System.out.println("Problem 2: BMI Calculator");

        // Get input from user
        Scanner stdin = new Scanner(System.in);
        System.out.print("Weight (in pounds):  ");
        double in_weight = stdin.nextDouble();
        System.out.print("Height (in inches):  ");
        double in_height = stdin.nextDouble();

        // Compute BMI
        double bmi = (in_weight * 703) / (in_height * in_height);

        // Return BMI calculation based on index value conditions
        if (bmi < 18.5) {
            System.out.println("BMI is underweight");
        }
        else if (bmi > 25) {
            System.out.println("BMI is overweight");
        }
        else {
            System.out.println("BMI is optimal");
        }

        // Release memory resources
        stdin.close();

    }
}
