package com.journal.repository.impl;

import com.journal.model.Teacher;
import com.journal.repository.TeacherRepository;

import java.util.HashMap;
import java.util.Map;

public class TeacherRepositoryMap implements TeacherRepository{
    Map<Integer, Teacher> teacherMap = new HashMap<>();
    int id;

    @Override
    public boolean create(Teacher teacher) {
        teacherMap.put(id, teacher);
        teacher.setId(id);
        id++;
        return true;
    }

    @Override
    public Teacher read(Integer id) {
        return teacherMap.get(id);
    }

    @Override
    public boolean update(Teacher teacher) {
        teacherMap.put(teacher.getId(), teacher);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        teacherMap.remove(id);
        return true;
    }
}
