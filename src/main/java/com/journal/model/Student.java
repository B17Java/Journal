package com.journal.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

/*
Oleksandr Kuzmenko
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Student {
    int id;
    @NonNull
    String firstName;
    @NonNull
    String lastName;
    int age;
    String address;
    String email;
    String phone;
    String nikGit;

}
