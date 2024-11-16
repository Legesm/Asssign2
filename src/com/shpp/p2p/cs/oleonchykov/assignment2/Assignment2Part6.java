package com.shpp.p2p.cs.oleonchykov.assignment2;


import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

import static java.awt.Color.*;

public class Assignment2Part6 extends WindowProgram {

    // Constant defining the size of each segment (oval)
    private static final double SEGMENT_SIZE = 50;
    // Number of caterpillar segments
    private static final double caterpillarSegments = 25; //Fix
    // Window width
    private static final int WIN_WIDTH = 600;
    // Window height
    private static final int WIN_HEIGHT = 300;

    // Variables for positioning the segments
    static double SEGMENT_CENTER_Y; //Y center of window
    static double SEGMENT_Y; //random Y
    double lastSegmentX; //Last segment Y for AddEyes method
    double lastSegmentY; //Last segment Y for AddEyes method

    public void run() {
        //Set Name of Window
        setTitle("Part 6 - Caterpillars");
        // Set the window size
        setSize(WIN_WIDTH, WIN_HEIGHT);
        // Initial X position for the first segment
        double SegmentX = 20;
        // Calculate the center Y position of the segments
        SEGMENT_CENTER_Y = (getHeight() - SEGMENT_SIZE) / 2;
        // Calculate Y offset for alternating positions
        SEGMENT_Y = SEGMENT_SIZE / 2.0;


        // Loop to create caterpillar segments
        for (int i = 0; i < caterpillarSegments; i++) {
            // Check if the segment index is even or odd to alternate Y position
            if ((i % 2) == 0) {
                createCircle(i * (SegmentX),
                        SEGMENT_CENTER_Y - SEGMENT_Y,
                        SEGMENT_SIZE, randomColor(), green);
                // Store the position of the last segment
                lastSegmentX = i * (SegmentX);
                lastSegmentY = SEGMENT_CENTER_Y - SEGMENT_Y;
            } else {
                createCircle(i * (SegmentX),
                        SEGMENT_CENTER_Y,
                        SEGMENT_SIZE, randomColor(), green);
                // Store the position of the last segment
                lastSegmentX = i * (SegmentX);
                lastSegmentY = SEGMENT_CENTER_Y;
            }
            // Add eyes if this is the last segment
            if (i == caterpillarSegments - 1) {
                addEyes();
            }
        }
    }

    // Method to add eyes to the last segment
    public void addEyes() {
        double eyeSize = SEGMENT_SIZE / 5; // Size of the eyes
        double eyeOffsetX = SEGMENT_SIZE / 4; // Offset from the segment's edge on the X-axis
        double eyeOffsetY = SEGMENT_SIZE / 4; // Offset from the segment's edge on the Y-axis

        // Create left eye
        createCircle(lastSegmentX + eyeOffsetX,
                lastSegmentY + eyeOffsetY,
                eyeSize, WHITE, BLACK);
        // Create right eye
        createCircle(lastSegmentX + SEGMENT_SIZE - eyeOffsetX - eyeSize,
                lastSegmentY + eyeOffsetY,
                eyeSize, WHITE, BLACK);
    }

    // Method to create and add a circle
    public void createCircle(double circleX,
                             double circleY,
                             double Radius,
                             Color circleFillColor,
                             Color circleColor) {
        //Construct circle
        GOval circle = new GOval(circleX, circleY, Radius, Radius);
        //Fill of circle color
        circle.setFilled(true);
        //Set circle color
        circle.setColor(circleColor);
        // Set the fill color of the circle
        circle.setFillColor(circleFillColor);
        //Add circle
        add(circle);
    }


    // Method to generate a random color
    private Color randomColor() {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        return new Color(red, green, blue);
    }
}