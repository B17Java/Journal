package com.journal.service.impl;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Student;
import com.journal.repository.impl.StudentRepositoryList;
import com.journal.repository.StudentRepository;
import com.journal.repository.impl.StudentRepositoryMap;
import com.journal.service.StudentService;
import com.journal.validator.Validador;


public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepositoryMap = new StudentRepositoryMap();




    @Override
    public boolean create(Student student) {
        try {
            Validador.stringValid(student.getFirstName());
            Validador.stringValid(student.getLastName());
                this.studentRepositoryMap.create(student);

        } catch (IncorrectInputException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Student read(Integer id) {
        if(studentRepositoryMap.read(id).getId() == id)
            return this.studentRepositoryMap.read(id);
        else return null;
    }

    @Override
    public boolean update(Student student) {
        try {
           Validador.stringValid(student.getFirstName());
           Validador.stringValid(student.getLastName());
            this.studentRepositoryMap.update(student);
        } catch (IncorrectInputException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        if(studentRepositoryMap.read(id).getId() == id) {
            this.studentRepositoryMap.delete(id);

        }else{
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(Student student) {
        if(studentRepositoryMap.read(student.getId()).getId() == student.getId()) {
            this.studentRepositoryMap.delete(student.getId());

        }else{
            return false;
        }
        return true;
    }
}
