package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.*;

public class Drawer {
   private double hypotenuse;
   private int width;
   private int height;

    public Drawer(int width, int height) {
        this.width = width;
        this.height = height;
        this.hypotenuse = calculateHypotenuse();
    }

    private double calculateHypotenuse() {
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        return Math.sqrt(widthSquared + heightSquared);
    }
    public void drawSquare(Turtle turtle, int sharpness){
        turtle.setPenWidth(sharpness);
        turtle.setColor(Color.magenta);
        int side =0;
        while(side<4){
            turtle.turnRight(90);
            turtle.forward(hypotenuse);
            side++;}

    }
    public void drawCircle(Turtle turtle, int sharpness, double radius) {
        turtle.setPenWidth(sharpness);
        turtle.setColor(Color.RED);
        double stepSize = (2 * Math.PI * radius) / 36;

        int steps = 0;
        while (steps < 36) {
            turtle.forward(stepSize);
            turtle.turnRight(10); // Turn 10 degrees at a time
            steps++;
        }
    }
    public void drawCircleSliced(Turtle turtle, int sharpness, double radius) {
        turtle.setPenWidth(sharpness);
        turtle.setColor(Color.DARK_GRAY);
        double stepSize = (2 * Math.PI * radius) / 36;
        double startX = turtle.getLocation().getX();
        double startY = turtle.getLocation().getY();
        int steps = 0;
        while (steps < 27) {
            turtle.forward(stepSize);
            turtle.turnRight(10);
            steps++;
        }
        turtle.turnRight(90);
        turtle.forward(radius-6);
        turtle.turnLeft(90);
        turtle.forward(radius+6);
        turtle.penUp();
        turtle.setColor(Color.BLUE);
        turtle.goTo(startX-84,startY+(startY/1.3));
        turtle.penDown();
        int steps2 =0;
        while (steps2 < 9) {
            turtle.forward(stepSize);
            turtle.turnRight(10);
            steps2++;
        }
        turtle.turnRight(90);
        turtle.forward(radius+6);
        turtle.turnRight(90);
        turtle.forward(radius);
    }
}
