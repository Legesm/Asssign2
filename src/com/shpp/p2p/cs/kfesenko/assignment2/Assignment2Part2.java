package com.shpp.p2p.cs.kfesenko.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    // Set the application window dimensions
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;

    public void run() {
        // Get the width and height of the window
        double width = getWidth();
        double height = getHeight();

        // Calculate the circle diameter based on the smaller dimension of the window
        double CIRCLE_DIAMETER = Math.min(width, height) / 3;

        // Calculate the width and height of the rectangle based on the screen width, height, and circle diameter
        double rectangleWidth = width - CIRCLE_DIAMETER;
        double rectangleHeight = height - CIRCLE_DIAMETER;

        // Add circles to the corners of the window
        createGOval(0, 0, CIRCLE_DIAMETER); // Top-left corner
        createGOval(width - CIRCLE_DIAMETER, 0, CIRCLE_DIAMETER); // Top-right corner
        createGOval(0, height - CIRCLE_DIAMETER, CIRCLE_DIAMETER); // Bottom-left corner
        createGOval(width - CIRCLE_DIAMETER, height - CIRCLE_DIAMETER, CIRCLE_DIAMETER); // Bottom-right corner

        // Add a rectangle centered between the four circles, partially overlapping them
        createGRect(
                (width - rectangleWidth) / 2,
                (height - rectangleHeight) / 2,
                rectangleWidth, rectangleHeight);
    }

    /**
     * Creates a filled black circle at the specified position with the given diameter.
     *
     * @param x        The x-coordinate of the circle's top-left corner.
     * @param y        The y-coordinate of the circle's top-left corner.
     * @param diameter The diameter of the circle.
     */
    private void createGOval(double x, double y, double diameter) {
        GOval o = new GOval(x, y, diameter, diameter);
        o.setFillColor(Color.BLACK);
        o.setFilled(true);
        add(o);
    }

    /**
     * Creates a filled white rectangle at the specified position with the given width and height.
     *
     * @param x      The x-coordinate of the rectangle's top-left corner.
     * @param y      The y-coordinate of the rectangle's top-left corner.
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    private void createGRect(double x, double y, double width, double height) {
        GRect r = new GRect(x, y, width, height);
        r.setFillColor(Color.WHITE);
        r.setFilled(true);
        r.setColor(Color.WHITE);
        add(r);
    }
}
