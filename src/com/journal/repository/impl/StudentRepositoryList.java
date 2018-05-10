package com.journal.repository.impl;

import com.journal.model.Person;
import com.journal.model.Student;
import com.journal.repository.interf.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryList  implements StudentRepository{
    private List<Person> studentList = new ArrayList<>();
    private int id = 0;

    @Override
    public boolean create(Student student) {
        studentList.add(id, student);
        student.setId(id++);
        return true;
    }

    @Override
    public Student read(Integer id) {
        return null;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }


}
