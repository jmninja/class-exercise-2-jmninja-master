package com.company;

public class Circle extends Shape {

    private final double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // A = π r^2
        return PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        // P = 2πr
        return 2 * PI * radius;
    }

}
