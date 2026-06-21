package org.example;

public class MathCalculations {
    public static int factorial(int a){
        int f = 1;
        for (int i = 1; i <= a; i++){
            f *= i;
        }
        return f;
    }

    public static double areaTriangle(int a, int b, int c){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double calculation(int a, int b, String operation){
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> (double) a / b;
            default -> 0;
        };
    }

    public static String compareNumbers(int a, int b){
        if (a > b){
            return a + " > " + b;
        } else if (a < b){
            return a + " < " + b;
        } else {
            return a + " = " + b;
        }
    }
}
