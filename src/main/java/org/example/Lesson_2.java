public static void main(String[] args) {
    printThreeWords();

    checkSumSign();

    printColor();

    compareNumbers();

    System.out.println(checkSumInRange(4, 6));

    printPositiveOrNegative(12);

    System.out.println(isNegative(0));

    printStringMultipleTimes("Java", 3);

    System.out.println(isLeapYear(2000));

    invertBinaryArray();

    fillArrayWithNumbers();

    doubleIfLessThanSix();

    fillMainDiagonalWithOnes();

    System.out.println(Arrays.toString(createFilledArray(5, 1)));
}

public static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
}

public static void checkSumSign() {
    int a = 5;
    int b = 10;

    if (a + b >= 0) {
        System.out.println("Сумма положительная");
    } else {
        System.out.println("Сумма отрицательная");
    }
}

public static void printColor() {
    int value = 7;

    if (value <= 0) {
        System.out.println("Красный");
    } else if (value > 0 && value <= 100) {
        System.out.println("Желтый");
    } else {
        System.out.println("Зеленый");
    }
}

public static void compareNumbers() {
    int a = 5;
    int b = 10;

    if (a >= b) {
        System.out.println("a >= b");
    } else {
        System.out.println("a < b");
    }
}

public static boolean checkSumInRange(int a, int b) {
    return (a + b >= 10) && (a + b <= 20);
}

public static void printPositiveOrNegative(int a) {
    if (a >= 0) {
        System.out.println("Положительное число");
    } else {
        System.out.println("Отрицательное число");
    }
}

public static boolean isNegative(int a) {
    if (a < 0) {
        return true;
    } else {
        return false;
    }
}

public static void printStringMultipleTimes(String a, int b) {
    for (int i = 0; i < b; i++) {
        System.out.println(a);
    }
}

public static boolean isLeapYear(int a) {
    if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
        return true;
    } else {
        return false;
    }
}

public static void invertBinaryArray() {
    int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            arr[i] = 1;
        } else {
            arr[i] = 0;
        }
    }

    System.out.println(Arrays.toString(arr));
}

public static void fillArrayWithNumbers() {
    int[] arr = new int[100];

    for (int i = 0; i < 100; i++) {
        arr[i] = i + 1;
    }

    System.out.println(Arrays.toString(arr));
}

public static void doubleIfLessThanSix() {
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) {
            arr[i] *= 2;
        }
    }

    System.out.println(Arrays.toString(arr));
}

public static void fillMainDiagonalWithOnes() {
    int[][] arr = new int[5][5];

    for (int i = 0; i < 5; i++) {
        arr[i][i] = 1;
        arr[i][4 - i] = 1;
    }

    System.out.println(Arrays.deepToString(arr));
}

public static int[] createFilledArray(int len, int initialValue){
    int[] arr = new int[len];
    for (int i = 0; i < len; i++){
        arr[i] = initialValue;
    }

    return arr;
}