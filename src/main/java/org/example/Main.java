package org.example;

public class Main {

    static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        if (arr.length != 4) {
            throw new MyArraySizeException("Массив должен иметь длину 4");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " должна иметь ровно 4 элемента");
            }
        }

        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    a += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат данных в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        String arr[][] = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        try {
            System.out.println("Сумма значений всех ячеек: " + sumArray(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }


        int array[] = {1, 2, 3, 4};

        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
