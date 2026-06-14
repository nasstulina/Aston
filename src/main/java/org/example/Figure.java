package org.example;

public interface Figure {
    double perimeter();
    double area();

    default void printInfo(){
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
    }
}
