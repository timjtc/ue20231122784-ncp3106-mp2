package com.uecpe;

import java.util.Scanner;

public class problem1 {
    public static void main() {

        // Program title
        System.out.println("Arabic Numeral to Roman Numeral Converter");

        // Store latin digit equivalents to an array for convinient access
        String latinOnes[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String latinTens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

        // Get input from user
        Scanner stdin = new Scanner(System.in);
        System.out.print("Input a number (1-100):  ");
        int input = stdin.nextInt();

        // Separate ones and tens digit
        int digitTens = (int) Math.floor(input / 10);
        int digitOnes = (int) input - (digitTens * 10);

        // Concatenate roman numerals based on specific conditions
        if ((input > 100) || (input < 1)) {
            System.out.println("Invalid number!");
        }
        else if (input > 9) {
            System.out.println("Roman numeral equivalent: " + latinTens[digitTens] + latinOnes[digitOnes]);
        }
        else {
            System.out.println("Roman numeral equivalent: " + latinOnes[digitOnes]);
        }

        // Release memory resources
        stdin.close();

    }
}
