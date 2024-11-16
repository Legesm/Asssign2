package com.shpp.p2p.cs.kfesenko.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part3 extends WindowProgram {
    /* Constants that define the offset for the three "toes"
     * relative to the upper-left corner of the pawprint.
     *
     * (Imagine it's a cartoon character with three toes instead of four.)
     */
    private static final double FIRST_TOE_OFFSET_X = 0;      // X offset for the first toe
    private static final double FIRST_TOE_OFFSET_Y = 20;     // Y offset for the first toe
    private static final double SECOND_TOE_OFFSET_X = 30;    // X offset for the second toe
    private static final double SECOND_TOE_OFFSET_Y = 0;     // Y offset for the second toe
    private static final double THIRD_TOE_OFFSET_X = 60;     // X offset for the third toe
    private static final double THIRD_TOE_OFFSET_Y = 20;     // Y offset for the third toe

    /* Offset for the heel relative to the upper-left
     * corner of the pawprint.
     */
    private static final double HEEL_OFFSET_X = 20;          // X offset for the heel
    private static final double HEEL_OFFSET_Y = 40;          // Y offset for the heel

    /* Each "toe" is an oval with this width and height. */
    private static final double TOE_WIDTH = 20;              // Width of the toe oval
    private static final double TOE_HEIGHT = 30;             // Height of the toe oval

    /* The heel is represented by an oval with this width and height. */
    private static final double HEEL_WIDTH = 40;             // Width of the heel oval
    private static final double HEEL_HEIGHT = 60;            // Height of the heel oval

    /* Initial width and height of the program window. These constants are used
     * to create a window with approximate dimensions, but for exact sizes,
     * use getWidth() and getHeight().
     */
    public static final int APPLICATION_WIDTH = 270;         // Width of the application window
    public static final int APPLICATION_HEIGHT = 220;        // Height of the application window

    public void run() {
        // Draws two pawprints at specified coordinates
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }

    /**
     * Draws a pawprint consisting of oval "toes" and a "heel".
     * The parameters specify the upper-left corner of the bounding box
     * for the pawprint, from which the "toes" and "heel" are offset.
     *
     * @param x The x-coordinate of the upper-left corner of the bounding box for the pawprint.
     * @param y The y-coordinate of the upper-left corner of the bounding box for the pawprint.
     */
    private void drawPawprint(double x, double y) {
        // Initialize and add the first toe
        initOval(x, y, TOE_WIDTH, TOE_HEIGHT, FIRST_TOE_OFFSET_X, FIRST_TOE_OFFSET_Y);

        // Initialize and add the second toe
        initOval(x, y, TOE_WIDTH, TOE_HEIGHT, SECOND_TOE_OFFSET_X, SECOND_TOE_OFFSET_Y);

        // Initialize and add the third toe
        initOval(x, y, TOE_WIDTH, TOE_HEIGHT, THIRD_TOE_OFFSET_X, THIRD_TOE_OFFSET_Y);

        // Initialize and add the heel
        initOval(x, y, HEEL_WIDTH, HEEL_HEIGHT, HEEL_OFFSET_X, HEEL_OFFSET_Y);

    }

    /**
     * Creates and returns an oval (toe or heel) with the specified parameters.
     *
     * @param x       The x-coordinate of the upper-left corner of the bounding box for the pawprint.
     * @param y       The y-coordinate of the upper-left corner of the bounding box for the pawprint.
     * @param width   The width of the oval.
     * @param height  The height of the oval.
     * @param offsetX The x offset from the upper-left corner of the pawprint.
     * @param offsetY The y offset from the upper-left corner of the pawprint.
     */
    public void initOval(double x, double y, double width, double height, double offsetX, double offsetY) {
        // Create a new oval with the specified position and size
        GOval oval = new GOval(x + offsetX, y + offsetY, width, height);
        oval.setFilled(true);                 // Set the oval to be filled
        oval.setFillColor(Color.BLACK);       // Set the fill color to black
        add(oval);

    }
}
