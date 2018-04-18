package com.journal.model;
/*
Aleksandr Kuzmenko
 */
public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private int age;

    private String email;
    private String phone;
    private String nikGit;

    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNikGit() {
        return nikGit;
    }

    public void setNikGit(String nikGit) {
        this.nikGit = nikGit;
    }
}
