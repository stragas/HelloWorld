package ru.courseproject;

public class CourseProject1 {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees = new Employee[]{
                new Employee("Горбунов Игорь Матвеевич", 2, 65415),
                new Employee("Глухова Елена Вадимовна", 1, 55492),
                new Employee("Круглова Вера Максимовна", 1, 66941),
                new Employee("Свешникова Мария Никитична", 4, 57849),
                new Employee("Глухов Глеб Русланович", 3, 58912),
                new Employee("Латышев Ярослав Артемович", 5, 58124),
                new Employee("Александрова Вероника Марковна", 2, 55325),
                new Employee("Тимофеева Василиса Матвеевна", 3, 58212),
                new Employee("Григорьев Вячеслав Антонович", 5, 66392),
                new Employee("Иванов Игорь Геннадьевич", 4, 57323)
        };
        printAllEmployees();
        double sum = printSumSalary();
            System.out.println(sum);
        double min = printMinSalary();
            System.out.println(min);
        double max = printMaxSalary();
            System.out.println(max);
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
         }return sum;
        }

        // 3.Найти сотрудника с минимальной зарплатой.
        private static  double printMinSalary() {

            double min = employees[1].getSalary();
            String minSalary = employees[1].getFullName();
            for (Employee employee : employees) {
                if (min > employee.getSalary()) {
                    min = employee.getSalary();
                    minSalary = employee.getFullName();
                }
            }
            return min;

        }

        // 4.Найти сотрудника с максимальной зарплатой.

        private static  double printMaxSalary() {
            double max = employees[1].getSalary();
            String maxSalary = employees[1].getFullName();
            for (Employee employee : employees) {
                if (max < employee.getSalary()) {
                    max = employee.getSalary();
                    maxSalary = employee.getFullName();
                }
            }
            return max;
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
