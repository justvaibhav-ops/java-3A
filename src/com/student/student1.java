package com.student;

public class student1 {

    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    String name;
    float marks;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public student1(int age, String name, float marks){
        this.name=name;
        this.age=age;
        this.marks=marks;


    }

    @Override
    public String toString() {
        return "student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

