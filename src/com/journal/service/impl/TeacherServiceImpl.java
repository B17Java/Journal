package com.journal.service.impl;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Teacher;
import com.journal.repository.impl.TeacherRepositoryFileVlad;
import com.journal.service.TeacherService;
import com.journal.validator.Validador;

public class TeacherServiceImpl implements TeacherService {

    TeacherRepositoryFileVlad teacherRepositoryFile = new TeacherRepositoryFileVlad();

    @Override
    public boolean create(Teacher teacher) {
        try {
            Validador.stringValid(teacher.getFirstName());
            Validador.stringValid(teacher.getLastName());
            teacherRepositoryFile.create(teacher);
        } catch (IncorrectInputException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Teacher read(Integer id) {
        Teacher teacher = null;
        if(id > 0){
            try {
                Validador.numberValid(Integer.toString(id));
                teacher = teacherRepositoryFile.read(id);
            } catch (IncorrectInputException e) {
                e.printStackTrace();
            }
        }
        else new IncorrectInputException("Invalid number");
        return teacher;
    }

    @Override
    public boolean update(Teacher teacher) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if(id > 0){
            try {
                Validador.numberValid(Integer.toString(id));
                teacherRepositoryFile.delete(id);
            } catch (IncorrectInputException e) {
                e.printStackTrace();
            }
        }
        else new IncorrectInputException("Invalid number");
        return true;
    }

    @Override
    public boolean delete(Teacher teacher) {
        return false;
    }
}
