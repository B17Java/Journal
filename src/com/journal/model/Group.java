package com.journal.model;

public class Group {

    private int id;

    private String groupName;
    private int[] idStudents;
    private String startData;
    private String endData;

    public Group(int id, String groupName, String startData, String endData) {
        this.id = id;
        this.groupName = groupName;
        this.startData = startData;
        this.endData = endData;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getStartData() {
        return startData;
    }

    public void setStartData(String startData) {
        this.startData = startData;
    }

    public String getEndData() {
        return endData;
    }

    public void setEndData(String endData) {
        this.endData = endData;
    }

}
