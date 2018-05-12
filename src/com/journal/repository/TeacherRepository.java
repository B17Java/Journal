package com.journal.repository;


import com.journal.model.Teacher;

public interface TeacherRepository {
    boolean create(Teacher teacher);
    Teacher read(Integer id);
    boolean update(Teacher teacher);
    boolean delete(Integer id);
    boolean delete(Teacher teacher);

}
