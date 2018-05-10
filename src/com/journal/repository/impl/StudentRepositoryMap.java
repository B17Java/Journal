package com.journal.repository.impl;

import com.journal.model.Student;
import com.journal.repository.StudentRepository;

import java.util.HashMap;

import java.util.Map;

public class StudentRepositoryMap implements StudentRepository {
    private Map<Integer, Student> studentMap = new HashMap<>();
    private int id = 0;

    @Override
    public boolean create(Student student) {
        studentMap.put(id,student);
        student.setId(id++);
        return true;
    }

    @Override
    public Student read(Integer id) {
         return studentMap.get(id);
    }

    @Override
    public boolean update(Student student) {
         studentMap.put(student.getId(), student);
         return true;
    }

    @Override
    public boolean delete(Integer id) {
        studentMap.remove(id);
        return true;
    }

}
