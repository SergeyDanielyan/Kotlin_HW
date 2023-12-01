package com.company;

public class Square extends Point {
    // Длина стороны
    double side;

    Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
        area = side * side;
    }
}
