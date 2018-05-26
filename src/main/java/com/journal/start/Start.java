package com.journal.start;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Student;
import com.journal.service.TeacherService;
import com.journal.service.impl.StudentServiceImpl;
import com.journal.service.impl.TeacherServiceImpl;
import com.journal.validator.Validador;

import java.util.Scanner;

public class Start {
    public void start() throws IncorrectInputException {
        int choice =0;
        TeacherService teacherService = new TeacherServiceImpl();

        while (true){
            Scanner read = new Scanner(System.in);
            System.out.println("");
            System.out.println("Make your choice");
            System.out.println("To add a teacher, press '1'");
            System.out.println("To search teacher by id, press '2'");
            System.out.println("To delete teacher, press '3'");
            System.out.println("To add random student, press '4'");
            System.out.println("Press '0' to enter");
            String data = read.nextLine();
            try {
                choice =Integer.parseInt(data);
            }
            catch (NumberFormatException e){
                e.getStackTrace();
            }

            switch (choice){
                case 0: read.close(); return;
                case 1: System.out.println(HandleTeacher.inputData());   break;
                case 2: System.out.println(HandleTeacher.getInfoById()); break;
                case 3: System.out.println(HandleTeacher.deleteById()); break;
                case 4: System.out.println(HandleTeacher.inputRandomData()); break;
                default: throw new IncorrectInputException("Incorrectly Input");
            }

            System.out.println("");
        }

    }
    public void startStudent() throws IncorrectInputException {
        StudentServiceImpl stdent = new StudentServiceImpl();
        stdent.create(Student.builder().firstName("Петро").lastName("Коробань").email("koroban@gmail.com").phone("+38-0632890611").build());
        System.out.println(stdent.read(0));


    }



}
