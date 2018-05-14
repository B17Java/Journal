package com.journal;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Group;
import com.journal.model.Student;
import com.journal.service.StudentService;
import com.journal.service.impl.StudentServiceImpl;
import com.journal.start.Start;
import com.journal.validator.Validador;

public class Main {
    public static void main(String[] args) {
        Start  start = new Start();
        start.start();

    }
}
