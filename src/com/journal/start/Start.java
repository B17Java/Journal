package com.journal.start;

import com.journal.exeption.IncorrectInputException;
import com.journal.service.TeacherService;
import com.journal.service.impl.TeacherServiceImpl;

import java.util.Scanner;

public class Start {
    public void start() throws IncorrectInputException {
        char choice;
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
            choice = data.charAt(0);
            if (choice != '0' && choice != '1' && choice != '2' && choice != '3')
                throw new IncorrectInputException("Incorrectly Input");
            if (choice == '0') break;
            if (choice == '1') System.out.println(HandleTeacher.inputData());
            if (choice == '2') System.out.println(HandleTeacher.getInfoById());
            if (choice == '3') System.out.println(HandleTeacher.deleteById());
            System.out.println("");
        }
    }




}
