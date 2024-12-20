package com.shpp.p2p.cs.oleonchykov.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part3 extends WindowProgram {

    /* Constants controlling the relative positions of the
     * three toes to the upper-left corner of the pawprint.
     *
     * (Yes, I know that actual pawprints have four toes.
     * Just pretend it's a cartoon animal. ^_^)
     */
    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;

    /* The position of the heel relative to the upper-left
     * corner of the pawprint.
     */
    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    /* Each toe is an oval with this width and height. */
    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    /* The heel is an oval with this width and height. */
    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    /* The default width and height of the window. These constants will tell Java to
     * create a window whose size is *approximately* given by these dimensions. You should
     * not directly use these constants in your program; instead, use getWidth() and
     * getHeight(), which return the *exact* width and height of the window.
     */
    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    //Paw color
    private static final Color PAW_COLOR = Color.BLACK;

    public void run() {
        // Set the size of the window
        setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        //Set Name of Window
        setTitle("Part 3 - Paw Prints");
        //Draw first paw
        drawPawprint(20, 20);
        //Draw second paw
        drawPawprint(180, 70);
    }

    /**
     * Draws a pawprint. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint.
     *
     * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.
     * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.
     */
    private void drawPawprint(double x, double y) {

        //Draw three toes
        //x + FIRST_TOE_OFFSET_X the horizontal position of the first toe, accounting for the offset
        //y + FIRST_TOE_OFFSET_Y the vertical position of the first toe, accounting for the offset
        //TOE_WIDTH the width of the oval
        //TOE_HEIGHT the height of the oval
        createCircle(x + FIRST_TOE_OFFSET_X, y + FIRST_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        createCircle(x + SECOND_TOE_OFFSET_X, y + SECOND_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        createCircle(x + THIRD_TOE_OFFSET_X, y + THIRD_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);

        // Draw the heel of the paw
        createCircle(x + HEEL_OFFSET_X, y + HEEL_OFFSET_Y, HEEL_WIDTH, HEEL_HEIGHT);
    }

    private void createCircle(double circleX, double circleY, double Width, double Height) {
        //Construct circle
        GOval circle = new GOval(circleX, circleY, Width, Height);
        //Fill of circle color
        circle.setFilled(true);
        //Set circle color
        circle.setColor(PAW_COLOR);
        //Add circle
        add(circle);
    }
}
