package com.journal.service;

import com.journal.model.Lesson;

public interface LessonServise {
    boolean create(Lesson lesson);
    Lesson read(Integer id);
    boolean update(Lesson lesson);
    boolean delete(Integer id);
    boolean delete(Lesson lesson);
}
