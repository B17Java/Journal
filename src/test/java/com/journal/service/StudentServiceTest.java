package com.journal.service;

import com.journal.exeption.IncorrectInputException;
import com.journal.service.impl.StudentServiceImpl;
import org.junit.Assert;
import org.junit.Test;


public class StudentServiceTest {

    StudentService studentService = new StudentServiceImpl();

    @Test
    public void createTest() throws IncorrectInputException {
        Boolean isCreated = studentService.create("Aaaa", "Bbbbb");

        Assert.assertEquals(true, isCreated);
    }


}