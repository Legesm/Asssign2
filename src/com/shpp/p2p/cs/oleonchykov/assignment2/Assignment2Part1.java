package com.shpp.p2p.cs.oleonchykov.assignment2;
//Коментарии
import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {

    public void run() {
        double a = readDouble("Input A: ");
        double b = readDouble("Input B: ");
        double c = readDouble("Input C: ");

        double discr = (b * b) - (4 * a * c);

        if (a == 0){
            println("A cant be 0 ");
        } else {
            calcRoot(a, b, c, discr);
        }
    }
    public void calcRoot(double a, double b, double c, double discr)
    {
        if (discr > 0) {
            double root1 = (-b + Math.sqrt(discr)) / (2 * a);
            double root2 = (-b - Math.sqrt(discr)) / (2 * a);
            println("The function has two roots: " + root1 + " and " + root2);
        } else if (discr == 0) {
            double root = -b / (2 * a);
            println("The function has one root: " + root);
        } else {
            println("The function has no roots ");
        }
    }
}