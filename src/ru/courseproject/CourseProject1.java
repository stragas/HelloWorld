package ru.courseproject;

public class CourseProject1 {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees = new Employee[]{
                new Employee("Горбунов Игорь Матвеевич", 2, 35415),
                new Employee("Глухова Елена Вадимовна", 1, 55492),
                new Employee("Круглова Вера Максимовна", 1, 66941),
                new Employee("Свешникова Мария Никитична", 4, 57849),
                new Employee("Глухов Глеб Русланович", 3, 58912),
                new Employee("Латышев Ярослав Артемович", 5, 58124),
                new Employee("Александрова Вероника Марковна", 2, 55325),
                new Employee("Тимофеева Василиса Матвеевна", 3, 58212),
                new Employee("Григорьев Вячеслав Антонович", 5, 66392),
                new Employee("Иванов Игорь Геннадьевич", 4, 77323)
        };


        printAllEmployees();
        double sum = printSumSalary();
            System.out.println(sum);
        System.out.println("Минимальная зарплата у сотрудника - " + printMinSalary());
        System.out.println("Максимальная зарплата у сотрудника - " + printMaxSalary());
        double result = printMidlSalary();
            System.out.println(result);
        printFullName();
    }


        // 1. Вывводим все данные о сотрудниках
        private static void printAllEmployees() {
            for (Employee employee : employees) {
                System.out.println(employee);
            }   System.out.println("");
        }

        // 2. Посчитать сумму затрат на зарплаты в месяц.
        private static double printSumSalary() {
               double sum = 0;
         for (Employee employee : employees) {
            if (employees != null){
                sum = sum + employee.getSalary();
            }
         }
         return sum;
        }

        // 3.Найти сотрудника с минимальной зарплатой.
        private static  Employee printMinSalary() {
            int temp = employees[1].getId();
            double min = employees[1].getSalary();

            for (Employee employee : employees) {
                if (min > employee.getSalary()) {
                    min = employee.getSalary();
                    temp = employee.getId() - 1;
                }
            }
            return employees[temp];
        }
        // 4.Найти сотрудника с максимальной зарплатой.
        private static Employee printMaxSalary() {
            int temp = employees[1].getId();
            double max = employees[1].getSalary();

            for (Employee employee : employees) {
                if (max < employee.getSalary()) {
                    max = employee.getSalary();
                    temp = employee.getId() - 1;
                }
            }
            return employees[temp];
        }


        // 5.Подсчитать среднее значение зарплат.

        private static  double printMidlSalary() {
            double sum2 = 0;
            int i = 0;
            for (Employee employee : employees) {
                sum2 = sum2 + employee.getSalary();
                i++;
            }
            return (sum2 / i);
        }

        // 6. Получить Ф. И. О. всех сотрудников.

        private static  void printFullName() {
            for (Employee employee : employees) {
                System.out.println(employee.getFullName());
            }
        }



}
