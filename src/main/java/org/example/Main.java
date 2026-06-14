package org.example;


public class Main {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Коржик");
        catsArray[1] = new Cat("Карамелька");
        catsArray[2] = new Cat("Компот");


        catsArray[0].run(250);
        catsArray[1].swim(11);

        Cat.setBowl(40);

        for (int i = 0; i < catsArray.length; i++){
            catsArray[i].eat(15);
        }

        for (int i = 0; i < catsArray.length; i++){
            catsArray[i].printInfo();
        }


        Dog dog1 = new Dog("Бобик");
        dog1.run(500);
        dog1.swim(10);

        System.out.println(Dog.getDogCount());
        System.out.println(Cat.getCatCount());
        System.out.println(Animal.getAnimalCount());


        Circle circle1 = new Circle(3, "black", "red");
        circle1.printInfo();

        Triangle triangle1 = new Triangle(4, 5, 6, "pink", "brown");
        triangle1.printInfo();

        Rectangle rectangle1 = new Rectangle(3, 4, "white", "blue");
        rectangle1.printInfo();

    }
}
