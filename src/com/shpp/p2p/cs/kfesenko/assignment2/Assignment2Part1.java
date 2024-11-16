package com.shpp.p2p.cs.kfesenko.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    public void run() {
        calculateTheEquation();
    }

    /**
     * Prompts the user to input coefficients for a quadratic equation
     * and calculates the roots based on the discriminant.
     */
    private void calculateTheEquation() {
        double a = readInt("Please enter a:");
        double b = readInt("Please enter b:");
        double c = readInt("Please enter c:");

        // Check if a is zero to ensure it's a quadratic equation
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero in a quadratic equation.");
            return;
        }

        // Calculate the discriminant
        double discriminant = calculateDiscriminant(a, b, c);
        // Print the roots based on the value of the discriminant
        printRoots(a, b, discriminant);
    }

    /**
     * Calculates the discriminant of the quadratic equation.
     *
     * @param a Coefficient a of the equation.
     * @param b Coefficient b of the equation.
     * @param c Coefficient c of the equation.
     * @return The calculated discriminant.
     */
    private double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    /**
     * Determines and prints the roots of the quadratic equation
     * based on the value of the discriminant.
     *
     * @param a            Coefficient a of the equation.
     * @param b            Coefficient b of the equation.
     * @param discriminant The discriminant of the equation.
     */
    private void printRoots(double a, double b, double discriminant) {
        if (discriminant < 0) {
            // If the discriminant is negative, there are no real roots
            System.out.println("There are no real roots.");
        } else if (discriminant == 0) {
            // If the discriminant is zero, there is one real root
            double root = -b / (2 * a);
            System.out.println("There is one root: " + root);
        } else {
            // If the discriminant is positive, there are two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("There are two roots: " + root1 + " and " + root2);
        }
    }
}
