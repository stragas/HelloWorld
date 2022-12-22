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
        // 1. Вывводим все данные о сотрудниках
        private static void printAllEmployees() {
            for (Employee employee : employees) {
                System.out.println(employee);
            }   System.out.println("");
        }

        // 2. Посчитать сумму затрат на зарплаты в месяц.
        private static  void printSumSalary() {

               double sum = 0;
         for (Employee employee : employees) {
            if (employees != null){
                sum = sum + employee.getSalary();
            }

         }
        System.out.println(sum);
        }

        // 3.Найти сотрудника с минимальной зарплатой.
        double min = employees[1].getSalary();
        String minSalary = employees[1].getFullName();
        for (Employee employee : employees) {
            if ( min > employee.getSalary()){
                min = employee.getSalary();
                minSalary = employee.getFullName();
            }
        }
        System.out.println(min + " " + minSalary);

        // 4.Найти сотрудника с максимальной зарплатой.
        double max = employees[1].getSalary();
        String maxSalary = employees[1].getFullName();
        for (Employee employee : employees) {
            if ( max < employee.getSalary()){
                max = employee.getSalary();
                maxSalary = employee.getFullName();
            }
        }
        System.out.println(max + " " + maxSalary);

        // 5.Подсчитать среднее значение зарплат.
        double sum2 = 0;
        int i = 0;
        for (Employee employee : employees) {
            sum2 = sum2 + employee.getSalary();
            i++;
        }
        System.out.println(sum2/i);

        // 6. Получить Ф. И. О. всех сотрудников.
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }

    }
}
