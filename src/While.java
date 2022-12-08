public class While {
    public static void main(String[] args) {
        //Задачи по циклу while

        // Задача 1
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 1;
        int result = 0;
        while (total <= 2459000) {
            total = total + total/100 + salary;

            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + " рублей" );
            i++;
            result = i;
        }
            System.out.println( "Результат накопления суммы 2.459.000 достигнут на "  + (result - 1) + " месяц " );

        // Задача 2
        System.out.println("Задача 2");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        for (j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }

        // Задача 3

        System.out.println();
        System.out.println("Задача 3");
        int fertilityRate = 17;
        int mortalityRate = 10;
        int population = 12000000;
        int yearsCounter = 1;
        while (yearsCounter <= 10) {
            population = population + (fertilityRate -mortalityRate) * 12000;
            System.out.println( "Год " + yearsCounter + " численность населения составляет " + population);
            yearsCounter++;
        }

        // Задача 4
        System.out.println("Задача 4");
        int sum= 15000; // Сумма накоплений
        int k = 1;      // Колличество месяцов накопления
        while (sum <= 12000000) {
            sum = sum + sum/100*7;
            System.out.println(" Месяц " + k + ", сумма накоплений равна " + sum + " рублей" );
            k++;
            result = k;
        }
        System.out.println( "Результат накопления суммы 12.000.000 достигнут на "  + (result - 1) + " месяц " );

        //Задача 5
        System.out.println("Задача 5");
        int sum2= 15000; // Сумма накоплений
        int m = 1;      // Колличество месяцов накопления
        while (sum2 <= 12000000) {
            sum2 = sum2 + sum2/100*7;
            if (m % 6 == 0) {

                System.out.println(" Месяц " + m + ", сумма накоплений равна " + sum2 + " рублей" );
            }
             m++;
             result = m;

        }
        System.out.println( "Результат накопления суммы 12.000.000 достигнут на "  + (result - 1) + " месяц " );

        // Задача 6
        System.out.println("Задача 6");
        int montchCounter = 0;
        int sixMonths = 0;
        int sum3 = 15000;
        while (montchCounter <= 108) {
            montchCounter++;
            sum3 = sum3 + sum3/100*7;
            sixMonths++;
            if (sixMonths ==6) {
                System.out.println(" Месяц " + montchCounter + ", сумма накоплений равна " + sum3 + " рублей" );
                sixMonths = 0;
            }

        }
        System.out.println(" Месяц итоговый " + montchCounter + ", сумма накоплений равна " + sum3 + " рублей" );

        // Задача 7
        System.out.println("Задача 7");
        int friday = 2;                  // Второй день месяца пятница
        int dayCounter = 31 ;            // Дней в месяце
        int daysWeek = 7;           // Счетчик дней от пятницы до пятницы
        for (int n = friday; n <= dayCounter; n++) {
                if ( daysWeek == 7) {
                    System.out.println(" Сегодня пятница, " + n + " число. Необходимо подготовить отчет");
                    daysWeek = 0;
                } daysWeek ++;
        }

        // Задача 8
        System.out.println("Задача 8");
        int ourYear = 2022;         // Наш год
        int cometArrival = 79;      // Промежуток между прилетами кометы
        int prev = ourYear - 200;   // Начальная граница времени
        int later = ourYear + 100;  // Конечная граница времени
        int g = cometArrival;
          while( g <= later ) {
              if (g >= prev && g <= later) {
                  System.out.println( g );
              }
              g = g + cometArrival;
          }

    }
}
