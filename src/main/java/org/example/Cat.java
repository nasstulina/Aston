package org.example;

public class Cat extends Animal {
    boolean satiety = false;
    public static int catCount;
    public static int bowl = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int a) {
        if (a <= 200) {
            System.out.println(name + " пробежал " + a + " м.");
        } else {
            System.out.println(name + " не может пробежать больше 200 метров");
        }
    }

    @Override
    public void swim(int a) {
        System.out.println(name + " не умеет плавать");
    }

    public static int getCatCount() {

        return catCount;
    }

    public static void setBowl(int a) {
        if (a >= 0) {
            bowl += a;
        }
    }

    public void eat(int a) {
        if (bowl < a) {
            System.out.println("В миске недостаточно еды для " + name);
        } else {
            bowl -= a;
            satiety = true;
            System.out.println(name + " покушал");
        }
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Сытость: " + satiety);
    }

}
