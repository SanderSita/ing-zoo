package com.ing.zoo;

import com.ing.zoo.interfaces.CanPerformTricks;
import com.ing.zoo.interfaces.IsHerbivore;

import java.util.Random;

/**
 * Represents a Cow
 * @author Sander Sekreve
 */

public class Cow extends Animal implements IsHerbivore, CanPerformTricks {
    public String eatText;
    public String trick;

    public Cow(String name, String helloText, String eatText) {
        super(name, helloText);
        this.eatText = eatText;
    }

    public void eatLeaves() {
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0) {
            trick = "chilling in the field";
        } else {
            trick = "walking gracefully";
        }
        System.out.println(trick);
    }
}
