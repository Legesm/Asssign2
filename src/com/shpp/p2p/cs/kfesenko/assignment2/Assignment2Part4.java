package com.shpp.p2p.cs.kfesenko.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 1400; // Default window width
    public static final int APPLICATION_HEIGHT = 800; // Default window height

    // Define colors for the German flag
    private static final Color BLACK = Color.BLACK;
    private static final Color CARDINAL_RED = new Color(196, 30, 58);
    private static final Color GOLD = new Color(255, 206, 0);

    public void run() {
        double width = getWidth(); // Get current window width
        double height = getHeight(); // Get current window height

        // Determine the flag dimensions based on the smaller side of the window, maintaining 3:5 proportions
        double flagWidth = Math.min(width, height * 0.4);
        double flagHeight = flagWidth / 0.4;

        // The height of each stripe is 1/3 of the total flag height
        double stripeHeight = flagHeight / 3.3;

        // Calculate the starting position of the flag to center it in the window
        double startX = (width - flagWidth) / 2;
        double startY = (height - flagHeight) / 2;

        // Create the black stripe at the top
        createStripe(startX, startY, flagWidth, stripeHeight, BLACK);

        // Create the red stripe in the middle
        createStripe(startX, startY + stripeHeight, flagWidth, stripeHeight, CARDINAL_RED);

        // Create the yellow stripe at the bottom
        createStripe(startX, startY + 2 * stripeHeight, flagWidth, stripeHeight, GOLD);

        // Add "Flag of Germany" label below the flag in the bottom right corner
        addLabelBelowFlag("Flag of Germany", startX, startY + flagHeight, flagWidth, width, height);
    }

    /**
     * Creates a stripe with the specified color.
     *
     * @param x      The x-coordinate of the stripe's top-left corner.
     * @param y      The y-coordinate of the stripe's top-left corner.
     * @param width  The width of the stripe.
     * @param height The height of the stripe.
     * @param color  The color of the stripe.
     */
    private void createStripe(double x, double y, double width, double height, Color color) {
        GRect stripe = new GRect(x, y, width, height); // Create a rectangle for the stripe
        stripe.setFilled(true); // Set the rectangle to be filled
        stripe.setColor(color); // Set the border color
        stripe.setFillColor(color); // Set the fill color
        add(stripe); // Add the stripe to the window
    }

    /**
     * Adds a label below the flag in the bottom right corner of the window.
     *
     * @param text         The text of the label.
     * @param flagX        The x-coordinate of the flag's left side.
     * @param flagBottomY  The y-coordinate of the flag's bottom.
     * @param flagWidth    The width of the flag.
     * @param windowWidth  The width of the window.
     * @param windowHeight The height of the window.
     */
    private void addLabelBelowFlag(String text, double flagX, double flagBottomY, double flagWidth, double windowWidth, double windowHeight) {
        GLabel label = new GLabel(text);
        label.setFont("Helvetica-Bold-18"); // Set the font and size of the label
        label.setColor(Color.BLACK); // Set the label color

        // Calculate the coordinates to place the label below the flag but within the window
        double x = Math.min(flagX + flagWidth - label.getWidth() - 10, windowWidth - label.getWidth() - 10);
        double y = Math.min(flagBottomY + label.getAscent() + 10, windowHeight - label.getDescent() - 10);

        label.setLocation(x, y); // Set the label position
        add(label); // Add the label to the window
    }
}
