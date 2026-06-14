package org.example;

public class Triangle implements Figure{
    private int a;
    private int b;
    private int c;
    private String borderColor;
    private String figureColor;

    public Triangle(int a, int b, int c, String borderColor, String figureColor){
        this.a = a;
        this.b = b;
        this.c = c;
        this.borderColor = borderColor;
        this.figureColor = figureColor;
    }

    @Override
    public double perimeter(){
        return a + b + c;
    }

    @Override
    public double area(){
        double p = (a + b +c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void printInfo(){
        Figure.super.printInfo();
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("Цвет заливки: " + figureColor);
    }
}
