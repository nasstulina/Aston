package org.example;

public class Circle implements Figure{
    private int r;
    private String borderColor;
    private String figureColor;


    public Circle(int r, String borderColor, String figureColor){
        this.r = r;
        this.borderColor = borderColor;
        this.figureColor = figureColor;
    }

    @Override
    public double perimeter(){

        return 2 * Math.PI * r;
    }

    @Override
    public double area(){

        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public void printInfo(){
        Figure.super.printInfo();
        System.out.println("Цвет границы: " + borderColor);
        System.out.println("Цвет заливки: " + figureColor);
    }
}
