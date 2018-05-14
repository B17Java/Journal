package com.journal.model;

public class Teacher extends Person {
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Teacher(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
