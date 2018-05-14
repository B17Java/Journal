package com.journal.start;

import com.journal.exeption.IncorrectInputException;
import com.journal.service.TeacherService;
import com.journal.service.impl.TeacherServiceImpl;

import java.util.Scanner;

public class Start {
    public void start() throws IncorrectInputException {
        int choice;
        TeacherService teacherService = new TeacherServiceImpl();
        while (true){
            Scanner read = new Scanner(System.in);
            System.out.println("");
            System.out.println("Make your choice");
            System.out.println("To add a teacher, press '1'");
            System.out.println("To search teacher by id, press '2'");
            System.out.println("To delete teacher, press '3'");
            System.out.println("Press '0' to enter");
            String data = read.nextLine();
            choice =Integer.parseInt(data);
            switch (choice){
                case 0: return;
                case 1:System.out.println(HandleTeacher.inputData());   break;
                case 2:System.out.println(HandleTeacher.getInfoById()); break;
                case 3: System.out.println(HandleTeacher.deleteById()); break;
                default: throw new IncorrectInputException("Incorrectly Input");
            }

            System.out.println("");
        }
    }




}
