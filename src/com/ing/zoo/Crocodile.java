package com.ing.zoo;

import com.ing.zoo.interfaces.IsCarnivore;

/**
 * Represents a Crocodile
 * @author Sander Sekreve
 */

public class Crocodile extends Animal implements IsCarnivore {
    public String eatText;

    public Crocodile(String name, String helloText, String eatText) {
        super(name, helloText);
        this.eatText = eatText;
    }

    public void eatMeat() {
        System.out.println(eatText);
    }
}
