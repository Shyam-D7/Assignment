package com.shyam.data.app.student;

public class Student {

    public Student() {
    }

    public Student(String name, int age, String rollNo, String std) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.std = std;
    }

    private String name;
    private int age;
    private String rollNo;
    private String std;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo='" + rollNo + '\'' +
                ", std='" + std + '\'' +
                '}';
    }
}
