package com.shpp.p2p.cs.srentiuk.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/*
*This program draws 2 paw prints. Each paw has 1 heel and 3 toes
 */

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
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;

    public void run() {
        drawPawprint(20, 20);
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
        drawHeel(x,y);
        drawToe(x,y);

    }

    private void drawHeel(double offsetX, double offsetY) {
        //Draw heel
        GOval heel;
        heel = new GOval(
                offsetX + HEEL_OFFSET_X,
                offsetY + HEEL_OFFSET_Y,
                HEEL_WIDTH,
                HEEL_HEIGHT
        );
        heel.setFilled(true);
        heel.setFillColor(Color.BLACK);
        add(heel);
    }

    private void drawToe(double offsetX, double offsetY) {
        //This cycle draw 3 toes
        for (int i =0; i<3; i++){
            GOval toe;
            if (i==0) {
                //First toe
                toe = new GOval(
                        offsetX + FIRST_TOE_OFFSET_X,
                        offsetY + FIRST_TOE_OFFSET_Y,
                        TOE_WIDTH,
                        TOE_HEIGHT
                );
            } else if (i==1){
                //Second toe
                toe = new GOval(
                        offsetX + SECOND_TOE_OFFSET_X,
                        offsetY + SECOND_TOE_OFFSET_Y,
                        TOE_WIDTH,
                        TOE_HEIGHT
                );
            } else {
                //Third toe
                toe = new GOval(
                        offsetX + THIRD_TOE_OFFSET_X,
                        offsetY +THIRD_TOE_OFFSET_Y,
                        TOE_WIDTH,
                        TOE_HEIGHT
                );
            }
            toe.setFilled(true);
            toe.setFillColor(Color.BLACK);
            add(toe);
        }
    }
}
