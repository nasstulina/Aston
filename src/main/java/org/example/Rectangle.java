package org.example;

public class Rectangle implements Figure{
    private int a;
    private int b;
    private String borderColor;
    private String figureColor;

    public Rectangle(int a, int b, String borderColor, String figureColor){
        this.a = a;
        this.b = b;
        this.borderColor = borderColor;
        this.figureColor = figureColor;
    }

    @Override
    public double perimeter(){
        return (a + b) * 2;
    }

    @Override
    public double area(){
        return a * b;
    }

    @Override
    public void printInfo(){
        Figure.super.printInfo();
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("Цвет заливки: " + figureColor);
    }
}
