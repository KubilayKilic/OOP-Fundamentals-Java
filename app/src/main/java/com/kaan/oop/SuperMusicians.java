package com.kaan.oop;

public class SuperMusicians extends Assassin {

    public SuperMusicians(String name, String surname, int age) {
        super(name, surname, age);
    }

    public String sing() {
        return "Nothing Else Matters";
    }
}
