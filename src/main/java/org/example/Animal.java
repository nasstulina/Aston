package org.example;

public abstract class Animal {
    String name;
    public static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int a);
    public abstract void swim(int a);

}


