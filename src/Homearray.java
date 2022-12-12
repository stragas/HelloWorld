import java.util.Arrays;

public class Homearray {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();

    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    // Задача 1
    public static void task1 () {
        System.out.println("Задача 1");

        int [] arr1 = new int[] {1, 2, 3};     //int [] arr1 = {1, 2, 3};
        double [] arr2 = {1.57, 7.654, 9.986 };
        char[] charArr = new char[]{'h','i',' ','w','o','r','l','d'};

    }
    // Задача 2
    public static void task2 () {
        System.out.println("Задача 2");

        int [] arr1 = {1, 2, 3};
        for (int j : arr1) {
            System.out.print(j + ",");
        }
        System.out.println();
        double [] arr2 = {1.57, 7.654, 9.986 };
        for (double v : arr2) {
            System.out.print(v + ",");
        }
        System.out.println();
        char[] charArr = new char[]{'h','i',' ','w','o','r','l','d'};
        for (char c : charArr) {
            System.out.print(c + ",");
        }
        System.out.println();
    }
    // Задача 3
    public static void task3 () {
        System.out.println("Задача 3");

        int [] arr1 = {1, 2, 3};
        for (int i = arr1.length-1; i >= 0; i--) {
            System.out.print(arr1[i] + ",");
        }
        System.out.println();
        double [] arr2 = {1.57, 7.654, 9.986 };
        for (int i = arr2.length-1; i >= 0; i--) {
            System.out.print(arr2[i] + ",");
        }
        System.out.println();
        char[] charArr = new char[]{'h','i',' ','w','o','r','l','d'};
        for (int i = charArr.length-1; i >= 0; i--) {
            System.out.print(charArr[i] + ",");
        }
        System.out.println();
    }
    // Задача 4
    public static void task4 () {
        System.out.println("Задача 4");
        int [] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0){
                arr1[i]++;
            }
            System.out.print(arr1[i] + ","); // Первый вариант
        }
            System.out.println();
            System.out.println(Arrays.toString(arr1)); // Второй вариант

    }
    // Задача 5
    public static void task5() {
        System.out.println("Задача 5");
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int[] arr = generateRandomArray();

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result +=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + result + " рублей");
    }

    // Задача 6
    public static void task6() {
        System.out.println("Задача 6");

        int[] arr = generateRandomArray();

        int maxElement = 0;
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
           if (maxElement < arr[i]) {
               maxElement = arr[i];
           }
           if (minElement > arr[i]) {
               minElement = arr[i];
           }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальная сумма трат за день составила " + minElement + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxElement + " рублей.");
    }

    // Задача 7

    public static void task7() {
        System.out.println("Задача 7");

        int[] arr = generateRandomArray();

        double averageAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            averageAmount +=arr[i];

        }
        averageAmount /= 30;
        System.out.println("Средняя сумма трат за день составила " + averageAmount + " рублей.");
    }

    // Задача 8

    public static void task8() {
        System.out.println("Задача 8");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }

    }
}
