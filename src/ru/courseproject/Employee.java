package ru.courseproject;

public class Employee {
        private final int id;          // Номер пп сотрудника
        private String fullName;       // ФИО
        private int depart;            // Номер отдела(1-5)
        private int salary;            // Зар.плата

        private static int counter;

        public Employee(String fullName, int depart, int salary) {
                this.fullName = fullName;
                this.depart = depart;
                this.salary = salary;
                id = ++counter;

        }
        public void setFullName(String fullName) {
                this.fullName = fullName;
        }
        public String getFullName() {
                return fullName;
        }
        public int getDepart() {
                return depart;
        }
        public void setDepart(int depart) {
                this.depart = depart;
        }
        public int getSalary() {
                return salary;
        }
        public void setSalary(int salary) {
                this.salary = salary;
        }
        public int getId() {
                return id;
        }

        @Override
        public String toString() {
                return "Employee{" + "id=" + id + ", fullName='" + fullName + '\'' + ", depart=" + depart + ", salary=" + salary + '}';
        }

}
