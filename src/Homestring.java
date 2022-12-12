import java.util.Scanner;

public class Homestring {
    public static void main(String[] args) {
      task1();
      task2();
      task3();
      task4();
      task5();
      task6();
      task7();

    }
    // Задача 1
    public static void task1 () {
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    // Задача 2

    public static void task2 () {
        System.out.println("Задача 2");

        String fullName = "Ivanov Ivan Ivanovich";
        String fullmaxName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullmaxName);
    }
    // Задача 3
    public static void task3 () {
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";
        String fillOberName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника  — " + fillOberName);
    }
    // Задача 4
    public static void task4 () {
        System.out.println("Задача 4");

        Scanner scann = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scann.nextLine();
        System.out.println("Hello, " + name);
    }

    // Задача 5
    public static void task5 () {
        System.out.println("Задача 5");

        Scanner scann2 = new Scanner(System.in);
        System.out.println("Введите температуру : ");
        int airTemp = scann2.nextInt();
        System.out.println("Температура воздуха сегодня: " + airTemp + " градусов.");

    }
    // Задача 6
    public static void task6 () {
        System.out.println("Задача 6");

        Scanner scann3 = new Scanner(System.in);
        System.out.println("Введите год : ");
        int year = scann3.nextInt();
        System.out.println("Введите месяц : ");
        int month = scann3.nextInt();
        System.out.println("Введите день : ");
        int day = scann3.nextInt();
        System.out.println(day + ":" + month + ":" + year + ".");

    }
    // Задача 7
    public static void task7 () {
        System.out.println("Задача 7");

        Scanner scann4 = new Scanner(System.in);
        System.out.println("имя пользователя : ");
        String name1 = scann4.nextLine();
        System.out.println("имя помощника: ");
        String name2 = scann4.nextLine();
        System.out.println("количество сообщений : ");
        int mess = scann4.nextInt();

        System.out.println("Привет, " + name1 + "! Это твой помощник " + name2 + ".");
        System.out.println("У тебя " +  mess + " новых писем.");
    }
}
