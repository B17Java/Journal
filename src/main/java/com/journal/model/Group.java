package com.journal.model;

public class Group {

    private int id;
    private String groupName;
    private int[] idStudents;
    private String startData;
    private String endData;

//    public Group(int id, String groupName, String startData, String endData) {
//        this.id = id;
//        this.groupName = groupName;
//        this.startData = startData;
//        this.endData = endData;
//    }


    public int getId() {
        return id;
    }

    public Group setId(int id) {
        this.id = id;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public Group setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public int[] getIdStudents() {
        return idStudents;
    }

    public Group setIdStudents(int[] idStudents) {
        this.idStudents = idStudents;
        return this;
    }

    public String getStartData() {
        return startData;
    }

    public Group setStartData(String startData) {
        this.startData = startData;
        return this;
    }

    public String getEndData() {
        return endData;
    }

    public Group setEndData(String endData) {
        this.endData = endData;
        return this;
    }
}
