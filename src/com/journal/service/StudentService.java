package com.journal.service;

import com.journal.model.Student;

public interface StudentService {
    boolean create(Student student);
    Student read(Integer id);
    boolean update(Student student);
    boolean delete(Integer id);
}
