package com.journal.repository.impl;

import com.journal.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryMap implements com.journal.repository.StudentRepository{
    Map<Integer, Student> studentMap = new HashMap<>();
    int id = 0;

    @Override
    public boolean create(Student student) {
        studentMap.put(id,student);
        student.setId(id);
        id++;
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
