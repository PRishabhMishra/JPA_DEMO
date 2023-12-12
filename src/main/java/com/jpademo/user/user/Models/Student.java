package com.jpademo.user.user.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {

    @Id
    int id;
    String name;
    int className;
    int rollNumber;

    public Student() {
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassName() {
        return className;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
