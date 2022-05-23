package com.shyam.data.app.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String rollNo;
    private String std;

    public Student() {
    }

    public Student( Long id, String name, int age, String rollNo, String std) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rollNo='" + rollNo + '\'' +
                ", std='" + std + '\'' +
                '}';
    }
}


/* @Entity: Entities in JPA are nothing but POJOs representing data that can be persisted to the database.
 An entity represents a table stored in a database. Every instance of an entity represents a row in the table.
 The entity name defaults to the name of the class. We can change its name using the name element:- @Entity(name ="student")
 */
/* Each JPA entity must have a primary key that uniquely identifies it. The @Id annotation defines the primary key.
 We can generate the identifiers in different ways, which are specified by the @GeneratedValue annotation.
 */
/* @GeneratedValue will auto generate the Id variable which will be unique, if we choose not to use that annotation
   then it will accept duplicate id values, but it will override the previous id value data with the new id value data
   (operation similar to put mapping)
 */
