package com.ing.zoo;

import com.ing.zoo.interfaces.CanPerformTricks;
import com.ing.zoo.interfaces.IsCarnivore;
import com.ing.zoo.interfaces.IsHerbivore;

import java.util.Random;

/**
 * Represents a Pig
 * @author edited by Sander Sekreve
 */

public class Pig extends Animal implements IsCarnivore, IsHerbivore, CanPerformTricks {
    public String eatText;
    public String trick;

    public Pig(String name, String helloText, String eatText) {
        super(name, helloText);
        this.eatText = eatText;
    }

    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
