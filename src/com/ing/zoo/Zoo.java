package com.ing.zoo;

import com.ing.zoo.interfaces.CanPerformTricks;
import com.ing.zoo.interfaces.IsCarnivore;
import com.ing.zoo.interfaces.IsHerbivore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Zoo command line application
 * @author edited by Sander Sekreve
 */

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Animal henk = new Lion("henk", "roooaoaaaaar", "nomnomnom thx mate");
        Animal elsa = new Hippo("elsa", "splash", "munch munch lovely");
        Animal dora = new Pig("dora", "splash", "");
        Animal wally = new Tiger("wally", "rraaarww", "nomnomnom oink wubalubadubdub");
        Animal marty = new Zebra("marty", "zebra zebra", "munch munch zank yee bra");
        Animal martijn = new Crocodile("martijn", "raaarww", "Chomp chomp chomp! Ty buddy");
        Animal sander = new Cow("sander", "moo moo!", "munch munch moooo mooo");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.addAll(Arrays.asList(henk, elsa, dora, wally, marty, martijn, sander));

        Scanner scanner = new Scanner(System.in);

        // Keep asking for commands
        while(true) {
            System.out.print("Voer uw command in: ");

            String input = scanner.nextLine();

            // Handle the "hello" command
            if(input.trim().equals(commands[0])) {
                for(Animal animal : animals){
                    animal.sayHello();
                }
            // Handle the "hello [name]" command
            } else if(input.contains("hello ")) {
                String name = input.split(" ")[1];
                boolean animalFound = false;
                for(Animal animal : animals) {
                    if(animal.name.equals(name)) {
                        animal.sayHello();
                        animalFound = true;
                    }
                }
                if(!animalFound) System.out.println("There is no animal called " + name);
            // Handle the "give leaves" command
            } else if(input.equals(commands[1])) {
                for(Animal animal : animals) {
                    if(animal instanceof IsHerbivore) {
                        ((IsHerbivore) animal).eatLeaves();
                    }
                }
            // Handle the "give meat" command
            } else if(input.equals(commands[2])) {
                for(Animal animal : animals) {
                    if(animal instanceof IsCarnivore) {
                        ((IsCarnivore) animal).eatMeat();
                    }
                }
            // Handle the "perform trick" command
            } else if(input.equals(commands[3])) {
                for(Animal animal : animals) {
                    if(animal instanceof CanPerformTricks) {
                        ((CanPerformTricks) animal).performTrick();
                    }
                }
            } else {
                System.out.println("Unknown command: " + input);
            }
        }

    }
}
