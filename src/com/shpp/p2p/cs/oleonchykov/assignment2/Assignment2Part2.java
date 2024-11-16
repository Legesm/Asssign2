package com.shpp.p2p.cs.oleonchykov.assignment2;

import acm.graphics.*;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    // Variable for the size of figures that will be calculated dynamically
    private double sizeCoefficient;
    // Variable for the size of window
    int winHeight = 600;
    int winWidth = 300;

    //Main method
    public void run() {
        //Set Name of Window
        setTitle("Part 2 — Illusory contours");
        //Method for sizing window
        setSize(winWidth, winHeight);
        // We calculate the size of the figures as a percentage of the minimum window size
        sizeCoefficient = Math.min(getWidth(), getHeight()) * 0.4; // 0.4 = 40%

        double rX = sizeCoefficient / 2.0; //X coordinate of the rectangle
        double rY = sizeCoefficient / 2.0; //Y coordinate of the rectangle

        /*
          Since the diameter of the circle is equal to sizeCoefficient,
          then when we subtract this sizeCoefficient from the size of the window,
          we learn that the rectangle covers only a quarter of the circle
        */
        double rWidth = getWidth() - sizeCoefficient; //Rectangle width
        double rHeight = getHeight() - sizeCoefficient; //Rectangle width

        //Creating Circles

        createCircle(0, 0); //Creating upper left circle
        createCircle(getWidth() - sizeCoefficient, 0); //Creating upper right circle
        createCircle(0, getHeight() - sizeCoefficient); //Creating bottom left circle
        createCircle(getWidth() - sizeCoefficient, getHeight() - sizeCoefficient); //Creating bottom right circle

        createRectangle(rX, rY, rWidth, rHeight);
    }

    //Creating Circles
    private void createCircle(double circleX, double circleY) {
        //Construct circle
        GOval circle = new GOval(circleX, circleY, sizeCoefficient, sizeCoefficient);
        //Fill of circle color
        circle.setFilled(true);
        //Set circle color
        circle.setColor(Color.BLACK);
        //Add circle
        add(circle);
    }

    //Creating rectangle
    private void createRectangle(double rectX, double rectY, double rectWidth, double rectHeight) {
        //Construct rectangle
        GRect whiteRect = new GRect(rectX, rectY, rectWidth, rectHeight);
        //Fill rectangle
        whiteRect.setFilled(true);
        //Set rectangle color
        whiteRect.setColor(getBackground());
        //Add rectangle
        add(whiteRect);
    }
}

