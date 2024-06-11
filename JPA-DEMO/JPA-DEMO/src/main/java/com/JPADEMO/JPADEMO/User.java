package com.JPADEMO.JPADEMO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {

    @Id
    @Column(name="id")
    int rollno;

    String name;

    int age;

    String mobno;

    public User(){

    }


    public User(int rollno, String name, int age, String mobno) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.mobno = mobno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }
}
