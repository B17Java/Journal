package com.journal.service;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Student;

import java.util.List;

public interface StudentService {
    boolean create(Student student) throws IncorrectInputException;
    boolean create(String name, String secondName) throws IncorrectInputException;
    Student read(Integer id);
    List<Student> getAll();
    boolean update(Student student);
    boolean delete(Integer id);
    boolean delete(Student student);
}
