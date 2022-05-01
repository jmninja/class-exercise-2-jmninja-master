package com.company;

import java.awt.*;

public class Rectangle extends Shape {
    private final double width, length; //sides


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        // A = w * l
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }
}
