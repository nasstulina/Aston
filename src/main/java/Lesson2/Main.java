package Lesson2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        printThreeWords();

        System.out.println("\nЗадание №2");
        checkSumSign();

        System.out.println("\nЗадание №3");
        printColor();

        System.out.println("\nЗадание №4");
        compareNumbers();

        System.out.println("\nЗадание №5");
        checkRange();

        System.out.println("\nЗадание №6");
        checkNumbers();

        System.out.println("\nЗадание №7");
        positiveNegativeNumbers();

        System.out.println("\nЗадание №8");
        countString();

        System.out.println("\nЗадание №9");
        year();

        System.out.println("\nЗадание №10");
        replacement();

        System.out.println("\nЗадание №11");
        fillArr();

        System.out.println("\nЗадание №12");
        multiplication();

        System.out.println("\nЗадание №13");
        diagonalElements();

        System.out.println("\nЗадание №14");
        arrLen();
    }


    /*1. Создайте метод printThreeWords(),
    который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.*/
    public static void printThreeWords() {
        String o = "Orange";
        String b = "Banana";
        String a = "Apple";
        System.out.println(o + "\n" + b + "\n" + a);
    }

    /*2. Создайте метод checkSumSign(), в теле которого объявите две int переменные
    a и b, и инициализируйте их любыми значениями, которыми захотите.
    Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    то вывести в консоль сообщение “Сумма положительная”,
    в противном случае - “Сумма отрицательная”;*/
    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /*3. Создайте метод printColor() в теле которого задайте in
    t переменную value и инициализируйте ее любым значением.
    Если value меньше 0 (0 включительно), то в консоль метод должен вывести
    сообщение “Красный”, если лежит в пределах от 0 (0 исключительно)
    до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно
    ) - “Зеленый”;*/
    public static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    /*4. Создайте метод compareNumbers(), в теле которого объявите две int переменны
    е a и b, и инициализируйте их любыми значениями, которыми захотите.
    Если a больше или равно b, то необходимо вывести в консоль
    сообщение “a >= b”, в противном случае “a < b”;*/
    public static void compareNumbers() {
        int a = 5;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

  /*5. Напишите метод, принимающий на вход два целых числа и проверяющий
  , что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
  в противном случае – false.*/

    public static void checkRange() {
        int a = 15;
        int b = 5;
        int sum = a + b;
        if (sum >= 10 & sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

  /*6. Напишите метод, которому в качестве параметра передается целое число,
  метод должен напечатать в консоль, положительное ли число передали или отрицательное.
  Замечание: ноль считаем положительным числом.*/

    public static void checkNumbers() {
        int a = -1;
        if (a < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }

/*7. Напишите метод, которому в качестве параметра передается целое число.
  Метод должен вернуть true, если число отрицательное, и вернуть false если
  положительное.
Замечание: ноль считаем положительным числом.*/

    public static void positiveNegativeNumbers() {
        int a = 0;
        if (a < 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

  /*8. Напишите метод, которому в качестве аргументов передается строка и число,
  метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

    public static void countString() {
        int a = 7;
        String b = "Super!";
        while (a > 0) {
            System.out.println(b);
            a--;
        }
    }


  /*9. Напишите метод, который определяет, является ли год високосным,
  и возвращает boolean (високосный - true, не високосный - false)
  . Каждый 4-й год является високосным, кроме каждого 100-го
  , при этом каждый 400-й – високосный.*/

    public static void year(){
        int year = 104;
        if( (year % 4 == 0 || year % 400 == 0) & year % 100 != 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

  /*10. Задать целочисленный массив, состоящий из элементов 0 и 1
  . Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
  С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void replacement(){
        int[] arr = new int[] {0, 1, 1, 0, 1, 0, 1, 1, 0 , 0};
        for(int i = 0; i < arr.length; i++){
            if(arr [i] == 0){
                arr [i] = 1;
            }
            else {
                arr [i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

  /*11. Задать пустой целочисленный массив длиной 10
  0. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/

    public static void fillArr(){
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr [i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

  /*12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
  пройти по нему циклом, и числа меньшие 6 умножить на 2;*/


    public static void multiplication(){
        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 6;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

  /*13. Создать квадратный двумерный целочисленный масс
  ив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
  заполнить его диагональные элементы единицами (можно только одну из
  диагоналей, если обе сложно). Определить элементы одной из диагоналей
  можно по следующему принципу: индексы таких элементов равны,
  то есть [0][0], [1][1], [2][2], ..., [n][n];*/

    public static void diagonalElements(){
        int[][] table = new int[5][5];

        for (int i = 0; i < table.length; i++) {
            table[i][table.length - i - 1] = 1;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][i] = 1;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

  /*14. Написать метод, принимающий на вход два аргумента: len и initialValue,
  и возвращающий одномерный массив типа int длиной le
  n, каждая ячейка которого равна initialValue*/

    public static void arrLen(){
        int len = 10;
        int initialValue = 4;
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

}