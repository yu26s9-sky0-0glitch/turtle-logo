package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas

        World world = new World(600, 600,new Color(178, 197, 197));
        Turtle turtle1 = new Turtle(world,200, -200);
        Drawer draw = new Drawer(100,100);
        draw.drawSquare(turtle1,3);
        Turtle turtle2 = new Turtle(world,-200,-200);
        draw.drawCircle(turtle2,2,80);
        Turtle turtle3 = new Turtle(world,-200,100);
        draw.drawCircleSliced(turtle3,3,80);

}}
