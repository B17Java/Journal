package com.journal.service.impl;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Lesson;
import com.journal.repository.impl.LessonRepositoryMap;
import com.journal.service.LessonServise;
import com.journal.validator.Validador;

public class LessonServiseImpl implements LessonServise {

    LessonRepositoryMap lessonRepositoryMap = new LessonRepositoryMap();
    @Override
    public boolean create(Lesson lesson) {
        try {
            Validador.stringValid(lesson.getLessonName());
            lessonRepositoryMap.create(lesson);
        } catch (IncorrectInputException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Lesson read(Integer id) {
        return this.lessonRepositoryMap.read(id);
    }

    @Override
    public boolean update(Lesson lesson) {
        try{
            Validador.stringValid(lesson.getLessonName());
            this.lessonRepositoryMap.update(lesson);
        }
        catch (IncorrectInputException e){
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        if(lessonRepositoryMap.read(id).getId() == id) {
            this.lessonRepositoryMap.delete(id);
        }else{
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(Lesson lesson) {
        if (lessonRepositoryMap.read(lesson.getId()).getId() == lesson.getId()){
            this.lessonRepositoryMap.delete(lesson);
        }else {
            return false;
        }
        return true;
    }
}
