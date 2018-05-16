package com.journal.model;

/*
Oleksandr Kuzmenko
 */
public class Student extends Person{


    private Student(Builder builder) {
        this.setFirstName(builder.firstName);
        this.setLastName(builder.lastName);
        this.setAddress(builder.address);
        this.setAge(builder.age);
        this.setEmail(builder.email);
        this.setPhone(builder.phone);
        this.setNikGit(builder.nikGit);
        this.setId(builder.id);
    }

    public static class Builder{
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String email;
        private String phone ;
        private String nikGit;

        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setNikGit(String nikGit) {
            this.nikGit = nikGit;
            return this;
        }
        public Student builder(){
            return new Student(this);
        }
    }
}
