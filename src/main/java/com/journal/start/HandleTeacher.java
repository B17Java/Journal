package com.journal.start;

import com.journal.service.TeacherService;
import com.journal.service.impl.TeacherServiceImpl;
import com.journal.model.Teacher;
import java.util.Scanner;

public class HandleTeacher {

    private static TeacherService teacherService = new TeacherServiceImpl();
    private static Scanner read = new Scanner(System.in);
    static boolean inputData() {
        System.out.print("Input first name : ");
        String data1 = read.nextLine();
        System.out.print("Input last name : ");
        String data2 = read.nextLine();
        teacherService.create(new Teacher(data1, data2));
        return true;
    }

    static Teacher getInfoById(){
        System.out.print("Input id : ");
        int data = read.nextInt();
        return teacherService.read(data);
    }

    static boolean deleteById(){
        System.out.print("Input id : ");
        int data = read.nextInt();
        teacherService.delete(data);
        return true;
    }
    static boolean inputRandomData() {
        if(teacherService.create((Teacher)RandomPerson.randomPerson())){

            return true;
        }
        else{ return false;}
    }
}
