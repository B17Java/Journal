package com.journal.model;

public class Teacher extends Person {

    public Teacher(int id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    public Teacher(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String toString() {
        return getFirstName() + " " + getLastName();
    }

}
