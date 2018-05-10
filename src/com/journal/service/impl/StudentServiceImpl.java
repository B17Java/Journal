package com.journal.service.impl;

import com.journal.model.Student;
import com.journal.repository.impl.StudentRepositoryList;
import com.journal.repository.interf.StudentRepository;
import com.journal.repository.impl.StudentRepositoryMap;
import com.journal.service.StudentService;


public class StudentServiceImpl implements StudentService {
//    private String nameF;
//    private String nameS;
//    private Student student = new Student(nameF,nameS);


    private StudentRepository studentRepositoryMap = new StudentRepositoryMap();
    private StudentRepository studentRepositoryList = new StudentRepositoryList();



    @Override
    public boolean create(Student student) {
        this.studentRepositoryMap.create(student);
        return true;
    }

    @Override
    public Student read(Integer id) {
        return this.studentRepositoryMap.read(id);
    }

    @Override
    public boolean update(Student student) {
        this.studentRepositoryMap.update(student);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        this.studentRepositoryMap.delete(id);
        return true;
    }
}
