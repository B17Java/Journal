package com.journal.service;

import com.journal.model.Teacher;

public interface TeacherService {
    boolean create(Teacher teacher);
    Teacher read(Integer id);
    boolean update(Teacher teacher);
    boolean delete(Integer id);
    boolean delete(Teacher teacher);
}
