package com.company;

public class Dog extends Pet {

    Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "BARK";
    }
}
