package com.ing.zoo;

import com.ing.zoo.interfaces.CanPerformTricks;
import com.ing.zoo.interfaces.IsCarnivore;

import java.util.Random;

/**
 * Represents a Tiger
 * @author edited by Sander Sekreve
 */

public class Tiger extends Animal implements IsCarnivore, CanPerformTricks {
    public String eatText;
    public String trick;

    public Tiger(String name, String helloText, String eatText) {
        super(name, helloText);
        this.eatText = eatText;
    }

    public void eatMeat() {
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
