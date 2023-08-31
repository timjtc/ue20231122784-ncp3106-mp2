package com.uecpe;

import java.util.Scanner;

public class problem4 {
    public static void main() {
        
        // Program title
        System.out.println("Problem 3: Discount Calculator");

        // Get input from user
        Scanner stdin = new Scanner(System.in);

        System.out.print("Purchase quantity:  ");
        double in_qty = stdin.nextDouble();
        double discount = 0.0;
        double price = 888.0;
        
        System.out.println("=== === === === === ===");

        // Compute discount based on qty
        if (in_qty >= 100) {
            discount = 0.5;
        }
        else if (in_qty >= 50 && in_qty <= 99) {
            discount = 0.4;
        }
        else if (in_qty >= 20 && in_qty <= 49) {
            discount = 0.3;
        }
        else if (in_qty >= 10 && in_qty <= 19) {
            discount = 0.2;
        }
        else {
            discount = 0.0;
        }

        // Return output
        System.out.println("Discount: " + (discount * 100) + "%" + "  |  " + "Total: " + ((in_qty * price) - ((in_qty * price) * discount)));

        // Release memory resources
        stdin.close();

    }
}
