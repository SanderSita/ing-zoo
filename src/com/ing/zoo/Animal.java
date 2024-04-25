package com.ing.zoo;

/**
 * Represents an animal in the zoo.
 * This is a base class for all zoo animals.
 *
 * @author Sander Sekreve
 */

public class Animal {
    String name;
    protected String helloText;

    public Animal(String name, String helloText) {
        this.name = name;
        this.helloText = helloText;
    }

    public void sayHello() {
        System.out.println(helloText);
    }
}
