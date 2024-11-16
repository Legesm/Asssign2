package com.shpp.p2p.cs.kfesenko.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    /* Constants for the grid */
    private static final int NUM_ROWS = 5;        // Number of rows in the grid
    private static final int NUM_COLS = 6;        // Number of columns in the grid
    private static final double BOX_SIZE = 40;    // Size of each box in the grid
    private static final double BOX_SPACING = 10; // Space between each box

    public static final int APPLICATION_WIDTH = 700;  // Default application window width
    public static final int APPLICATION_HEIGHT = 700;  // Default application window height

    public void run() {
        drawGrid(); // Call the method to draw the grid
    }

    /**
     * Draws a grid of squares with spacing between them.
     */
    private void drawGrid() {
        // Calculate the total width and height of the grid to center it
        double gridWidth = NUM_COLS * BOX_SIZE + (NUM_COLS - 1) * BOX_SPACING;
        double gridHeight = NUM_ROWS * BOX_SIZE + (NUM_ROWS - 1) * BOX_SPACING;
        double startX = (getWidth() - gridWidth) / 2; // Calculate the starting X position
        double startY = (getHeight() - gridHeight) / 2; // Calculate the starting Y position

        // Draw the rows and columns of the grid
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                // Calculate the position of each box
                double x = startX + col * (BOX_SIZE + BOX_SPACING);
                double y = startY + row * (BOX_SIZE + BOX_SPACING);

                // Create and add a black-filled square
                GRect box = new GRect(x, y, BOX_SIZE, BOX_SIZE);
                box.setFilled(true);
                box.setColor(Color.BLACK);
                add(box);
            }
        }
    }
}
