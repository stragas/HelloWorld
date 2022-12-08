public class Main {
    public static void main(String[] args) {

       // Задача 1
       System.out.println("Задача 1");
         for(int i = 1; i <= 10; i++) {
             System.out.println( i );
         }

       // Задача 2
        System.out.println("Задача 2");
          for(int i = 10; i >= 1; i--) {
             System.out.println( i );
          }

        // Задача 3
        System.out.println("Задача 3");
          for( int i = 0; i <= 17; i=i+2 ) {
              System.out.println( i );
          }

        // Задача 4
        System.out.println("Задача 4");
          for(int i = 10; i >= -10; i--) {
              System.out.println( i );
          }

        // Задача 5
        System.out.println("Задача 5");
        System.out.println("Список високосных годов за период 1904 по 2096 ");
        int year = 1904;
        for (int i = year; i <= 2096; i++) {   //Определяем високосный год.
            if((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))){
                System.out.println(i + " год является високосным");
            }
        }

        // Задача 6
        System.out.println("Задача 6");
                for(int i = 7; i <= 98; i=i+7) {
                    System.out.println( i );
                }

        // Задача 7
        System.out.println("Задача 7");
                for(int i = 1; i <= 512; i=i*2) {
                         System.out.println( i );
                }

        // Задача 8
        System.out.println("Задача 8");
        int conAmount = 29000; //Взнос за месяц
        int depAmount = 0;     //Сумма накоплений
          for(int i = 1; i <= 12; i++) {
            depAmount = depAmount + conAmount;
            System.out.println( "Месяц " + i  + ", сумма накоплений равна " + depAmount  + " рублей");
          }

        // Задача 9
        System.out.println("Задача 9");
        int conAmount2 = 29000; //Взнос за месяц
        int depAmount2 = 0;     //Сумма накоплений
        int perMonth = 0;      //Процент за месяц
        for(int i = 1; i <= 12; i++) {
            depAmount2 = depAmount2 + conAmount2 + perMonth;
            perMonth = depAmount2 / 100;

            System.out.println( "Месяц " + i  + ", сумма накоплений равна " + depAmount2  + " рублей");
        }

        // Задача 10
        System.out.println("Задача 10");
        int fibo1 = 0;
        int fibo2 = 1;
        int fiboResult =1;
        for(int i = 1; i <= 11; i++) {
            System.out.println( fiboResult );
            fiboResult = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fiboResult;

        }

    }
}