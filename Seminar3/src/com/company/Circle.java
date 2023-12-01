package com.company;

public class Circle extends Point {
    // Радиус
    double rad;

    Circle(double x, double y, double rad) {
        super(x, y);
        this.rad = rad;
        area = Math.PI * rad * rad;
    }
}
