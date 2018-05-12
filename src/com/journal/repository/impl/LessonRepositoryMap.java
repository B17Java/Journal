package com.journal.repository.impl;

import com.journal.model.Lesson;
import com.journal.repository.LessonRepository;

import java.util.HashMap;
import java.util.Map;

public class LessonRepositoryMap implements LessonRepository {
        Map<Integer, Lesson> lessonMap = new HashMap<>();
        private int id = 0;

        @Override
        public boolean create(Lesson lesson) {
            lessonMap.put(id, lesson);
            lesson.setId(id++);
            return true;
        }

        @Override
        public Lesson read(Integer id) {
            return lessonMap.get(id);
        }


    @Override
        public boolean update(Lesson lesson) {
            lessonMap.put(lesson.getId(), lesson);
            return true;
        }

        @Override
        public boolean delete(Integer id) {
            lessonMap.remove(id);
            return true;
        }
}





