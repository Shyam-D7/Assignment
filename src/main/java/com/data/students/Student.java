package com.data.students;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    @Column(name ="student_id")
    private Long id;
    @Column(name ="student_name")
    private String name;
    @Column(name ="student_age")
    private int age;
    @Column(name ="std")
    private String std;

    public Student() {
    }

    public Student(Long id, String name, int age, String std) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.std = std;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", std='" + std + '\'' +
                '}';
    }
}
