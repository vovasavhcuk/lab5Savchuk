package com.company;

public class Student extends Person{
    private int group;
    private int studNum;

    public Student(String surname, String name, int age, int group, int studNum) {
        super(surname, name, age);
        this.group = setGroup(group);
        this.studNum = setStudNum(studNum);
    }

    public int getGroup() {
        return group;
    }

    public int setGroup(int group) {
        this.group = group;
        return this.group;
    }

    public int getStudNum() {
        return studNum;
    }

    public int setStudNum(int studNum) {
        if(studNum<10000000 || studNum > 100000000){
            this.studNum = -1;
        }
        this.studNum = studNum;
        return this.studNum;
    }

    @Override
    public String toString() {
        return this.getGroup() + " " +  super.toString() + " Номер студенческого билета: " + getStudNum();
    }
}
