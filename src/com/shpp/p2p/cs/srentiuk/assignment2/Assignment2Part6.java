package com.shpp.p2p.cs.srentiuk.assignment2;


import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {
    //Number of segments
    private static final int NUM_OF_OVALS = 40;
    //Diameter of the segment
    private static final double OVAL_SIZE = 40;

    public static final double APPLICATION_WIDTH = 500;
    public static final double APPLICATION_HEIGHT = 100;

    //Draw the Caterpillar
    public void run() {
        drawCaterpillar(NUM_OF_OVALS);
    }

    //Cycle for drawing segments
    private void drawCaterpillar(int numberOfOvals) {
        for (int i=0; i < NUM_OF_OVALS; i++){
            drawSegment(i);
        }
    }

    //Draw and place the segment
    private void drawSegment(int numberOfSegment) {
        //I use Math.sin() to position segment in Y axis and take 15deg for start degree . Every time segment is created,it pushed along the Y-axis for (offsetY*OVAL_SIZE) pixels
        double offsetY = Math.sin(Math.toRadians(15*numberOfSegment));
        GOval segment;
        segment= new GOval(
                numberOfSegment*OVAL_SIZE/2.0,
                getHeight()/2.0 + offsetY*OVAL_SIZE,
                OVAL_SIZE,
                OVAL_SIZE
        );
        segment.setFilled(true);
        segment.setFillColor(Color.PINK);
        segment.setColor(Color.BLACK);
        add(segment);
    }
}
