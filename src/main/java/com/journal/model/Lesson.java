package com.journal.model;

public class Lesson {
    private int id;
    private String lessonName;
    private Room lessonRoom;
    private int idGroup;

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", lessonName='" + lessonName + '\'' +
                ", lessonRoom=" + lessonRoom +
                ", idGroup=" + idGroup +
                '}';
    }

    public Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
}
