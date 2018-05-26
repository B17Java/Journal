package com.journal.service;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Teacher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface TeacherService {
    boolean create(Teacher teacher);
    Teacher read(Integer id);
    boolean update(Teacher teacher);
    boolean delete(Integer id);
    boolean delete(Teacher teacher);


}
