package com.journal.model;



public abstract class Person {


    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String email;
    private String phone;
    private String nikGit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {

        return "Person{" +
                "id=" + id +
                ",\nfirstName='" + firstName + '\'' +
                ",\nlastName='" + lastName + '\'' +
                ",\nage=" + age +
                ",\naddress='" + address + '\'' +
                ",\nemail='" + email + '\'' +
                ",\nphone='" + phone + '\'' +
                ",\nnikGit='" + nikGit + '\'' +
                '}';
    }
}

