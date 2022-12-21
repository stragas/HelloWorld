package ru.courseproject;

public class Employee {

        private String fullName;       // ФИО
        private int depart;            // Номер отдела(1-5)
        private int salary;            // Зар.плата
        private int id;                // Номер пп сотрудника
        static int counter = 1;

        public Employee(String fullName, int depart, int salary, int id) {
                this.fullName = fullName;
                this.depart = depart;
                this.salary = salary;
                id = counter;
                counter++ ;
                this.id = id;
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


}
