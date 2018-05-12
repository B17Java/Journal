package com.journal;

import com.journal.model.Student;
import com.journal.service.impl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Vladislav", "Kuznetsov");
        com.journal.service.StudentService studentService = new StudentServiceImpl();
        studentService.create(student);
        try {
            System.out.println(studentService.read(0));
            System.out.println(studentService.delete(0));
        }catch (NullPointerException e){
            System.out.println("Not found student");
        }


    }
}
