package com.uecpe;

import java.util.Scanner;

public class problem3 {
    public static void main() {
        
        // Program title
        System.out.println("Problem 3: Grade Transmutator");

        // Get input from user
        Scanner stdin = new Scanner(System.in);

        System.out.print("First score:  ");
        double in_score1 = stdin.nextDouble();
        System.out.print("Second score:  ");
        double in_score2 = stdin.nextDouble();
        System.out.print("Third score:  ");
        double in_score3 = stdin.nextDouble();

        // Compute average
        int average = (int) (in_score1 + in_score2 + in_score3) / 3;
        
        System.out.println("=== === === === === ===");

        // Return grade transmutation based on given table
        if (average >= 93) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "A");
        }
        else if (average >= 90 && average <= 92) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "A-");
        }
        else if (average >= 87 && average <= 89) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "B+");
        }
        else if (average >= 83 && average <= 86) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "B");
        }
        else if (average >= 80 && average <= 82) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "B-");
        }
        else if (average >= 77 && average <= 79) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "C+");
        }
        else if (average >= 73 && average <= 76) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "C");
        }
        else if (average >= 70 && average <= 72) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "C-");
        }
        else if (average >= 67 && average <= 69) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "D+");
        }
        else if (average >= 63 && average <= 66) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "D");
        }
        else if (average >= 60 && average <= 62) {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "D-");
        }
        else {
            System.out.println("Average: " + average + "  |  " + "Grade: " + "F");
        }

        // Release memory resources
        stdin.close();

    }
}
