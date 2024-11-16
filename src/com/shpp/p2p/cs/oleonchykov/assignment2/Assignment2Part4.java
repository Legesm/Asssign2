package com.shpp.p2p.cs.oleonchykov.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {

    // Constants for the flag's dimensions
    private static final double FLAG_WIDTH = 100;  // Width of the flag
    private static final double FLAG_HEIGHT = 100; // Height of the flag
    private static final Color FIRST_STRIP_COLOR = Color.BLACK; // Color for the first strip (black)
    private static final Color SECOND_STRIP_COLOR = Color.YELLOW; // Color for the second strip (yellow)
    private static final Color THIR_STRIP_COLOR = Color.RED; // Color for the third strip (red)

    // Window dimensions
    private static final int WINDOW_WIDTH = 200;
    private static final int WINDOW_HEIGHT = 200;

    // This method runs the program
    public void run() {
        // Set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //Set Name of Window
        setTitle("Part 4 - Tricolor flags");
        // Calculate the starting X and Y coordinates to center the flag
        double indentationStripesX = (getWidth() - FLAG_WIDTH) / 2;
        double indentationStripesY = (getHeight() - FLAG_HEIGHT) / 2;

        // Draw the Belgium flag at the calculated position
        drawFlag(indentationStripesX, indentationStripesY);

        // Add the label for the flag in the bottom-right corner
        addFlagLabel();
    }

    // Method to draw the flag
    private void drawFlag(double x, double y) {

        // Add the three vertical stripes of the flag
        addStrip(x, y, FLAG_WIDTH / 3, FLAG_HEIGHT, FIRST_STRIP_COLOR); // Black stripe
        addStrip(x + FLAG_WIDTH / 3, y, FLAG_WIDTH / 3, FLAG_HEIGHT, SECOND_STRIP_COLOR); // Yellow stripe
        addStrip(x + 2 * FLAG_WIDTH / 3, y, FLAG_WIDTH / 3, FLAG_HEIGHT, THIR_STRIP_COLOR); // Red stripe
    }

    // Method to add a colored stripe to the flag
    private void addStrip(double x, double y, double sWidth, double sHeight, Color stripColor) {
        // Create a rectangle (stripe) with the specified dimensions and color
        GRect Stripe = new GRect(x, y, sWidth, sHeight);
        // Set the color of the stripe
        Stripe.setColor(stripColor);
        // Fill the rectangle with the color
        Stripe.setFilled(true);
        // Add the stripe to the screen
        add(Stripe);
    }

    // Method to add a label "Flag of Belgium" in the bottom-right corner
    private void addFlagLabel() {
        // Create a label with the specified text
        GLabel label = new GLabel("Flag of Belgium");
        // Set the font for the label
        label.setFont("Arial-Bold-22");

        // Get the width and height of the label to correctly position it
        double labelWidth = label.getWidth();
        double labelHeight = label.getHeight();

        // Set the location of the label in the bottom-right corner
        label.setLocation(getWidth() - labelWidth - 10, getHeight() - labelHeight - 10);

        // Add the label to the screen
        add(label);
    }
}
