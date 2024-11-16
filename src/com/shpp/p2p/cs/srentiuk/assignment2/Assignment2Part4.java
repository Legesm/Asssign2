package com.shpp.p2p.cs.srentiuk.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 1600;
    public static final int APPLICATION_HEIGHT = 800;

    public static final int FLAG_WIDTH = 500;
    public static final int FLAG_HEIGHT = 300;
    public static final String FLAG_NAME = "Republic of United Islands";

    public void run() {
        drawTheFlag();
    }


    //Draw the flag
    private void drawTheFlag() {
        GRect partOfFlag;
        for (int i=0; i<3;i++){
            //Each iteration of this loop creates and pushes the 1/3 part of our flag along the X axis by (FLAG_WIDTH * i / 3.0) pixels
            partOfFlag = new GRect(
                    (getWidth() - FLAG_WIDTH) / 2.0 + (FLAG_WIDTH * ( i / 3.0)),
                    (getHeight() - FLAG_HEIGHT) / 2.0,
                    FLAG_WIDTH / 3.0,
                    FLAG_HEIGHT
            );
            partOfFlag.setFilled(true);
            //Setting color of every part
            if (i==0){
                partOfFlag.setFillColor(Color.BLACK);
            } else if (i==1){
                partOfFlag.setFillColor(Color.GREEN);
            } else {
                partOfFlag.setFillColor(Color.BLACK);
            }
            add(partOfFlag);
        }
        //Write country name
        writeTheCountryName();
    }

    private void writeTheCountryName() {
        GLabel label = new GLabel(FLAG_NAME);
        label.setFont("Comic Sans-32");
        //Align the title in the lower right corner of the window
        add(label, (getWidth() - label.getWidth()), getHeight()- label.getHeight()+label.getAscent());
    }
}
