import java.time.*;
public class Hwmetod {
    public static void main(String[] args) {

        // Задача 1 Определяем високосный год.

        System.out.println("Задача 1, високосный год");
        int ly = 2022;
        leapYear(ly);

        // Задача 2 Мобильное приложение.

        System.out.println("Задача 2, мобильное приложение");
        int osTipe = 0;                                 // iOs, 1 — Android
        androidIos(osTipe);

        // Задача 3 Способ доставки.

        System.out.println("Задача 3, Способ доставки");
        int deliveryDistance = 30;
        deliveryMethod(deliveryDistance);
    }



    public static void leapYear(int year) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
    }

    public static void androidIos(int osTipe2){
            int clientDeviceYear = 2015;                  // год создания телефона
            int currentYear = LocalDate.now().getYear(); // текущий год
            if (osTipe2 == 0) {
                System.out.println("Скачайте версию для iOs ");
            } else {
                System.out.println("Скачайте версию для Android ");
            }
            if (currentYear > clientDeviceYear) {
                System.out.print("облегченную по ссылке: ");
            } else {
                System.out.print(" по ссылке: ");
            }
    }
    public static void deliveryMethod(int deliveryDistance2) {
        int i = 20, j = 1;

        while ( i <= 100 ){
            if (deliveryDistance2 <= i){
                System.out.println("Доставка занимает " + j + " дней");
                break;
            }

            j++;
            i += 40;
        }
    }
}
