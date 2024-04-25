package com.ing.zoo;

import com.ing.zoo.interfaces.IsCarnivore;

/**
 * Represents a Lion
 * @author edited by Sander Sekreve
 */

public class Lion extends Animal implements IsCarnivore {
    public String eatText;

    public Lion(String name, String helloText, String eatText) {
        super(name, helloText);
        this.eatText = eatText;
    }

    public void eatMeat() {
        System.out.println(eatText);
    }
}
