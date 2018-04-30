package com.journal.repository;

import com.journal.model.Lesson;

public interface LessonRepository {
    boolean create (Lesson lesson);
    Lesson read (Integer id);
    boolean updete (Lesson lesson);
    boolean delete (Integer id);
}
