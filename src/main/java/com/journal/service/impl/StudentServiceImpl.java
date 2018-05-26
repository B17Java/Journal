package com.journal.service.impl;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Student;
import com.journal.repository.StudentRepository;
import com.journal.repository.impl.StudentRepositoryMap;
import com.journal.service.StudentService;
import com.journal.validator.Validador;

import java.util.List;


public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepositoryMap = new StudentRepositoryMap();

    @Override
    public boolean create(Student student) throws IncorrectInputException {
            Validador.validateText(student.getFirstName());
            Validador.validateText(student.getLastName());
            if(student.getEmail() != null){
                Validador.validateEmailAddress(student.getEmail());
            }
            if(student.getPhone() != null){
                Validador.validateMobileNumber(student.getPhone());
            }
            this.studentRepositoryMap.create(student);
            return true;
    }

    @Override
    public boolean create(String name, String secondName) throws IncorrectInputException {
        return create(new Student.Builder(name , secondName).builder());
    }

    @Override
    public Student read(Integer id) {
         return this.studentRepositoryMap.read(id);
    }

    @Override
    public List<Student> getAll() {
        return studentRepositoryMap.findAll();
    }

    @Override
    public boolean update(Student student) {
        try {
           Validador.validateText(student.getFirstName());
           Validador.validateText(student.getLastName());
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
            this.studentRepositoryMap.delete(student);

        }else{
            return false;
        }
        return true;
    }
}
