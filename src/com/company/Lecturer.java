package com.company;

public class Lecturer extends Person{
    private int cafedra;
    private int salary;

    public Lecturer(String surname, String name, int age, int cafedra, int salary) {
        super(surname, name, age);
        this.cafedra = cafedra;
        this.salary = salary;
    }

    public int getCafedra() {
        return cafedra;
    }

    public int setCafedra(int cafedra) {
        this.cafedra = cafedra;
        return this.cafedra;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        if(salary<0){
            this.salary = -1;
        }
        this.salary = salary;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Преподаватель кафедры " + this.getCafedra() + " " + super.toString() + "Зарплата " + this.getSalary();
    }
}
