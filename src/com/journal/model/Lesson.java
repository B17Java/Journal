package com.journal.model;

public class Lesson {
    private long id;
    private String lessonName;
    private Room lessonRoom;
    private long idGroup;

    public Lesson(long id, String lessonName) {
        this.id = id;
        this.lessonName = lessonName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Room getLessonRoom() {
        return lessonRoom;
    }

    public void setLessonRoom(Room lessonRoom) {
        this.lessonRoom = lessonRoom;
    }

    public long getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(long idGroup) {
        this.idGroup = idGroup;
    }
}
