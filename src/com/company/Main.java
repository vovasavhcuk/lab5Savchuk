package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Surname", "Name", 55);
        Student kozak = new Student("Sila", "Ivan", 18, 201, 12345678);
        Lecturer prepod = new Lecturer("Neznayu", "Ladno", 60, 126, 10500);
        ArrayList persons = new ArrayList();
        persons.add(person);
        persons.add(kozak);
        persons.add(prepod);
        for (int i = 0; i< persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}
