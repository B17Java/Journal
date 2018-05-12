package com.journal;

import com.journal.model.Student;
import com.journal.service.StudentService;
import com.journal.service.impl.StudentServiceI;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Vladislav", "Kuznetsov");
        StudentService studentService = new StudentServiceI();
        studentService.create(student);
        try {
            System.out.println(studentService.read(0));
            System.out.println(studentService.delete(0));
        }catch (NullPointerException e){
            System.out.println("Not found student");
        }


    }
}
