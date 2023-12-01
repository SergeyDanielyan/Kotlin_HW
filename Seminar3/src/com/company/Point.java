package com.company;

public class Point {
    protected double x, y;
    protected double area;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
        area = 0.0;
    }

    void Display() {
        System.out.println("S = " + area + ", X = " + x + ", Y = " + y);
    }
}
