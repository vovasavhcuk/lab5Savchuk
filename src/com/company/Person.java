package com.company;

public class Person {
    private String surname;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String surname, String name, int age) {
        this.surname = setSurname(surname);
        this.name = setName(name);
        this.age = setAge(age);
    }

    public String getSurname() {
        return surname;
    }

    public String setSurname(String surname) {
        this.surname = surname;
        return this.surname;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if(age < 0 || age > 130) {
            this.age = -1;
        }else{
            this.age = age;
        }
        return this.age;
    }
    public String toString(){
        return this.getName() + " " + this.getSurname() + " Возраст: " + this.getAge();
    }
}
