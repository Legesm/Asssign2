package com.shpp.p2p.cs.srentiuk.assignment2;


import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 800;

    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 4;
    private static final int NUM_COLS = 8;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    //Draw the grid
    public void run() {
        drawBoxes(NUM_ROWS, NUM_COLS);
    }
    //Draw row of boxes
    private void drawBoxes(int rows, int cols) {
        for (int i=0; i<NUM_ROWS; i++){
            drawRowOfBoxes(i, cols);
        }
    }

    //Draw boxes in row
    private void drawRowOfBoxes(int rowNumber,int cols) {
        for (int i=0; i<NUM_COLS; i++){
            drawBox(rowNumber,i);
        }
    }

    private void drawBox(int rowNumber, int colNumber) {
        double offsetX = (getWidth()-NUM_COLS * BOX_SIZE-(NUM_COLS-1)*BOX_SPACING)/2.0;//offset in X axis
        double offsetY = (getHeight()-NUM_ROWS * BOX_SIZE-(NUM_ROWS-1)*BOX_SPACING)/2.0;//offset in Y axis
        GRect box;
        box = new GRect(
                offsetX + colNumber*(BOX_SIZE+BOX_SPACING),//Each time a box is created in a row by drawRowOfBoxes(int rowNumber,int cols), it is pushed along the X-axis for colNumber*(BOX_SIZE+BOX_SPACING) pixels
                offsetY + rowNumber*(BOX_SIZE+BOX_SPACING),//Each time a row of boxes is created by drawBoxes(int rows, int cols), it is pushed along the Y axis for rowNumber*(BOX_SIZE+BOX_SPACING) pixels
                BOX_SIZE,
                BOX_SIZE
        );
        box.setFilled(true);
        box.setFillColor(Color.BLACK);
        add(box);
    }
}
