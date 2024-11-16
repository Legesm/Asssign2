package com.shpp.p2p.cs.kfesenko.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {

    /* Screen width and height */
    public static final int APPLICATION_WIDTH = 1650;
    public static final int APPLICATION_HEIGHT = 800;

    /* Number of segments in the caterpillar */
    public static final int CIRCLE_COUNT = 12;

    /* Radius of each circle (segment) in the caterpillar */
    public static final double CIRCLE_RADIUS = 100;

    /* Horizontal offset between circles (overlap) */
    public static final double HORIZONTAL_SHIFT = CIRCLE_RADIUS * 1.3;

    /* Vertical shift alternation between circles */
    public static final double VERTICAL_SHIFT = CIRCLE_RADIUS / 2;

    /* Colors for alternating segments of the caterpillar */
    private static final Color[] COLORS = {Color.GREEN, Color.YELLOW, Color.CYAN, Color.MAGENTA};

    @Override
    public void run() {
        drawCaterpillar();
    }

    /**
     * Draws a caterpillar on the screen, where each segment is offset
     * horizontally and alternates vertically for a wave effect.
     */
    private void drawCaterpillar() {
        for (int i = 0; i < CIRCLE_COUNT; i++) {
            drawCaterpillarSegment(i);
        }
    }

    /**
     * Draws a single segment of the caterpillar with an alternating color and
     * position offset based on the segment index.
     *
     * @param index The index of the segment in the caterpillar.
     */
    private void drawCaterpillarSegment(int index) {
        double x = index * HORIZONTAL_SHIFT;
        double y = (index % 2 == 0) ? VERTICAL_SHIFT : 0;

        GOval segment = new GOval(x, y, CIRCLE_RADIUS * 2, CIRCLE_RADIUS * 2);
        Color fillColor = COLORS[index % COLORS.length]; // Alternate colors
        paintOval(segment, fillColor, Color.BLACK);
        add(segment);
    }

    /**
     * Fills the oval with the specified colors for fill and border.
     *
     * @param oval The GOval to be painted.
     * @param fillColor The color for the fill of the oval.
     * @param borderColor The color for the border of the oval.
     */
    private void paintOval(GOval oval, Color fillColor, Color borderColor) {
        fillObject(oval, fillColor);
        oval.setColor(borderColor);
    }

    /**
     * Colors the given fillable object with the specified fill color.
     *
     * @param obj The GFillable object to be filled.
     * @param color The color to fill the object with.
     */
    private void fillObject(GFillable obj, Color color) {
        obj.setFilled(true);
        obj.setFillColor(color);
    }
}
