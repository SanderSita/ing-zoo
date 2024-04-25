package com.ing.zoo;

import com.ing.zoo.interfaces.IsHerbivore;

/**
 * Represents a Hippo
 * @author edited by Sander Sekreve
 */

public class Hippo extends Animal implements IsHerbivore {
    public String eatText;

    public Hippo(String name, String helloText, String eatText) {
        super(name, helloText);
        this.eatText = eatText;
    }

    public void eatLeaves() {
        System.out.println(eatText);
    }
}
