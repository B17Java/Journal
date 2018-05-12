package com.journal.start;

import com.journal.model.Student;
import com.journal.service.StudentService;
import com.journal.service.impl.StudentServiceImpl;

public class Start {
    public void start(){
        Student student = new Student("Vladislav", "Kuznetsov");
        StudentService studentService = new StudentServiceImpl();
        studentService.create(student);
        try {
            System.out.println(studentService.read(0));
            System.out.println(studentService.delete(0));
        }catch (NullPointerException e){
            System.out.println("Not found student");
        }
    }
}
