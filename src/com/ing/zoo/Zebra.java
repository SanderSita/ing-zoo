package com.ing.zoo;

import com.ing.zoo.interfaces.IsHerbivore;

/**
 * Represents a Zebra
 * @author edited by Sander Sekreve
 */

public class Zebra extends Animal implements IsHerbivore {
    public String eatText;

    public Zebra(String name, String helloText, String eatText) {
        super(name, helloText);
        this.eatText = eatText;
    }

    public void eatLeaves() {
        System.out.println(eatText);
    }
}
