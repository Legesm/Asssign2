package com.shpp.p2p.cs.oleonchykov.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

import static java.awt.Color.*;

public class Assignment2Part5 extends WindowProgram {

    // The number of rows and columns in the grid, respectively
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    // The width and height of each box
    private static final double BOX_SIZE = 40;

    // The horizontal and vertical spacing between the boxes
    private static final double BOX_SPACING = 10;

    // Window dimensions
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 800;


    public void run() { //Main method
        //Set Name of Window
        setTitle("Part 5 — Another optical illusion");
        // Set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Calculate the total width and height of the grid including the spacing
        double matrixWigth = NUM_COLS * BOX_SIZE + (NUM_COLS - 1) * BOX_SPACING; //Fix
        double matrixHeight = NUM_ROWS * BOX_SIZE + (NUM_ROWS - 1) * BOX_SPACING;

        // Calculate the starting x and y coordinates to center the grid
        double rectStartX = (getWidth() - matrixWigth) / 2;
        double rectStartY = (getHeight() - matrixHeight) / 2;

        // Method to draw the grid of boxes
        for (int curentRow = 0; curentRow < NUM_ROWS; curentRow++) {
            for (int curentColm = 0; curentColm < NUM_COLS; curentColm++) {

                rectQ(rectStartX + (curentColm * (BOX_SPACING + BOX_SIZE)), // Calculate the x
                        rectStartY + (curentRow * (BOX_SPACING + BOX_SIZE)),  //and y position for each box
                        BLACK); //Set box color
            }
        }
    }

    // Create and draw a black-filled rectangle (box)
    private void rectQ(double x, double y, Color stripColor) {
        // Create a rectangle with the specified dimensions and color
        GRect rect = new GRect(x, y, BOX_SIZE, BOX_SIZE);
        // Set the color of the stripe
        rect.setColor(stripColor);
        // Fill the rectangle with the color
        rect.setFilled(true);
        // Add the stripe to the screen
        add(rect);
    }
}
