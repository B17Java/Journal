package com.journal.model;

/*
Oleksandr Kuzmenko
 */
public class Student extends Person{

    public Student(String firstName, String lastName) {
        super(firstName, lastName);

    }

    public Student(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public Student(String firstName, String lastName, int age, String email, String phone, String nikGit) {
        super(firstName, lastName, age, email, phone, nikGit);
    }
}
