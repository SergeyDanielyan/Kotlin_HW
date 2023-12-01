package com.company;

public class Cat extends Pet {
    Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "MEOW";
    }
}
