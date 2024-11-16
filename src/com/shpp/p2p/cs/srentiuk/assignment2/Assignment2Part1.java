package com.shpp.p2p.cs.srentiuk.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    /*
    Waiting for the input of a, b and c
     */
    double a = readDouble("Please enter a: ");
    double b = readDouble("Please enter b: ");
    double c = readDouble("Please enter c: ");
    //Discriminant
    double D = (b*b) - (4 * a * c);
    //println("D = (" + b +")^2 - 4 * "+a+" * "+c+" = "+D);

    public void run() {

        resultOf();

    }

    private void resultOf() {
        //Check the value of a
        if (a!=0){
            //Check the value of discriminant ( D = (b)^2 - 4 * a * c )
            if (D < 0) {
                discriminantLessThanZero();
            } else {
                discriminantMoreOrEqualToZero();
            }
        } else {
            resultOfNotSquare();
        }

    }
    //If a = 0
    private void resultOfNotSquare() {
        println("It is not square, so root is: " + (-c)/b);
    }

    //If our D < 0
    private void discriminantLessThanZero(){
        //Print this
        println("There are no real roots");
    }
    //If our D >= 0
    private void discriminantMoreOrEqualToZero(){
        println( D > 0
                //Print this if D>0
                ? "There are two roots: " + ((-b + Math.sqrt(D))/(2*a)) + " and " + ((-b - Math.sqrt(D))/(2*a))
                //Print this if D=0
                : "There is one root: " + ((-b)/(2*a))
        );
    }
}