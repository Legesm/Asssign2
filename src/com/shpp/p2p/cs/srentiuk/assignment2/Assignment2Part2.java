package com.shpp.p2p.cs.srentiuk.assignment2;

import acm.graphics.GRect;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram{

    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 800;
    public static final int DIAMETER = 100;

    public void run() {
        paintOvals();//paint circle in every corner of window
        paintRectangle();//paint rectangle in the middle of window
    }

    private void paintOvals(){
        //cycle for painting circle in corners
        for (int i = 0; i<4; i++){
            GOval newOval;
            if (i==0 || i==3){
                //Draw left upper and right lower circle
                newOval = new GOval(
                        (double) i / 3 * (getWidth() - DIAMETER),
                        (double) i / 3 * (getHeight() - DIAMETER),
                        DIAMETER,
                        DIAMETER
                );
            } else {
                //Draw left lower and right upper circle
                newOval = new GOval(
                        (2 - i) * (getWidth() - DIAMETER),
                        (i - 1) * (getHeight() - DIAMETER),
                        DIAMETER,
                        DIAMETER
                );
            }
            newOval.setFilled(true);
            newOval.setFillColor(Color.BLACK);
            add(newOval);
        }
    }
    private void paintRectangle(){
        //Draw rectangle in the middle of the window
        GRect newRectangle = new GRect(
                 (double) DIAMETER /2,
                (double) DIAMETER /2,
                getWidth()-DIAMETER,
                getHeight()-DIAMETER
        );
        newRectangle.setFilled(true);
        newRectangle.setFillColor(Color.WHITE);
        newRectangle.setColor(Color.WHITE);
        add(newRectangle);
    }

}
