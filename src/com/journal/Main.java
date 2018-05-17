package com.journal;

import com.journal.exeption.IncorrectInputException;


import com.journal.model.Lesson;
import com.journal.model.Student;
import com.journal.service.LessonServise;
import com.journal.service.impl.LessonServiseImpl;
import com.journal.service.impl.StudentServiceImpl;
import com.journal.start.Start;


public class Main {
    public static void main(String[] args) throws IncorrectInputException {
        Start  start = new Start();
        start.start();
        Start student = new Start();
        student.startStudent();
    }
}
