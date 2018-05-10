package com.journal.repository;

import com.journal.model.Student;

public interface StudentRepository {
    boolean create(Student student);
    Student read(Integer id);
    boolean update(Student student);
    boolean delete(Integer id);

}
