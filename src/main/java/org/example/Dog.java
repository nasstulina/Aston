package org.example;

public class Dog extends Animal {
    public static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int a) {
        if (a <= 500) {
            System.out.println(name + " пробежал " + a + " м.");
        } else {
            System.out.println(name + " не может пробежать больше 500 метров");
        }
    }

    @Override
    public void swim(int a) {
        if (a <= 10) {
            System.out.println(name + " проплыл " + a + " м.");
        } else {
            System.out.println(name + " не может проплыть больше 10 метров");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}


