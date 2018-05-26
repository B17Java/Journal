package com.journal.repository;

import com.journal.model.Student;

import java.util.List;

public interface StudentRepository {
    boolean create(Student student);
    Student read(Integer id);
    boolean update(Student student);
    boolean delete(Integer id);
    boolean delete(Student student);
    List<Student> findAll();

}
